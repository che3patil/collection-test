package com.che3patil.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        String s = "I am chetan patil and not working yet.";

        List list = Stream.of(1, 2, 3, 4).collect(Collectors.toList());

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//        List<String> upperCaseNames = names.stream()
//                .map(s1 -> new StringBuilder(s1).append(s1).toString())
//                .collect(Collectors.toList());

//        List<String> upperCaseNames = names.stream()
//                .filter(s1 -> s1.startsWith("A"))
//                .collect(Collectors.toList());


        String str = "interview scheduled with chetan patil at 11";
        char[] charArray = str.toCharArray();

        System.out.println(charArray.length);
        Stream stream = Stream.of(charArray).map(c -> String.valueOf(c));
        System.out.println(stream.count());
        //stream.forEach(System.out::println);

        Stream<Character> distinct = str.chars().mapToObj(operand -> (char) operand).distinct();
        System.out.println(distinct.count());

        Collector<Object, ?, Map<Object, Long>> objectMapCollector = Collectors.groupingBy(Function.identity(), Collectors.counting());


        Map<Character, Long> collect = str.chars().mapToObj(operand -> (char) operand).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.entrySet().stream().filter(characterLongEntry -> characterLongEntry.getValue() > 1).map(Map.Entry::getKey).forEach(System.out::print);

//        List list1= new String(charArray).chars().mapToObj(value -> String.valueOf((char)value)).collect(Collectors.toList());
//        list1.stream().forEach(System.out::println);


    }
}
