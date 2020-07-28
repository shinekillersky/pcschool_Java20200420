package com.myjava.ocp.lab10;

interface Update {

    int add(int n);
}

public class LambdaDemo2 {

    public static void main(String[] args) {
        int[] scores = {10, 20, 30};

        // Java 7
        updateScore(scores, new Update() {
            @Override
            public int add(int n) {
                return n * 2;
            }
        });

        // Java 8
        updateScore(scores, (int n) -> n * 2);
    }

    public static void updateScore(int[] scores, Update update) {
        for (int score : scores) {
            int new_socre = update.add(score);

            System.out.println(new_socre);
        }
    }
}
