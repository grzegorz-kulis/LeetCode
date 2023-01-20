package com.lisek.leetcode._205IsomorphicStrings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution205Test {

    Solution205 solution205 = new Solution205();

    public static Stream<Arguments> strings() {
        return Stream.of(
                Arguments.of(true, "egg", "add"),
                Arguments.of(false, "foo", "bar"),
                Arguments.of(true, "paper", "title"),
                Arguments.of(false, "badc", "baba")
        );
    }

    @ParameterizedTest
    @MethodSource("strings")
    void testSolution(boolean expected, String s, String t) {
        assertEquals(expected, solution205.isIsomorphic(s, t));
    }

}