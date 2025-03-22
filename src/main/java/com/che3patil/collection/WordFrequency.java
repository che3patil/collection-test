package com.che3patil.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "apple banana apple orange banana apple";

//        List<String> collect = Arrays.stream(text.split(" ")).collect(Collectors.toList());
//        Map<String, Long> collect1 = collect.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
//        System.out.println(collect1);

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        System.out.println(listOfLists);
        List<Integer> collect = listOfLists.stream().flatMap(integers -> integers.stream()).collect(Collectors.toList());

        List<Integer> collect1 = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());

        System.out.println(collect);
    }
}
