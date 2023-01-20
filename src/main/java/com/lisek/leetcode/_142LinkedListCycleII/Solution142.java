package com.lisek.leetcode._142LinkedListCycleII;

public class Solution142 {

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        if (fast == null || fast.next == null) return null;
        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }
        return head;
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
