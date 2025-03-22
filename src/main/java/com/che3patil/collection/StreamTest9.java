package com.che3patil.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest9 {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("10", "20", "abc", "30");

        List<Integer> collect = numbers.stream().map(StreamTest9::getInteger)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

                collect.stream().forEach(System.out::println);

    }

    private static Optional<Integer> getInteger(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        }catch (NumberFormatException e){
            return Optional.empty();
        }
    }
}
