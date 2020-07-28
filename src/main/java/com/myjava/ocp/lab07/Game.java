package com.myjava.ocp.lab07;

import java.util.Random;

public class Game {

    int serialNo = new Random().nextInt();
    // 自行提供(new) Game 物件實體 -> _instance
    private static Game _instance = new Game();

    // 將建構子設為 private
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
