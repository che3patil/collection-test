package com.che3patil.collection;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 90000),
                new Employee("Bob", "HR", 70000),
                new Employee("Charlie", "IT", 95000),
                new Employee("David", "Finance", 88000),
                new Employee("Eve", "HR", 72000)
        );

//        Collections.sort(employees, new EmployeeCompartor());
//        System.out.println("employees: " + employees);


        //     employees.stream().forEach(System.out::println);

//        Map<String, List<Employee>> employeesByDept = employees.stream().collect(Collectors.groupingBy(employee -> employee.department));
//        System.out.println("Employees grouped by department: " + employeesByDept);

//        Map<String, Optional<Employee>> stringOptionalMap = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(employee -> employee.salary))));
//        System.out.println("collect: " + stringOptionalMap);


//        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//        System.out.println("collect: " + collect);


//        Map<String, Optional<Employee>> stringOptionalMap = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment,
//                        Collectors.collectingAndThen(Collectors.toList(), employees1 -> employees1.stream()
//                                .sorted(Comparator.comparing((Employee employee) -> employee.salary).reversed())
//                                .skip(1).findFirst())));
//
//        System.out.println("collect: " + stringOptionalMap);


//        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//
//        collect.forEach((s, employees1) -> {
//            employees1.sort(Comparator.comparing((Employee employee) -> employee.salary).reversed());
//
//            System.out.println(s +" " + (employees1.size() > 1 ? employees1.get(1) : "No second highest record"));
//
//        });

        Map<String, Integer> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
        System.out.println(collect);

    }
}
