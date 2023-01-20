package com.lisek.leetcode._83RemoveDuplicateSortedList;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.lisek.leetcode._83RemoveDuplicateSortedList.Solution83.ListNode;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution83Test {

    private final Solution83 solution83 = new Solution83();


    public static Stream<Arguments> nodes() {
        return Stream.of(
                Arguments.of(
                        new ListNode(1, new ListNode(2)),
                        new ListNode(1, new ListNode(1, new ListNode(2)))
                ),
                Arguments.of(
                        new ListNode(1, new ListNode(2, new ListNode(3))),
                        new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))))
                )
                ,
                Arguments.of(
                        new ListNode(1),
                        new ListNode(1, new ListNode(1, new ListNode(1)))
                )
        );
    }

    @ParameterizedTest
    @MethodSource("nodes")
    void testSolution(ListNode expectedNode, ListNode head) {
        assertEquals(expectedNode, solution83.deleteDuplicates(head));
    }

}