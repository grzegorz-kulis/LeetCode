package com.lisek.leetcode._217ContainsDuplicate;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution217 {

    public boolean containsDuplicate(int[] nums) {

        boolean answer = false;
        int size = Arrays.stream(nums).boxed().collect(Collectors.toSet()).size();
        answer = size != nums.length;
        return answer;
    }
}
