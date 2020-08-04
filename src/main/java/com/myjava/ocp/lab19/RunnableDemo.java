package com.myjava.ocp.lab19;

import java.util.Date;
import java.util.Random;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable r1 = () -> {System.out.println(new Date());}; // 任務 r1            
        Runnable r2 = () -> {System.out.println(new Random().nextInt(100));}; // 任務 r2    
        
        Thread t1 = new Thread(r1); // 選擇要做哪個任務
        t1.start(); // 執行任務
    }
}
