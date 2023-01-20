package com.lisek.leetcode._53MaximumSubarray;

public class Solution53 {

    public int maxSubArray(int[] nums) {


        // brute force O(n2)
        /*
        int answer = Integer.MIN_VALUE;
        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) {
            int windowSum = nums[i];
            int localAnswer = nums[i];
            for (int j = i; j < nums.length-1; j++) {
                windowSum += nums[j+1];
                if (windowSum > localAnswer) localAnswer = windowSum;
            }
            if (localAnswer > answer) answer = localAnswer;
        }*/

        // Kadane algorithm
        int size = nums.length;
        int answer = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + nums[i];
            if (answer < max_ending_here)
                answer = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }

        return answer;
    }
}
