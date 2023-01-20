package com.lisek.leetcode._724FindPivotIndex;

import java.util.Arrays;

public class Solution724 {

    public int pivotIndex(int[] nums) {

        int result = -1;

        int[] sumLeft = nums.clone();
        int[] sumRight = nums.clone();

        for (int i = 1, j = nums.length - 1; i <= nums.length - 1; i++, j--) {
            sumLeft[i] = sumLeft[i] + sumLeft[i - 1];
            sumRight[j-1] = sumRight[j] + sumRight[j - 1];
        }

        System.out.println("sum from left: " + Arrays.toString(sumLeft));
        System.out.println("sum from right: " + Arrays.toString(sumRight));

        for (int i = 0, j = nums.length - 1; i <= nums.length - 1; i++, j--) {
            if (sumLeft[i] == sumRight[i]) {
                return i;
            }
        }

        return result;
    }
}
