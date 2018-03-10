package Lab.B_Encapsulation.C_FirstAndReserveTeam_04;

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
        Team team = new Team("Rodopa");
        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.valueOf(tokens[2]);
            double salary = Double.valueOf(tokens[3]);
            people.add(new Person(firstName, lastName, age, salary));
        }
        for (Person person : people) {
            team.addPLayers(person);
        }
        System.out.println(String.format("First team have %d players", team.getFirstTeam().size()));
        System.out.println(String.format("Reserve team have %d players", team.getReserveTeam().size()));
    }
}
