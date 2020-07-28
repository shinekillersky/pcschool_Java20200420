package com.myjava.ocp.lab13;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(650, 5); // 先開好格子(否則以等比級數增加)
                                                  // 先開650格，超過後每次增加5格
        for (int i = 1; i <= 650; i++) {
            v.add(i);
        }
        
        v.add(999);
        System.out.printf("capacity: %d\nsize: %d\n", v.capacity(), v.size());
    }
}
