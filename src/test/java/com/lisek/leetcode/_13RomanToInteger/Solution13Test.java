package com.lisek.leetcode._13RomanToInteger;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution13Test {

    Solution13 solution13 = new Solution13();

    @ParameterizedTest
    @MethodSource("provideRomanNumeral")
    void test(String romanNumeral, int expectedInt) {
        assertEquals(expectedInt, solution13.romanToInt(romanNumeral));
    }

    public static Stream<Arguments> provideRomanNumeral() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994)
        );
    }
}
