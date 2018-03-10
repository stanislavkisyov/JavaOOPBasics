package Lab.B_Encapsulation.A_SortByNameAndAge_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
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
            people.add(new Person(firstName, lastName, age));
        }
        Collections.sort(people, (firstPerson, secondPerson) ->{
            int sComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());
            if (sComp != 0) {
                return sComp;
            } else {
                return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
            }
        });
        for (Person person : people) {
            System.out.println(person.toString());
        }

    }
}
