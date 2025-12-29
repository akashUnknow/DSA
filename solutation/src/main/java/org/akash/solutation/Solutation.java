package org.akash.solutation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solutation {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Alice", 3, 70000, 30),
                new Employee("Bob", 1, 50000, 25),
                new Employee("Charlie", 2, 60000, 28)
        ));

        Collections.sort(employees, new NameAgeComparator()); 
        System.out.println(employees);
    }
}
