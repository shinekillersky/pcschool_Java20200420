package com.myjava.ocp.lab22;

import java.io.File;

// 判斷是目錄還是檔案
public class FileOrDir {
    
    public static void main(String[] args) {
        File f = new File("C:\\Program Files\\ojdkbuild\\java-1.8.0-openjdk-1.8.0.242-1");
        File[] files = f.listFiles(); // 將目錄底下的所有目錄及檔案放到陣列裡
        
        for(File file : files) { 
            System.out.printf("(%s) %s\n", file.isFile()?"檔案":"目錄", file); // 逐一判斷是目錄還是檔案
        }
    }
}
