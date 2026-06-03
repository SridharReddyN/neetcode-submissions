/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = null;
        ListNode temp = null;
        ListNode holder = null;
        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null && list1.val <= list2.val) {
                holder = list1;
                list1 = list1.next;
            } else if (list2 != null) {
                holder = list2;
                list2 = list2.next;
            } else if (list1 != null) {
                holder = list1;
                list1 = list1.next;
            }

            holder.next = null;

            if (merged == null) {
                merged = holder;
                temp = merged;
            } else {
                temp.next = holder;
                temp = temp.next;
            }
        }
        return merged;
    }
}