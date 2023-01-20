package com.lisek.leetcode._217ContainsDuplicate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution217Test {

    Solution217 solution217 = new Solution217();

    public static Stream<Arguments> nums() {
        return Stream.of(
                Arguments.of(
                        true,
                        new int[]{1, 2, 3, 1}
                ),
                Arguments.of(
                        false,
                        new int[]{1, 2, 3, 4}
                ),
                Arguments.of(
                        true,
                        new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("nums")
    void testSolution(boolean expected, int[] nums) {
        assertEquals(expected, solution217.containsDuplicate(nums));
    }

}