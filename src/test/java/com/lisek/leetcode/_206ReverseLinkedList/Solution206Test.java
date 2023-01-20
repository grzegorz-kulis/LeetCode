package com.lisek.leetcode._206ReverseLinkedList;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static com.lisek.leetcode._206ReverseLinkedList.Solution206.*;

class Solution206Test {


    private final Solution206 solution206 = new Solution206();

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(
                        new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1))))),
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))
                )
                ,
                Arguments.of(
                        new ListNode(2, new ListNode(1)),
                        new ListNode(1, new ListNode(2))
                )
                ,
                Arguments.of(
                        null,
                        null
                )
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void testSolution(ListNode expected, ListNode head) {
        assertEquals(expected, solution206.reverseList(head));
    }

}