package Lab.B_Encapsulation.B_SalaryIncrease_02;

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
            int age = Integer.parseInt(tokens[2]);
            double salary = Double.parseDouble(tokens[3]);
            Person person = new Person(firstName, lastName, age, salary);
            people.add(person);
        }
        double bonus = Double.parseDouble(reader.readLine());
        for (Person person : people) {
            person.increase(bonus);
            System.out.println(person.toString());
        }
    }
}
