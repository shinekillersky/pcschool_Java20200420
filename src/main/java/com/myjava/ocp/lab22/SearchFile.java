package com.myjava.ocp.lab22;

import java.io.File;

// 找出目標檔案的路徑
public class SearchFile {
    
    static String targetName = "mouse.txt"; // 設定目標檔案
    
    public static void main(String[] args) {
        File dir = new File("/C://Java"); // 設定初始目錄
        checkFileType(dir);
    }
    
    public static void checkFileType(File f) {        
        File[] files = f.listFiles(); // 將目錄底下的所有目錄及檔案放到陣列裡
        for(File file : files) {
            if(file.isDirectory()) { //判斷是否為目錄
                checkFileType(file); // 是目錄 => 遞迴 
            } else { // 是檔案 
                checkFileName(file); 
            }
        }
    }
    
    public static void checkFileName(File f) { // 確認檔案名稱
        if(f.getName().equals(targetName)) {
            System.out.printf("找到了!\n檔案路徑是:\n %s", f);
        }
    }
}
