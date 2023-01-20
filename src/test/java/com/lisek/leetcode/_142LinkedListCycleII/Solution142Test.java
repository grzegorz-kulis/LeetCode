package com.lisek.leetcode._142LinkedListCycleII;

import org.junit.jupiter.api.Test;

import static com.lisek.leetcode._142LinkedListCycleII.Solution142.ListNode;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution142Test {

    private final Solution142 solution142 = new Solution142();

    @Test
    void testSolution1() {
        solution142.detectCycle(new ListNode(1, new ListNode(2)));
    }

}