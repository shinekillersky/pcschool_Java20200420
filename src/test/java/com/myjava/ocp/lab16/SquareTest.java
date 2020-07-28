package com.myjava.ocp.lab16;

import org.junit.Test;

public class SquareTest {

    public SquareTest() {
        
    }

    @Test
    public void testGetArea() {
        System.out.println("getArea");
        
        int x = 10;
        int y = 20;
        int h = 4;
        Square instance = new Square();
        
        int expResult = 60;
        int result = instance.getArea(x, y, h);
    }

    @Test
    public void testGetAngle() {
        System.out.println("getAngle");
        int x = 10;
        int h = 4;
        Square instance = new Square();
        int expResult = 20;
        int result = instance.getAngle(x, h);
    }
}
