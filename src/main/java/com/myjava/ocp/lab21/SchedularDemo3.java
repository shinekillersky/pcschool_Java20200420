package com.myjava.ocp.lab21;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedularDemo3 {
    
    public static void main(String[] args) {
        Runnable r = () -> {
            int delay = new Random().nextInt(5000);            
            try {
                Thread.sleep(delay);
            } catch (Exception e) {
            }            
            int n = new Random().nextInt(9) + 1;
            System.out.printf("%d 產生號碼所花的秒數 %.1f, 列印時間: %s\n", n, delay/1000.0, new Date()); // r = 產生隨機號碼
        };
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(r, 1, 3, TimeUnit.SECONDS);
        // 重複性排程，重複做，初始等待時間 1 秒，之後含間隔共 3 秒做 1 次，若超過 3 秒，則後續將會減少(做+間隔)的時間來補給之前超時的
    }
}
