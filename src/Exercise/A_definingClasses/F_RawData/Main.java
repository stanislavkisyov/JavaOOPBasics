package Exercise.A_definingClasses.F_RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Car> cars = new LinkedList<>();
        int numberOfCars = Integer.parseInt(reader.readLine());

        while (numberOfCars-- > 0) {
            String[] carData = reader.readLine().split("\\s+");

            String model = carData[0];

            int engineSpeed = Integer.parseInt(carData[1]);
            int enginePower = Integer.parseInt(carData[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(carData[3]);
            String cargoType = carData[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            List<Tire> tires = new ArrayList<>();
            for (int i = 5; i < carData.length - 1; i += 2) {
                double tirePressure = Double.valueOf(carData[i]);
                int tireAge = Integer.parseInt(carData[i + 1]);
                Tire tire = new Tire(tirePressure, tireAge);
                tires.add(tire);
            }

            Car car = new Car(model, engine, cargo, tires);
            cars.add(car);
        }
        String command = reader.readLine();

        switch (command) {
            case "fragile":
                cars.stream().filter(car -> "fragile".equals(car.getCargo().getType()))
                        .filter(car -> car.getTires().stream().filter(tire -> tire.getPressure() < 1)
                                .collect(Collectors.toList())
                                .size() > 0).forEach(System.out::println);
                break;
            case "flamable":
                cars.stream().filter(car -> car.getCargo().getType().equals("flamable"))
                        .filter(car -> car.getEngine().getPower() > 250).forEach(System.out::println);
                break;
        }
    }
}
