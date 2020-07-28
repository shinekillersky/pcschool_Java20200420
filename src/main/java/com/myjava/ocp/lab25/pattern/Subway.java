package com.myjava.ocp.lab25.pattern;

public class Subway {
    
    public static void main(String[] args) {
        Food food = new Bread();
        food = new Ham(food);
        food = new Ham(food);
        food = new Ham(food);
        food = new Egg(food);
        food = new Olives(food);
        food = new Onion(food);
        food = new Tomato(food);
        food = new Tomato(food);
        food = new Tuna(food);
        food = new Lettuce(food);
        food = new Lettuce(food);
        
        System.out.println(food.getNmae());
        System.out.println(food.getPrice());
        
    }
}
