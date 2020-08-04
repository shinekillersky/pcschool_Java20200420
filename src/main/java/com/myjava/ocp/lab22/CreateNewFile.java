package com.myjava.ocp.lab22;

import java.io.File;
import java.io.IOException;

// 建立檔案
public class CreateNewFile {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\myjava\\ocp\\lab22\\files\\myfile.txt");
        System.out.printf("檔案是否存在: %b\n", file.exists()); // 1.確認檔案是否存在
        if(!file.exists()) { // 2.判斷檔案是否存在
            try {
                System.out.printf("建立檔案: %b\n", file.createNewFile()); // 3.檔案不存在 => 建立檔案
            } catch (IOException ex) {
                System.out.printf("建立失敗: %b\n", ex.toString());
            }
        }
    }
}
