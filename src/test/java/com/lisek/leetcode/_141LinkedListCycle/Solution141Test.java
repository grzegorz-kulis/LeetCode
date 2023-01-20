package com.lisek.leetcode._141LinkedListCycle;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.function.Supplier;
import java.util.stream.Stream;

import static com.lisek.leetcode._141LinkedListCycle.Solution141.ListNode;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution141Test {

    Solution141 solution141 = new Solution141();

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(
                        true,
                        (Supplier<ListNode>) () -> {
                            ListNode cycleEnd = new ListNode(4);
                            ListNode cycleStart = new ListNode(2, new ListNode(0, cycleEnd));
                            cycleEnd.next = cycleStart;
                            return new ListNode(3, cycleStart);
                        }
                )
                ,
                Arguments.of(
                        true,
                        (Supplier<ListNode>) () -> {
                            ListNode cycleEnd = new ListNode(2);
                            ListNode cycleStart = new ListNode(1, cycleEnd);
                            cycleEnd.next = cycleStart;
                            return cycleStart;
                        }
                )
                ,
                Arguments.of(
                        false,
                        (Supplier<ListNode>) () -> new ListNode(1)
                )
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void testSolution(boolean expected, Supplier<ListNode> listNodeSupplier) {
        assertEquals(expected, solution141.hasCycle(listNodeSupplier.get()));
    }

}