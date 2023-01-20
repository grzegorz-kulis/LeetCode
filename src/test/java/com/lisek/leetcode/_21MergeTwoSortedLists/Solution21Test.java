package com.lisek.leetcode._21MergeTwoSortedLists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution21Test {

    Solution21 solution21 = new Solution21();

    public static Stream<Arguments> lists() {
        return Stream.of(
                Arguments.of(
                        new Solution21.ListNode(1, new Solution21.ListNode(1, new Solution21.ListNode(2, new Solution21.ListNode(3, new Solution21.ListNode(4, new Solution21.ListNode(4)))))),
                        new Solution21.ListNode(1, new Solution21.ListNode(2, new Solution21.ListNode(4))),
                        new Solution21.ListNode(1, new Solution21.ListNode(3, new Solution21.ListNode(4)))
                )
                ,
                Arguments.of(
                        new Solution21.ListNode(),
                        new Solution21.ListNode(),
                        new Solution21.ListNode()
                )
                ,
                Arguments.of(
                        new Solution21.ListNode(0),
                        new Solution21.ListNode(),
                        new Solution21.ListNode(0)
                )
                ,
                Arguments.of(
                        new Solution21.ListNode(1, new Solution21.ListNode(2, new Solution21.ListNode(3, new Solution21.ListNode(4, new Solution21.ListNode(5, new Solution21.ListNode(6)))))),
                        new Solution21.ListNode(2, new Solution21.ListNode(5, new Solution21.ListNode(6))),
                        new Solution21.ListNode(1, new Solution21.ListNode(3, new Solution21.ListNode(4)))
                )
        );
    }

    @ParameterizedTest
    @MethodSource("lists")
    void testSolution(Solution21.ListNode expected, Solution21.ListNode list1, Solution21.ListNode list2) {
        assertEquals(expected, solution21.mergeTwoLists(list1, list2));
    }

    @Test
    void testEquals() {
        assertEquals( new Solution21.ListNode(1, new Solution21.ListNode(1, new Solution21.ListNode(2, new Solution21.ListNode(3, new Solution21.ListNode(4, new Solution21.ListNode(4)))))),
                new Solution21.ListNode(1, new Solution21.ListNode(1, new Solution21.ListNode(2, new Solution21.ListNode(3, new Solution21.ListNode(4, new Solution21.ListNode(4)))))));
    }

}