package com.che3patil.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 40, 30);


        Integer collect = numbers.stream().reduce(3,Integer::sum);


        System.out.println(collect);

    }
}
