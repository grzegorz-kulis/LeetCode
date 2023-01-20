package com.lisek.leetcode._1480RunningSumOf1dArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution1480Test {

    Solution1480 solution1480 = new Solution1480();

    public static Stream<Arguments> sums() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 3, 6, 10},
                        new int[]{1, 2, 3, 4}
                ),
                Arguments.of(
                        new int[]{1, 2, 3, 4, 5},
                        new int[]{1, 1, 1, 1, 1}
                ),
                Arguments.of(
                        new int[]{3, 4, 6, 16, 17},
                        new int[]{3, 1, 2, 10, 1}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("sums")
    void testSolution(int[] expected, int[] nums) {

        assertArrayEquals(expected, solution1480.runningSum(nums));
    }

}