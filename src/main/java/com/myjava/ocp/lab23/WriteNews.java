package com.myjava.ocp.lab23;

import java.io.FileWriter;

// 將文字寫入檔案
public class WriteNews {    
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\myjava\\ocp\\lab23\\news.txt";
        try (FileWriter fw = new FileWriter(path, false)) { // true 會保留原本的資料，預設為 false 會清空原本的資料
            String data = "Welcome vs Wellcome";
            fw.write(data);
        } catch (Exception e) {
        }
    }
}
