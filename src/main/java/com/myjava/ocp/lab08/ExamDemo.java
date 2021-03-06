package com.myjava.ocp.lab08;

import java.util.Arrays;

// 3人國文和英文成績
public class ExamDemo {
    public static void main(String[] args) {
        int[][] exams = {{100, 90}, {50, 80}, {70, 100}};
        // 扁平化
        Arrays.stream(exams).flatMapToInt(e -> Arrays.stream(e))
                .forEach(System.out::println);
        System.out.println("-------------------");        
        // 100 分有幾個 ?
        long count = Arrays.stream(exams)
                .flatMapToInt(e -> Arrays.stream(e))
                .filter(score -> score == 100)
                .count();
        System.out.println("100分有 " + count + "個");
        
        // 求國文平均
        double chineseAvg = Arrays.stream(exams)
                .mapToInt(e -> e[0]) // 取維度為0的值
                .average()
                .getAsDouble();
        System.out.println(chineseAvg);

        int[] exam = {100, 90};
        System.out.println(Arrays.stream(exam).average().getAsDouble());
        
        // 求班平均
        double classAvg = Arrays.stream(exams)
                .mapToDouble(e -> Arrays.stream(e).average().getAsDouble()) // 先求個人平均
                .average() // 再求班平均
                .getAsDouble();
        System.out.println(classAvg);
    }
}
