package Exercise.A_definingClasses.C_OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new ArrayList<>();

        int personCount = Integer.parseInt(reader.readLine());

        for (int i = 0; i < personCount; i++) {
            String[] line = reader.readLine().split("\\s+");
            String name = line[0];
            int age = Integer.valueOf(line[1]);
            Person currentPerson = new Person(name, age);
            people.add(currentPerson);
        }

        people.stream().filter(person -> person.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(person ->
                        System.out.println(person.getName() + " - " + person.getAge()));
    }
}
