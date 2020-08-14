package com.myjava.ocp.lab05;

import java.io.Console;

// 使用命令提示字元操作
public class ConsoleTest {
    public static void main(String[] args) {
        Console cs = System.console();            
        System.out.println(cs);        
        System.out.println("請輸入密碼:");        
        String pass1 = cs.readLine(); // 輸入的時候看得到自己輸入的密碼
        System.out.println("您輸入的密碼是: " + pass1);        
        System.out.println("請輸入密碼:");        
        char[] pass2 = cs.readPassword(); // 輸入的時候看不到自己輸入的密碼
        System.out.println("您輸入的密碼是: " + new String(pass2));
    }
}
