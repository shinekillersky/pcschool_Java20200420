package com.myjava.ocp.lab23;

import java.io.BufferedReader;
import java.io.FileReader;

// 利用資料緩衝區逐行讀取檔案內容(效率高)
public class BufferedReaderDemo {    
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\myjava\\ocp\\lab23\\news.txt";
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr);) {
            String data;
            while((data = br.readLine()) != null) { // 將資料逐行讀入
                System.out.println(data);
            }
        } catch (Exception e) {
        }
    }
}
