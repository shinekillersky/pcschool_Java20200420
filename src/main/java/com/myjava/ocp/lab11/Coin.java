package com.myjava.ocp.lab11;

enum USCurrency {
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25);

    private int value;

    private USCurrency(int value) { // private 可省略不寫,但不可寫成 public
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Coin {
    public static void main(String[] args) {
        USCurrency usCoin = USCurrency.NICKLE; // private 不可以 new
        System.out.println(usCoin.getValue() + "美分");
    }
}
