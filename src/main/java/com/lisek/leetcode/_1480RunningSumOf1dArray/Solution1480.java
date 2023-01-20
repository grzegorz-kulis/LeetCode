package com.lisek.leetcode._1480RunningSumOf1dArray;

public class Solution1480 {


    public int[] runningSum(int[] nums) {
        for (int idx = 1; idx <= nums.length-1; idx++) {
            nums[idx] += nums[idx-1];
        }

        return nums;
    }

}
