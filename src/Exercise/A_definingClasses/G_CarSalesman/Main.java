package Exercise.A_definingClasses.G_CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Engine> engines = new LinkedHashMap<>();

        int numberOfEngines = Integer.parseInt(reader.readLine());

        while (numberOfEngines-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");
            Engine engine = createEngine(tokens);
            engines.putIfAbsent(tokens[0], engine);
        }

        int numberOfCars = Integer.parseInt(reader.readLine());

        while (numberOfCars-- > 0) {
            String[] carsParameters = reader.readLine().split("\\s+");
            Car car = createCar(carsParameters, engines);
            System.out.println(car.toString());
        }
    }

    private static Car createCar(String[] carsParameters, Map<String, Engine> engines) {
        String model = carsParameters[0];
        Engine engine = engines.get(carsParameters[1]);

        if (carsParameters.length == 2) {
            return new Car(model, engine);
        }

        if (carsParameters.length == 4) {
            int weight = Integer.parseInt(carsParameters[2]);
            String color = carsParameters[3];
            return new Car(model, engine, weight, color);
        }

        try {
            int weight = Integer.parseInt(carsParameters[2]);
            return new Car(model, engine, weight);
        } catch (NumberFormatException e) {
            String color = carsParameters[2];
            return new Car(model, engine, color);
        }
    }

    private static Engine createEngine(String[] tokens) {
        String model = tokens[0];
        int power = Integer.parseInt(tokens[1]);
        if (tokens.length == 2) {
            return new Engine(model, power);
        }

        if (tokens.length == 4) {
            int displacement = Integer.parseInt(tokens[2]);
            String efficiency = tokens[3];
            return new Engine(model, power, displacement, efficiency);
        }

        try {
            int displacement = Integer.parseInt(tokens[2]);
            return new Engine(model, power, displacement);
        } catch (NumberFormatException e) {
            String efficiency = tokens[3];
            return new Engine(model, power, efficiency);
        }
    }
}
