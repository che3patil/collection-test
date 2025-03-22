package com.che3patil.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveEmployeeDuplicateSalary {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice","HR", 90000),
                new Employee("Bob","HR", 70000),
                new Employee("Charlie","HR", 90000),
                new Employee("David","HR", 88000)
        );

        Map<Double, Long> collect = employees.stream().collect(Collectors.groupingBy(employee -> employee.getSalary(), Collectors.counting()));
        Set<Double> doubles = collect.entrySet().stream().filter(doubleLongEntry -> doubleLongEntry.getValue() <= 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)).keySet();
        System.out.println(doubles);

        List<String> collect1 = employees.stream().filter(employee -> doubles.contains(employee.getSalary())).map(employee -> employee.getName()).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
