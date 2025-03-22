package com.che3patil.collection;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoMap {
    public static void main(String[] args) {

        Map<String, Integer> map1 = Map.of("A", 10, "B", 20);
        Map<String, Integer> map2 = Map.of("B", 25, "C", 30);


        Map<String, Integer> collect = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (integer, integer2) -> {
            return integer + integer2;

        }));
        System.out.println(collect);

    }

}
