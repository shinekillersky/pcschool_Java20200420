package com.myjava.ocp.lab23;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

// 將原本會輸出在 conole 視窗的文字改成輸入在檔案
public class SetOutDemo {
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\myjava\\ocp\\lab23\\log.txt";
        try (FileOutputStream fos = new FileOutputStream(path, true); // true 會保留原本的資料，預設為 false 會清空原本的資料
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             PrintStream out = new PrintStream(bos)) {
             
            System.setOut(out);
            System.out.println("Hello Java");
            System.out.println("Hello Python");
        } catch (Exception e) {
        }
    }
}
