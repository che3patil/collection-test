package com.che3patil.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

        List<Integer> collect = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());

        Map<Boolean, List<Integer>> collect1 = collect.stream().collect(Collectors.partitioningBy(integer -> integer % 2 == 0));

        System.out.println(collect1);
    }
}
