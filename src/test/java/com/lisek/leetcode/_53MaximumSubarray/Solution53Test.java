package com.lisek.leetcode._53MaximumSubarray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution53Test {

    Solution53 solution53 = new Solution53();

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(
                        6,
                        new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}
                ),
                Arguments.of(
                        1,
                        new int[]{1}
                ),
                Arguments.of(
                        23,
                        new int[]{5, 4, -1, 7, 8}
                ),
                Arguments.of(
                        1,
                        new int[]{-2,1}
                )
                ,
                Arguments.of(
                        1,
                        new int[]{1,-2}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void testSolution(int expected, int[] nums) {

        assertEquals(expected, solution53.maxSubArray(nums));
    }


}