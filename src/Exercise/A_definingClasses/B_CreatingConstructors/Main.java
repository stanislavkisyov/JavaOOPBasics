package Exercise.A_definingClasses.B_CreatingConstructors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        Person basePerson = new Person();
        Person personWithAge = new Person(age);
        Person personWithNameAndAge = new Person(name, age);

        System.out.println(basePerson.getName() + basePerson.getAge());
        System.out.println(personWithAge.getName() + personWithAge.getAge());
        System.out.println(personWithNameAndAge.getName() + " " + personWithNameAndAge.getAge());
    }
}
