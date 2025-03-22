package com.che3patil.collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindSalary {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 90000),
                new Employee("Bob", "HR", 70000),
                new Employee("Charlie", "IT", 95000),
                new Employee("David", "HR", 88000),
                new Employee("Eve", "HR", 72000)
        );

        Map<String, Optional<Employee>> stringOptionalMap = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors
                        .collectingAndThen(Collectors.toList(), employees12 -> employees12.stream().sorted(Comparator.comparing((Employee employee) -> employee.salary).reversed()).findFirst())));

        System.out.println(stringOptionalMap);
    }
}
