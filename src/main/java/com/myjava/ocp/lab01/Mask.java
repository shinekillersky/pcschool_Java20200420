package com.myjava.ocp.lab01;

public class Mask {
    // 物件屬性
    private String color;
    private boolean child; // 是否是兒童用的
    // 類別屬性
    public final static int price = 5;

    // 建構子
    public Mask() {
    }

    public Mask(String color, boolean child) {
        this.color = color;
        this.child = child;
    }

    public int getPrice() {
        return price;
    }

    // 封裝方法
    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }

    public boolean isChild() {
        return child;
    }

    public void setChild(boolean child) {
        this.child = child;
    }
}
