package com.myjava.ocp.lab15;

import java.util.Map.Entry;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toMap;
import java.util.stream.Stream;

public class Grouping4 {
    public static void main(String[] args) {
        String[] names = {"Tom", "John", "Helen", "Jane", "Mary"};

        // 計算各名字字串長度
        System.out.println("map1: " +
                Stream.of(names)
                        .collect(toMap(String::toString, String::length))
                        .entrySet()
        );
        // 依名字字串長度分組
        System.out.println("map2: " +
                Stream.of(names)
                        .collect(toMap(String::toString, String::length))
                        .entrySet()
                        .stream()
                        .collect(Collectors.groupingBy(Entry::getValue, Collectors.mapping(Entry::getKey, toSet())))
        );

    }
}
