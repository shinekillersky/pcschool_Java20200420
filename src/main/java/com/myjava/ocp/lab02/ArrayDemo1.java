package com.myjava.ocp.lab02;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] score = {100, 90, 80};
        // 傳統寫法
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        System.out.println("-----------------------");
        // Java 8 寫法
        for (int s : score) {
            System.out.println(s);
        }
    }
}
