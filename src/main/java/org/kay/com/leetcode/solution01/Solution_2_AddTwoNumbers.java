package org.kay.com.leetcode.solution01;

/**
 * 2_Add Two Numbers
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number
 * 0 itself.
 * <p>
 * Example:
 *      Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *      Output: 7 -> 0 -> 8
 * Explanation:
 *      342 + 465 = 807.
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 *    int val;
 *    ListNode next;
 *    ListNode(int x) {
 *      val = x;
 *    }
 * }
 */
public class Solution_2_AddTwoNumbers {

    public static void main(String[] args) {
        ListNode listNode0 = new ListNode(0);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);

        listNode0.next = listNode1;
        listNode1.next = listNode2;

        System.out.println(listNode0);
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
    }

    private static class ListNode {
        int      val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
