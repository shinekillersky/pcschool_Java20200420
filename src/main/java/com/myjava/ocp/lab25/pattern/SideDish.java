package com.myjava.ocp.lab25.pattern;

public class SideDish extends Food {

    protected Food food;

    public SideDish(Food food) {
        this.food = food;
    }
    
    @Override
    protected String getNmae() {
        return name + " + " + food.getNmae();
    }

    @Override
    protected int getPrice() {
        return price + food.getPrice();
    }
}
