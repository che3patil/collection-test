package com.che3patil.collection;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest6 {
    public static void main(String[] args) {
//        map1
//        1, rahul
//        3, ramu
//        5,raju
//
//        map2
//        rahul,80000
//        ramu,80100    1
//        raju,50000
//
//        output map:
//        3,80100
//        1,80000
//        5,50000

        Map map = new HashMap();
        map.put(1, "rahul");
        map.put(3, "ramu");
        map.put(5, "raju");

        Map map2 = new HashMap();
        map2.put("rahul", 80000);
        map2.put("ramu", 80100);
        map2.put("raju", 50000);


        Map<Integer, Integer> mergedMap = new HashMap<>(map);

        System.out.println("-----------------------------");




        Set<Map.Entry> set = map.entrySet();

        for (Map.Entry entry : set){
//            if (map2.get(entry.getValue()) != null){
//                resultMap.put(entry.getKey(), map2.get(entry.getValue()));
//            }
        }

//        Stream sorted = resultMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));
//        sorted.forEach(System.out::println);


        List<Integer> nums = Arrays.asList(5, 3, 9, 2, 9, 7);

        Stream<Integer> sorted1 = nums.stream().sorted(Comparator.reverseOrder());
    }
}
