package com.che3patil.collection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlattenMapTOList {
    public static void main(String[] args) {

        Map<String, List<Integer>> map = Map.of(
                "A", List.of(1, 2, 3),
                "B", List.of(4, 5),
                "C", List.of(6, 7, 8)
        );

        List<Integer> collect = map.entrySet().stream().flatMap(stringListEntry -> stringListEntry.getValue().stream()).collect(Collectors.toList());
        System.out.println(collect);

    }
}
