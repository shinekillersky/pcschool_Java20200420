package com.myjava.ocp.lab24;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadEmployee {
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\myjava\\ocp\\lab24\\emp.bin";
        try(FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);) {
            // 讀出物件
            Employee emp = (Employee)ois.readObject();
            System.out.println(emp);
            System.out.println(emp.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
