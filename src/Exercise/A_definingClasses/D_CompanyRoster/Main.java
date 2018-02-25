package Exercise.A_definingClasses.D_CompanyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Set<Employee>> departments = new LinkedHashMap<>();
        int employeeCount = Integer.parseInt(reader.readLine());

        Employee employee = null;
        for (int i = 0; i < employeeCount; i++) {
            String[] tokens = reader.readLine().split("\\s+");

            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];

            switch (tokens.length) {
                case 4:
                    employee = new Employee(name, salary, position, department);
                    break;
                case 5:
                    if (tokens[4].contains("@")) {
                        employee = new Employee(name, salary, position, department, tokens[4]);
                    } else {
                        employee = new Employee(name, salary, position, department, Integer.parseInt(tokens[4]));
                    }
                    break;
                case 6:
                    employee = new Employee(name, salary, position,
                            department, tokens[4], Integer.parseInt(tokens[5]));
                    break;

            }

            departments.putIfAbsent(department, new HashSet<>());
            departments.get(department).add(employee);
        }

        departments.entrySet().stream()
                .sorted((d1, d2)-> Double.compare(d2.getValue().stream()
                        .mapToDouble(Employee::getSalary)
                        .average()
                .getAsDouble(),d1.getValue().stream()
                        .mapToDouble(Employee::getSalary)
                        .average().getAsDouble()))
                .limit(1)
                .forEach(d -> {
                    System.out.println("Highest Average Salary: " + d.getKey());
                    d.getValue().stream()
                            .sorted((e1, e2) ->Double.compare(e2.getSalary(), e1.getSalary()))
                            .forEach(System.out::println);
                });

    }
}
