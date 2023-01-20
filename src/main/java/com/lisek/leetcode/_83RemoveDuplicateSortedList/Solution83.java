package com.lisek.leetcode._83RemoveDuplicateSortedList;


public class Solution83 {

    public ListNode deleteDuplicates(ListNode head) {

        System.out.println("Given: " + head);

        ListNode current = head;

        while (current != null) {
            if (current.next == null) break;
            if (current.val.equals(current.next.val)) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
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
