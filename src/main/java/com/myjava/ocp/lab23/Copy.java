package com.myjava.ocp.lab23;

import java.io.FileReader;
import java.io.FileWriter;

// 將檔案從 A 路徑，複製到 B 路徑
public class Copy {
    public static void main(String[] args) {
        String from = "src\\main\\java\\com\\myjava\\ocp\\lab23\\news.txt";
        String to = "src\\main\\java\\com\\myjava\\ocp\\lab23\\news_backup.txt";
        
        try (FileReader fr = new FileReader(from);
             FileWriter fw = new FileWriter(to)) { // 放在小括號裡面會自動關閉            
            int x;
            while((x = fr.read()) != -1) { // -1代表讀到檔尾
                fw.write((char)x);
            }
        } catch (Exception e) {
        }
    }
}
