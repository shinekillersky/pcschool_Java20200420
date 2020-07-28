package com.myjava.ocp.army;

public class Tank extends Car implements Weapon {

    public Tank() {
        System.out.println("Tank...");
    }

    @Override
    void move() {
        System.out.println("Tank 是用履帶走的");
    }

    @Override
    public void shoot() {
        System.out.println("Tank 發射大砲...");
    }
}
