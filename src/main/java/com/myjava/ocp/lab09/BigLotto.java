package com.myjava.ocp.lab09;

import java.util.Random;

public class BigLotto extends ALotto { // 不可重複選號，技巧：先任意選再判斷是否重複並排除
    private boolean isExist(int[] nums, int n) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int[] getLotto(int begin, int end, int count) {
        Random r = new Random();
        int[] lotto = new int[count];
        for (int i = 0; i < lotto.length;) { // 技巧 : 將 i++ 拉到 if 內(第23行)
            int n = r.nextInt(end - begin + 1) + begin; // 先任意選
            if (!isExist(lotto, n)) { // 再判斷是否重複
                lotto[i] = n; // 若沒重複則放入陣列
                i++;
            } else { // 若重複則跳過重做
                continue;
            }
        }
        return lotto;
    }
}
