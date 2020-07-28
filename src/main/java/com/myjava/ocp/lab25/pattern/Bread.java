package com.myjava.ocp.lab25.pattern;

public class Bread extends Food {

    public Bread() {
        name = "麵包";
        price = 40;
    }

    @Override
    protected String getNmae() {
        return name;
    }

    @Override
    protected int getPrice() {
        return price;
    }
    
    
}
