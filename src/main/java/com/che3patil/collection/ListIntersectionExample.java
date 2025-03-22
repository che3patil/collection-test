package com.che3patil.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListIntersectionExample {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "B", "C", "D");
        List<String> list2 = Arrays.asList("B", "D", "E", "F");

        Collections.sort(list1);
        System.out.println(list1);

        List<String> collect = list1.stream().filter(list2::contains).collect(Collectors.toList());

        boolean d = list2.contains("D");

        System.out.println(collect);
    }


}
