package com.che3patil.collection;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest8 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

//        names.stream().filter(s -> s.startsWith("B")).forEach(System.out::println);


//        names.stream().map(String::toUpperCase).forEach(System.out::println);


//        names.stream().flatMap(s -> s.toLowerCase().chars().mapToObj(value -> (char)value)).forEach(System.out::print);
//
//        List<String> result = new ArrayList<>();
//        for (String name : names) {
//            if (name.length() > 1) {
//                result.add(name.toLowerCase());
//            }
//        }
//        System.out.println(result); // [ALICE, CHARLIE, DAVID]


        List<String> numbers = Arrays.asList("10", "20", "abc", "30");

        List<Integer> collect = numbers.stream().map(s ->
                {
                    try {
                        return  Integer.parseInt(s);
                    }catch (NumberFormatException e){
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
    }
}
