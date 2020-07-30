package com.myjava.ocp.lab02;

public class ParkingSystem2 {

    public static void main(String[] args) {
        int parking = 0b101010; // 前面加0b表示二進制，1代表有車，0代表空位
        System.out.println("車位狀態: " + Integer.toBinaryString(parking));        
        int no = 3;
        System.out.print("no=" + no + "車位, ");        
        no = (int) Math.pow(2, no); // 次方化	no = 8 = 0b1000 
        int check = parking & no; // 取交集        
        System.out.println(check > 0 ? "可移車" : "不可移車");        
        if (check == 0) {
            // 移車
            parking -= no;
            System.out.println("車位狀態: " + Integer.toBinaryString(parking));
        }
    }
}
