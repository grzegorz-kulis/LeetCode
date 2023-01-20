package com.lisek.leetcode._1337TheKWeakestRownsInMatrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1337Test {

    Solution1337 solution1337 = new Solution1337();

    public static Stream<Arguments> weakestRows() {
        return Stream.of(
                Arguments.of(new int[]{2, 0, 3}, new int[][]{
                        new int[]{1, 1, 0, 0, 0},
                        new int[]{1, 1, 1, 1, 0},
                        new int[]{1, 0, 0, 0, 0},
                        new int[]{1, 1, 0, 0, 0},
                        new int[]{1, 1, 1, 1, 1},
                }, 3),
                Arguments.of(new int[]{0, 2}, new int[][]{
                        new int[]{1, 0, 0, 0},
                        new int[]{1, 1, 1, 1},
                        new int[]{1, 0, 0, 0},
                        new int[]{1, 0, 0, 0}
                }, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("weakestRows")
    void testSolution(int[] expectedWeakestRow, int[][] mat, int k) {

        assertArrayEquals(expectedWeakestRow, solution1337.kWeakestRows(mat, k));
    }
}