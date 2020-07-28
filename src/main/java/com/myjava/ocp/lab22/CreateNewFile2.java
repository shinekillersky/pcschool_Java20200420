package com.myjava.ocp.lab22;

import java.io.File;

// 建立目錄(路徑、資料夾)及檔案
public class CreateNewFile2 {

    public static void main(String[] args) throws Exception {
        File path = new File("src\\main\\java\\com\\myjava\\ocp\\lab22\\files\\fruit");
        System.out.printf("路徑是否存在: %b\n", path.exists()); // 1.確認目錄是否存在
        
        if(!path.exists()) { // 2.判斷目錄是否存在
            boolean check = path.mkdir(); // 3.建立目錄
            System.out.printf("建立路徑: %b\n", check);
            if(check) { // 4.判斷建立目錄是否成功
                File file = new File("src\\main\\java\\com\\myjava\\ocp\\lab22\\files\\fruit\\apple.txt");
                System.out.printf("建立檔案: %b\n", file.createNewFile()); // 5.建立檔案
            }
        }
    }
}
