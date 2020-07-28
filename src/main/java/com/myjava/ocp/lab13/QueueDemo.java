package com.myjava.ocp.lab13;

import java.util.LinkedList;
import java.util.Queue;

// FIFO(First in First out) 先進先出
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(100); // 加入物件
        q.offer(90);
        q.offer(80);
        System.out.println(q);

        // 一個一個取出
        while (q.size() > 0) {
            int n = q.poll(); // 取得並移除物件
            System.out.printf("取出 %d, q = %s\n", n, q);
        }
    }
}
