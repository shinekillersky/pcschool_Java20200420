package com.myjava.ocp.lab07;

public class Zoo4 {

    public static void main(String[] args) {
        Animal a = new Tiger("老虎");
       
        ((Cat) a).shout();
        ((Tiger) a).shout();
        ((Dog) a).shout(); // Dog 跟 Tiger 無繼承關係，在執行時會出現例外
    }
}
