package com.lisek.leetcode._206ReverseLinkedList;


public class Solution206 {

    public ListNode reverseList(ListNode head) {

        ListNode previous = null;
        ListNode current = head;

        while (current != null) {

            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
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
