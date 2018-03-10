package Exercise.A_definingClasses.I_Google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> people = new HashMap<>();

        while (true) {
            String line = reader.readLine();
            if ("End".equals(line)) {
                break;
            }
            String[] tokens = line.split("\\s+");
            String name = tokens[0];
            String object = tokens[1].toLowerCase();
            Person person = new Person(name);
            switch (object) {
                case "company":
                    String companyName = tokens[2];
                    String department = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    if (people.containsKey(name)) {
                        person = people.get(name);
                    }
                    Company company = new Company(companyName, department, salary);
                    person.setCompany(company);
                    people.put(name, person);
                    break;
                case "pokemon":
                    String pokemonName = tokens[2];
                    String pokemonType = tokens[3];
                    if (people.containsKey(name)) {
                        person = people.get(name);
                    }
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                    person.addPokemon(pokemon);
                    people.put(name, person);
                    break;
                case "parents":
                    String parentName = tokens[2];
                    String parentBirthday = tokens[3];
                    if (people.containsKey(name)) {
                        person = people.get(name);
                    }
                    Parents parents = new Parents(parentName, parentBirthday);
                    person.addParent(parents);
                    people.put(name, person);
                    break;
                case "children":
                    String childName = tokens[2];
                    String childBirthday = tokens[3];
                    if (people.containsKey(name)) {
                        person = people.get(name);
                    }
                    Children children = new Children(childName, childBirthday);
                    person.addChild(children);
                    people.put(name, person);
                    break;
                case "car":
                    String model = tokens[2];
                    int speed = Integer.valueOf(tokens[3]);
                    if (people.containsKey(name)) {
                        person = people.get(name);
                    }
                    Car car = new Car(model, speed);
                    person.setCar(car);
                    people.put(name, person);
                    break;
                default:
                    System.out.println("No such object.");
                    break;
            }
        }
        String key = reader.readLine();
        Person person = people.get(key);
        System.out.println(person);
    }
}
