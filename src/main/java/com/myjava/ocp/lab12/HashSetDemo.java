package com.myjava.ocp.lab12;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setColor("Blue");
        Paper paper = new Paper();
        paper.setSize("A5");

        HashSet<Object> hs = new HashSet<>(); // 預設為 Object，可以不寫
        hs.add(pen);
        hs.add(paper);
        System.out.println(hs);

        // 使用 Iterator
        Iterator it = hs.iterator(); // 用完就沒有了        
        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);
        }

        it = hs.iterator(); // 要再用需要再產生一個        
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Paper) {
                it.remove();
            }
        }        
        System.out.println(hs);
    }
}
