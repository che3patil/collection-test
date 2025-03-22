package com.che3patil.collection;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest7 {
    public static void main(String[] args) {
        // First Map
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 10);
        map1.put("B", 30);
        map1.put("C", 20);

        // Second Map
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 25);
        map2.put("D", 15);
        map2.put("E", 50);

        Map<String, Integer> mergedMap = new HashMap<>(map1);

        mergedMap.entrySet().stream().forEach(System.out::println);

        System.out.println("-----------------------------");
        map2.forEach((s, integer) -> mergedMap.merge(s, integer, Integer::sum));
        map2.entrySet().stream().forEach(System.out::println);
        System.out.println("-----------------------------");

        mergedMap.entrySet().stream().forEach(System.out::println);


        System.out.println("-----------------------------");

    }
}
