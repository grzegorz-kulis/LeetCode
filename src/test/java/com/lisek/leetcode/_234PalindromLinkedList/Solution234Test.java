package com.lisek.leetcode._234PalindromLinkedList;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution234Test {

    Solution234 solution = new Solution234();

    @ParameterizedTest
    @MethodSource("palindromes")
    void test(Boolean isPalindrome, Solution234.ListNode listNode) {
        assertEquals(isPalindrome, solution.isPalindrome(listNode));
    }

    public static Stream<Arguments> palindromes() {
        return Stream.of(
                Arguments.of(true, new Solution234.ListNode(1, new Solution234.ListNode(2, new Solution234.ListNode(2, new Solution234.ListNode(1)))))
                ,
                Arguments.of(false, new Solution234.ListNode(1, new Solution234.ListNode(2)))
                ,
                Arguments.of(true, new Solution234.ListNode(1, null))
        );
    }
}
