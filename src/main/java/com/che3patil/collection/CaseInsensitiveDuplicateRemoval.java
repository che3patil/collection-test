package com.che3patil.collection;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CaseInsensitiveDuplicateRemoval {
    public static void main(String[] args) {

        List<String> listWithDuplicates = List.of("Apple", "Banana", "apple", "Orange", "banana", "ORANGE");

        Set set = new HashSet<String>();

//        List<String> collect = listWithDuplicates.stream().filter(s -> set.add(s.toLowerCase())).collect(Collectors.toList());
//        System.out.println(collect);

        Collection<String> values = listWithDuplicates.stream().collect(Collectors.toMap(String::toLowerCase, Function.identity(), (o, o2) -> o2, LinkedHashMap::new)).values().stream().collect(Collectors.toList());
        System.out.println(values);
    }
}
