package com.myjava.ocp.lab25;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// 以平行的方式快速讀取檔案內容
public class ReadAllNio {    
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src\\main\\java\\com\\myjava\\ocp\\lab25\\foo\\data.txt");
        List<String> list = Files.readAllLines(path);
        System.out.println(list);
        Files.readAllLines(path)
                .stream()
                .parallel() // 平行
                .forEach(System.out::println);
    }
}
