package com.myjava.ocp.lab23;

import java.io.BufferedWriter;
import java.io.FileWriter;

// 利用資料緩衝區，將文字寫入檔案(效率高)
public class BufferedWriterDemo {
    public static void main(String[] args) {
        String[] rows = {"apple", "banana"};
        String path = "src\\main\\java\\com\\myjava\\ocp\\lab23\\news.txt";
        try (FileWriter fw = new FileWriter(path, true); // true 會保留原本的資料，預設為 false 會清空原本的資料
             BufferedWriter bw = new BufferedWriter(fw, 16 * 1024)) {
            for(String row : rows) {
                bw.write("\n" + row);
            }
        } catch (Exception e) {
        }
    }
}
