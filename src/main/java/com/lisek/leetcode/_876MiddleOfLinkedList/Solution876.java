package com.lisek.leetcode._876MiddleOfLinkedList;

public class Solution876 {

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        ListNode result = head;
        while (slow.next != null && fast.next != null) {
            slow = slow.next;

            if (fast.next.next == null) return slow;

            fast = fast.next.next;

            if (fast.next == null) return slow;
        }

        return result;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        // sufficient but bad
        @Override
        public boolean equals(Object obj) {
            System.out.println("comparing");
            if (!(obj instanceof ListNode)) return false;

            ListNode node = (ListNode) obj;

            return node.val == this.val;
        }
    }
}
