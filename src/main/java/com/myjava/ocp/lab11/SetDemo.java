package com.myjava.ocp.lab11;

import java.util.HashSet;

public class SetDemo {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>(); // <> 內限制容器內的資料型態

        hs.add("國文");
        hs.add("數學");
        hs.add("英文");
        System.out.println(hs); // 按照 hashcode 擺放

        HashSet<Pen> hs2 = new HashSet<>();

        hs2.add(new Pen("Red", 10));
        hs2.add(new Pen("Bule", 10));
        hs2.add(new Pen("Red", 10));
        System.out.println(hs2); // 會根據 equals & hashcode 自動排除相同的內容

        // Java 7
        for (Pen pen : hs2) {
            System.out.println(pen.getColor());
        }

        // Java 8 stream
        hs2.forEach(pen -> System.out.println(pen.getColor()));
    }
}
