package com.myjava.ocp.lab22;

import java.io.File;
import java.io.IOException;

// 建立 TempFile
public class CreateTempFile {    
    public static void main(String[] args)  throws IOException {
        File path = new File("src\\main\\java\\com\\myjava\\ocp\\lab22\\files");
        while (true) { // 千萬別執行，否則會當機           
            File file = File.createTempFile("temp", ".txt", path); // 在 path 目錄下建立前置詞為 temp 副檔名為 .txt 的 TempFile
            System.out.printf("暫存檔是否存在: %b\n", file.exists());
        }
    }
}
