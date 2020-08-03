package com.myjava.ocp.lab12;

public class BoxDemo {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setColor("Red"); // 設定筆的顏色
        Paper paper = new Paper();
        paper.setSize("A4"); // 設定紙張的大小

        Box<Pen> b1 = new Box<>();        
        b1.set(pen); // 將筆放入箱子內
        System.out.println(b1.get().getColor()); // 先取得筆，再取得筆的顏色

        Box<Paper> b2 = new Box<>();        
        b2.set(paper); // 將紙張放入箱子內
        System.out.println(b2.get().getSize()); // 先取得紙張，再取得紙張的大小

        Box[] boxs = {b1, b2};
        for (Box box : boxs) {
            if (box.get() instanceof Pen) {
                System.out.println(((Pen) box.get()).getColor());
            } else if (box.get() instanceof Paper) {
                System.out.println(((Paper) box.get()).getSize());
            }
        }
    }
}
