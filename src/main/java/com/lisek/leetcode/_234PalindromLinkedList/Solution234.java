package com.lisek.leetcode._234PalindromLinkedList;

public class Solution234 {

    public boolean isPalindrome(ListNode head) {

        // 1 9 2 3 3 2 9 1
        // 1-9+2-3+3-2+9-1 = 0 palindrome

        // 1 2 2 1
        // 1-2+2-1 = 0 palindrome

        // 1 0 1
        // 1+0-1 = 0 palindrome

        // 4 9 4

        int sum = 0;

        boolean deduct = true;

        if (head.next == null) return true;

        do {

            int currentValue = head.val;
            if (deduct) sum = sum - currentValue;
            else sum = sum + currentValue;

            deduct = !deduct;
            head = head.next;

        } while(head != null);

        return sum == 0;
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
    }
}
