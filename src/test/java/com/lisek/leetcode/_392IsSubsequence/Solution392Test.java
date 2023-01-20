package com.lisek.leetcode._392IsSubsequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution392Test {

    Solution392 solution392 = new Solution392();

    public static Stream<Arguments> subsequences() {
        return Stream.of(
                Arguments.of(
                        true, "abc", "ahbgdc"
                )
                ,
                Arguments.of(
                        false, "axc", "ahbgdc"
                )
                ,
                Arguments.of(
                        false, "b", "c"
                )
                ,
                Arguments.of(
                        false, "bb", "ahbgdc"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("subsequences")
    void testSolution(boolean expected, String s, String t) {
        assertEquals(expected, solution392.isSubsequence(s, t));
    }

}