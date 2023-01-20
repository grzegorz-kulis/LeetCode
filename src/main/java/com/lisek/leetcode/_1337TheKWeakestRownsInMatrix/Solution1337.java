package com.lisek.leetcode._1337TheKWeakestRownsInMatrix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution1337 {

    public int[] kWeakestRows(int[][] mat, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        int idx = 0;
        for (int[] array : mat) {
            map.put(idx++, Arrays.stream(array).reduce(0, Integer::sum));
        }

        int[] ints = map
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(k)
                .map(integerIntegerEntry -> integerIntegerEntry.getKey())
                .collect(Collectors.toList())
                .stream().mapToInt(Integer::intValue)
                .toArray();

        return ints;
    }
}
