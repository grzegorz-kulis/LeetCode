package com.lisek.leetcode._141LinkedListCycle;

public class Solution141 {

    public boolean hasCycle(ListNode head) {

        ListNode current = head;

        while (current != null) {

            if (Integer.MIN_VALUE == current.val) return true;

            current.val = Integer.MIN_VALUE;

            current = current.next;
        }

        return false;
    }

    public static class ListNode {
        Integer val;
        ListNode next;

        ListNode() {
        }

        ListNode(Integer val) {
            this.val = val;
        }

        ListNode(Integer val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "-[" + val + "]-" + ((next != null) ? next.toString() : "");
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof ListNode node)) return false;

            boolean valuesEqual = false;
            if (this.val == node.val) valuesEqual = true;

            boolean nextValuesNull = this.next == null || node.next == null;

            return valuesEqual && (nextValuesNull || this.next.equals(node.next));
        }
    }
}
