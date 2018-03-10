package Exercise.B_Encapsulation.C_AnimalFarm03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        try {
            Chicken chicken = new Chicken(name, age);
            System.out.println(String.format("Chicken %s (age %d) can produce %s eggs per day.",
                    chicken.getName(), chicken.getAge(), chicken.productPerDay()));
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}