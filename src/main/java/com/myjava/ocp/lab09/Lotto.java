package com.myjava.ocp.lab09;

public interface Lotto {
    int[] getLotto(int begin, int end, int count); // 從幾號選到幾號，選幾個
    void printLotto(int[] lotto); // 印出號碼
}
