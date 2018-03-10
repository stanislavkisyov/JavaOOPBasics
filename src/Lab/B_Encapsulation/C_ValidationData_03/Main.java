package Lab.B_Encapsulation.C_ValidationData_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.valueOf(tokens[2]);
            double salary = Double.valueOf(tokens[3]);
            try {
                people.add(new Person(firstName, lastName, age, salary));
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }

        double bonus = Double.parseDouble(reader.readLine());
        for (Person person : people) {
            person.increase(bonus);
            System.out.println(person.toString());
        }
    }
}
