package Exercise.A_definingClasses.E_SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Car> cars = new LinkedHashMap<>();
        int numberOfCars = Integer.parseInt(reader.readLine());

        while (numberOfCars-- > 0) {
            String[] dataCar = reader.readLine().split("\\s+");
            String model = dataCar[0];
            double fuelAmount = Double.parseDouble(dataCar[1]);
            double pricePerKm = Double.parseDouble(dataCar[2]);
            Car car = new Car(model, fuelAmount, pricePerKm);
            cars.putIfAbsent(model, car);
        }

        String line;
        while (true) {
            if ("end".equalsIgnoreCase(line = reader.readLine())) {
                break;
            }
            try {
                String[] tokens = line.split("\\s+");
                String carModel = tokens[1];
                double distanceTraveled = Double.parseDouble(tokens[2]);
                cars.get(carModel).drive(distanceTraveled);

            } catch (IllegalStateException ise) {
                System.out.println(ise.getMessage());
            }
        }
            cars.values().forEach(System.out::println);
    }
}
