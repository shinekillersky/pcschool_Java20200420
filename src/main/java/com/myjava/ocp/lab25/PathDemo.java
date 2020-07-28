package com.myjava.ocp.lab25;

import java.nio.file.Path;
import java.nio.file.Paths;

// 分析檔案
public class PathDemo {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src\\main\\java\\com\\myjava\\常用 functions.txt");
        path.forEach(System.out::println);
        System.out.println("getFileName: " + path.getFileName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getRoot: " + path.getRoot());
        System.out.println("getNameCount: " + path.getNameCount());
        System.out.println("subpath(0, 2): " + path.subpath(0, 2));
        System.out.println("isAbsolute: " + path.isAbsolute());
        System.out.println("toAbsolutePath: " + path.toAbsolutePath());
        System.out.println("toUri: " + path.toUri());
    }
}
