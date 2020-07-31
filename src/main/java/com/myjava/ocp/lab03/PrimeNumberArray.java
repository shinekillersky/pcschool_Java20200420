package com.myjava.ocp.lab03;

public class PrimeNumberArray {
    public static void main(String[] args) {
        int[] nums = {47, 45, 17, 23, 98};        
        // 將質數印出來
        for (int n : nums) {
            if (isPrime(n)) {
                System.out.println(n);
            }
        }
    }

    // 質數:除了1與本身，不能被其他數所整除
    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
