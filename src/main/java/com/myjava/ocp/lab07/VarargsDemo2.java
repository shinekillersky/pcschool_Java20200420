package com.myjava.ocp.lab07;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 可變參數
public class VarargsDemo2 {
    public static void main(String[] args) {
        System.out.println(add(10, 20)); // 會先滿足能精確對應的
    }

    public static int add(int... nums) {
        return IntStream.of(nums).sum(); // 兩種寫法都可以
        // return Stream.of(nums).flatMapToInt(x-> Arrays.stream(x)).sum();
    }

    public static int add(int x, int y) {
        return x * y;
    }
}
