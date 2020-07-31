package com.myjava.ocp.lab09;

import java.util.Arrays;

public class CarDemo {
    public static void main(String[] args) {
        Car[] cars = {new Tank("坦克"), new Truck("卡車")};
        for (Car car : cars) {
            System.out.println(car.getName());
            car.move();
        }
        Arrays.stream(cars)
                .forEach(s -> { 
                    System.out.println(s.getName());
                    s.move();
                });
    }
}
