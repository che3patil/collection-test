package com.che3patil.collection;

import java.util.*;
import java.util.stream.Collectors;

class Student1 {
    String name;
    List<String> courses;

    Student1(String name, List<String> courses) {
        this.name = name;
        this.courses = courses;
    }
}

public class FlatMapExample {
    public static void main(String[] args) {
        List<Student1> students = Arrays.asList(
                new Student1("Alice", Arrays.asList("Math", "Physics")),
                new Student1("Bob", Arrays.asList("Math", "Chemistry")),
                new Student1("Charlie", Arrays.asList("Physics", "Biology"))
        );


        Set<String> collect = students.stream().flatMap(student1 -> student1.courses.stream()).collect(Collectors.toSet());
        collect.forEach(System.out::println);
    }
}
