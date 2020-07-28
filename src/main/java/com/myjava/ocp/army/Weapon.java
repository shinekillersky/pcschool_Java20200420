package com.myjava.ocp.army;

public interface Weapon {

    public void shoot();

    public default void copyright() { // 為了向後相容，Java 8 開始， interface 可以實作
        System.out.println("Peter 製作...");
    }
}
