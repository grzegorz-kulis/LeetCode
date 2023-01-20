package com.lisek.leetcode._724FindPivotIndex;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution724Test {

    Solution724 solution724 = new Solution724();

    public static Stream<Arguments> pivots() {
        return Stream.of(
                Arguments.of(
                        3, new int[]{1, 7, 3, 6, 5, 6}
                ),
                Arguments.of(
                        -1, new int[]{1, 2, 3}
                ),
                Arguments.of(
                        0, new int[]{2, 1, -1}
                ),
                Arguments.of(
                        5, new int[]{-1,-1,0,1,1,0}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("pivots")
    void pivotIndex(int expected, int[] nums) {
        assertEquals(expected, solution724.pivotIndex(nums));
    }
}