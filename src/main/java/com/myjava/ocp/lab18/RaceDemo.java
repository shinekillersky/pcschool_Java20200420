package com.myjava.ocp.lab18;

public class RaceDemo {
    public static void main(String[] args) {
        Race race1 = new Race("烏龜");
        Race race2 = new Race("兔子");
        RaceHelper helper = new RaceHelper("陪跑");
        helper.setDaemon(true); // 背景執行緒，會隨著前景執行緒結束而結束，但會略有延遲
                                // user thread 為前景執行緒
        
        // 分時多工，由系統自動配置，所以間隔不同
        race1.start();
        race2.start();
        helper.start();
        System.out.println("Active thread count: " + Thread.activeCount());
    }
}
