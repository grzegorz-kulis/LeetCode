package com.lisek.leetcode._21MergeTwoSortedLists;

public class Solution21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prehead = new ListNode(-1);
        ListNode current = prehead;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = list1 == null ? list2 : list1;
        return prehead.next;
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
