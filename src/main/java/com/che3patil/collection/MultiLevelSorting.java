package com.che3patil.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
    String name;
    double grade;

    Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return name + " (Grade: " + grade + ")";
    }
}

public class MultiLevelSorting {



    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Alice", 85.5),
                new Student("Eve", 92.0),
                new Student("Bob", 92.0),
                new Student("Charlie", 85.5),
                new Student("David", 78.0)

        );

        students.stream().sorted(Comparator.comparing((Student student) -> student.grade).thenComparing(student -> student.name)).forEach(System.out::println);


    }
}
