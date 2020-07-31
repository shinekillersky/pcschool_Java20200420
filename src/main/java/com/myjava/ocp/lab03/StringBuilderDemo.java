package com.myjava.ocp.lab03;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Java").append("8").append("OCPJP");
        String s = "Java8OCPJP";

        System.out.println(sb); // 可寫成 sb.toString()
        System.out.println(s);
        System.out.println(sb.equals(s)); // 一個型別為 StringBuilder 一個為 String，所以為 false
        System.out.println(sb.toString().equals(s));
    }
}
