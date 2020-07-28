package com.myjava.ocp.lab25;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

// 複製及刪除檔案
public class FilesCopyAndDelete {
    public static void main(String[] args) {
        Path source = Paths.get("src\\main\\java\\com\\myjava\\ocp\\lab25\\bar\\data.txt");
        Path dest   = Paths.get("src\\main\\java\\com\\myjava\\ocp\\lab25\\foo\\data.txt");
        try {
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
            Files.delete(source); // 刪除來源端
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
