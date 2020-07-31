package com.myjava.ocp.lab03;

public class ForTest {
    public static void main(String[] args) {
        int y = 0;
        y = y++;
        System.out.println(y);

        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte) (b1 + b2);

        System.out.println(b3);
        System.out.println(5 * 3 < 20 & 3 + 7 > 9 - 1 || 20 >= 20 - 30 && false);
    }
}
