package com.lisek.leetcode._876MiddleOfLinkedList;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution876Test {


    Solution876 solution876 = new Solution876();

    public static Stream<Arguments> nodes() {
        return Stream.of(
                Arguments.of(
                        new Solution876.ListNode(3, new Solution876.ListNode(4, new Solution876.ListNode(5))),
                        new Solution876.ListNode(1, new Solution876.ListNode(2, new Solution876.ListNode(3, new Solution876.ListNode(4, new Solution876.ListNode(5)))))
                ),
                Arguments.of(
                        new Solution876.ListNode(4, new Solution876.ListNode(5, new Solution876.ListNode(6))),
                        new Solution876.ListNode(1, new Solution876.ListNode(2, new Solution876.ListNode(3, new Solution876.ListNode(4, new Solution876.ListNode(5, new Solution876.ListNode(6))))))
                )
        );
    }

    @ParameterizedTest
    @MethodSource("nodes")
    void testSolution(Solution876.ListNode expectedNode, Solution876.ListNode head) {
        assertEquals(expectedNode, solution876.middleNode(head));
    }
}