package com.myjava.ocp.lab02;

public class BitDemo {

    public static void main(String[] args) {
        int x = 14;        
        System.out.println("x 轉成二進制:" + Integer.toBinaryString(x));

        int y = 0b1110; // 前面加上0b表示後面為二進制
        System.out.println("y 轉成十進制:" + y);

        int z = -14;
        System.out.println(Integer.toBinaryString(z)); // 負數的二進制表示法:先將正數取補數再加上0001
    }
}
