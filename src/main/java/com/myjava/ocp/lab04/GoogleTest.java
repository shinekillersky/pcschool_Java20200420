package com.myjava.ocp.lab04;

import java.util.Scanner;

public class GoogleTest {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println("請輸入target:");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();        
        for (int i = 0; i < nums.length - 1; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target) {
                    System.out.printf("%d, %d", nums[i], nums[k]);
                    break;
                }
            }
        }
    }
}
