package com.che3patil.collection;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {

        //Find First Non-Repeating Character in a String
        String str = "swiss";
        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Optional<Character> c = collect.entrySet().stream().max(Comparator.comparingLong(Map.Entry::getValue)).map(Map.Entry::getKey);
        System.out.println(c.get());

        List<Integer> nums = Arrays.asList(5, 3, 9, 2, 9, 7);
        List<Integer> collect1 = nums.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(collect1.get(collect1.size() - 2));


        String sentence = "Java Streams are powerful for processing data";
        //Output: "processing"
        Optional<String> max = Arrays.stream(sentence.split("\\s")).max(Comparator.comparingInt(String::length));

    }
}
