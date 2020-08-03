package com.myjava.ocp.lab07;

import java.util.Random;

// 單例模式
public class Game {
    int serialNo = new Random().nextInt();
    // 自行 new 一個名為 _instance 的物件實體
    private static final Game _instance = new Game();

    // 將建構子設為 private，只有自己能 new
    private Game() {
    }

    // 透過該方法將 Game 物件實體傳出
    public static Game getInstance() {
        return _instance;
    }

    public void start() {
        System.out.println("LoL:" + serialNo);
    }
}
