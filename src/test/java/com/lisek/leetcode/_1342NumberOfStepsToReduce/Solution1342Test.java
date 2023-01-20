package com.lisek.leetcode._1342NumberOfStepsToReduce;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution1342Test {

    Solution1342 solution1342 = new Solution1342();

    public static Stream<Arguments> steps() {
        return Stream.of(
                Arguments.of(6, 14),
                Arguments.of(4, 8),
                Arguments.of(12, 123)
        );
    }

    @ParameterizedTest
    @MethodSource("steps")
    void testSolution1342(int expected, int number) {
        assertEquals(expected, solution1342.numberOfSteps(number));
    }

}