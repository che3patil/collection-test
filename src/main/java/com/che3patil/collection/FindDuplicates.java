package com.che3patil.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 3, 2, 5, 6, 7, 8, 8);

        Map<Integer, Long> collect = numbers.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        List<Map.Entry<Integer, Long>> collect1 = collect.entrySet().stream().filter(integerLongEntry -> integerLongEntry.getValue() > 1).collect(Collectors.toList());
        List<Integer> stream = collect1.stream().map(integerLongEntry -> integerLongEntry.getKey()).collect(Collectors.toList());

        Map<Integer, Long> collect2 = collect1.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(collect2);
        // System.out.println(collect1);

    }
}
