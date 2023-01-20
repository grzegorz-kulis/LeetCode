package com.lisek.leetcode._1672RichestCustomerWealth;

import java.util.Arrays;
import java.util.Optional;

public class Solution1672 {

    public int maximumWealth(int[][] accounts) {

        Optional<Integer> max = Arrays.asList(accounts)
                .stream()
                .map((int[] list) ->
                        Arrays.stream(list)
                                .boxed()
                                .reduce(0, Integer::sum)
                )
                .max(Integer::compareTo);


        return max.get();
    }
}
