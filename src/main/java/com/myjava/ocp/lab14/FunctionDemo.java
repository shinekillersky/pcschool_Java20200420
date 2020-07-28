package com.myjava.ocp.lab14;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionDemo {

    public static void main(String[] args) {
        // 1. Consumer  接受一個引數，處理後不傳回值            
        Consumer<Integer> consumer = (t) -> System.out.println(t + t);
        //  接受 Integer 參數
        play(10, consumer);
        
        // 2. Function  接受一個引數，以該引數進行計算後傳回任意結果
        Function<Integer, Double> func = (t) -> t * t * 3.14; 
        // 接受 Integer 參數，傳回 Double
        System.out.println(play(10, func));
        
        // 3. Predicate 接受一個引數，然後只回傳 boolean值
        Predicate<Integer> pre = (t) -> t >= 60 ? true : false;
        // 接受 Integer 參數，傳回 boolean 
        System.out.println(play(80, pre));
        System.out.println(play(40, pre));
        
        // 4. Supplier  不接受任何引數，然後傳回值
        Supplier<String> sup = () -> "20.8";
        // 傳回字串
        System.out.println("氣溫:" + play(sup));
        
        // 5. BiFunction    接受多個引數，以這些引數進行計算後傳回任意結果
        BiFunction<Integer, Integer, Double> bf = (h, w) -> w / Math.pow(h / 100.0, 2);
        // 接受兩個 Integer 參數，傳回 Double
        System.out.println(play(170, 60, bf));
    }

    public static void play(int x, Consumer consumer) {
        consumer.accept(x);
    }

    public static Object play(int x, Function function) {
        return function.apply(x);
    }

    public static Boolean play(int x, Predicate predicate) {
        return predicate.test(x);
    }

    public static Object play(Supplier<String> supplier) {
        return supplier.get();
    }

    public static Double play(Integer h, Integer w, BiFunction<Integer, Integer, Double> biFunction) {
        return biFunction.apply(h, w);
    }
}
