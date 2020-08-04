package com.myjava.ocp.lab15;

import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toSet;
import java.util.stream.Stream;

public class Grouping3 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "apple", "banana", "watermelon", "apple",
            "orange", "watermelon", "banana", "coconut"};
        
        // 依水果種類分，計算水果個數
        System.out.println("map1: " +
                Stream.of(fruits)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet()
        );
        // 依水果數量分組
        System.out.println("map2: " +
                Stream.of(fruits)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet()
                        .stream()
                        .collect(Collectors.groupingBy(Entry::getValue, Collectors.mapping(Entry::getKey, toSet())))
        );
    }
}
