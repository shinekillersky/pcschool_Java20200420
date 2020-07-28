package com.myjava.ocp.army;

public class Truck extends Car {

    public Truck() {
        System.out.println("Truck...");
    }

    @Override
    public void move() {
        System.out.println("Truck 是用輪子走的...");
    }
}
