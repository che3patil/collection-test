package com.che3patil.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String input = "hello world hhhhhhhhhhhhh";

//        String collect = input.chars().distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
//        System.out.println(collect);

        List<String> stringList = Arrays.stream(input.split(" ")).collect(Collectors.toList());

        Optional<String> max = stringList.stream().max(Comparator.comparing(String::length));
        System.out.println(max);
    }
}
