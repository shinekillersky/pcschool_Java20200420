package com.myjava.ocp.lab06;

public class Product {
    static int stock; // 庫存
                      // 類別變數是共用的
    void sell(int amount) {
        stock -= amount;
    }

    void buy(int amount) {
        stock += amount;
    }
}
