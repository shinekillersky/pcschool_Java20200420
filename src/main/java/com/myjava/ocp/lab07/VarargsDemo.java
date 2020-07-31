package com.myjava.ocp.lab07;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 可變參數
public class VarargsDemo {
    public static void main(String[] args) {        
        System.out.println(add(10, 20, 30, 40, 50, 60));
        System.out.println(add(10, 20, 30));
        System.out.println(add(10, 20));
        System.out.println(add(10));
        System.out.println(add());
    }

    public static int add(int... nums) { // 想成傳入陣列
        return IntStream.of(nums).sum(); // 兩種寫法都可以
        // return Stream.of(nums).flatMapToInt(x-> Arrays.stream(x)).sum();
    }
}
