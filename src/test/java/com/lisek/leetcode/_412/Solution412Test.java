package com.lisek.leetcode._412;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution412Test {


    Solution412 solution412 = new Solution412();

    public static Stream<Arguments> fizzBuzz() {
        return Stream.of(
                Arguments.of(
                        List.of("1", "2", "Fizz"),
                        3
                ),
                Arguments.of(
                        List.of("1", "2", "Fizz", "4", "Buzz"),
                        5
                ),
                Arguments.of(
                        List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"),
                        15
                )
        );
    }

    @ParameterizedTest
    @MethodSource("fizzBuzz")
    void testSolution(List<String> expected, int n) {

        assertArrayEquals(expected.toArray(), solution412.fizzBuzz(n).toArray());
    }
}