package com.lisek.leetcode._383RansomNote;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution383Test {

    Solution383 solution383 = new Solution383();

    public static Stream<Arguments> ransomNote() {
        return Stream.of(
                Arguments.of(false, "a", "b"),
                Arguments.of(false, "aa", "ab"),
                Arguments.of(true, "aa", "aab"),
                Arguments.of(true, "aa", "aaaabb"),
                Arguments.of(false, "fihjjjjei", "hjibagacbhadfaefdjaeaebgi")

        );
    }

    @ParameterizedTest
    @MethodSource("ransomNote")
    void testSolution(Boolean expected, String ransomNote, String magazine) {
        assertEquals(expected, solution383.canConstruct(ransomNote, magazine));
    }


}