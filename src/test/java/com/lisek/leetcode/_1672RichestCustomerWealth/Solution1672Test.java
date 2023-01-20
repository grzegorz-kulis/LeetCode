package com.lisek.leetcode._1672RichestCustomerWealth;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1672Test {

    private Solution1672 solution1672 = new Solution1672();

    public static Stream<Arguments> customerBank() {
        return Stream.of(
                Arguments.of(6, new int[][]{new int[]{1,2,3}, new int[]{3,2,1}}),
                Arguments.of(10, new int[][]{new int[]{1,5}, new int[]{7,3}, new int[]{3,5}}),
                Arguments.of(17, new int[][]{new int[]{2,8,7}, new int[]{7,1,3}, new int[]{1,9,5}})
        );
    }

    @ParameterizedTest
    @MethodSource("customerBank")
    void testSolution(int expectedWealth, int[][] accounts) {

        assertEquals(expectedWealth, solution1672.maximumWealth(accounts));
    }

}