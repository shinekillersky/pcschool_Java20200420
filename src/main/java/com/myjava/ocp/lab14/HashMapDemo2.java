package com.myjava.ocp.lab14;

import java.util.HashMap;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> exam = new HashMap<>();        
        exam.put("國文", 100);
        exam.put("數學", 80);
        exam.put("英文", 100);
        System.out.println(exam);
        exam.computeIfPresent("數學", (k, v) -> { // 如果有數學，則數學加10分
            System.out.println(k + ", " + v);
            return v + 10;
        });
        System.out.println(exam);
        exam.computeIfAbsent("自然", (k) -> 70); // 如果沒有自然，則新增自然70分
        System.out.println(exam);
        exam.forEach((k, v) -> System.out.printf("k=%s, v=%d\n", k, v));
    }
}
