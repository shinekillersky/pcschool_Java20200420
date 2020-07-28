package com.myjava.ocp.lab02;

public class ParkingSystem {

    public static void main(String[] args) {
        int parking = 0b101010; // 前面加0b表示二進制，1代表有車，0代表空位
        System.out.println("車位狀態: " + Integer.toBinaryString(parking));
        
        int no = 2;
        System.out.print("no=" + no + " 的車位,");
        
        no = (int) Math.pow(2, no); // 次方化	no = 4 = 0b0100
        int check = parking & no;
        
        System.out.println(check == 0 ? "可停車" : "不可停車");
        
        if (check == 0) {
            // 停車
            parking += no;
            System.out.println("車位狀態: " + Integer.toBinaryString(parking));
        }
    }
}
