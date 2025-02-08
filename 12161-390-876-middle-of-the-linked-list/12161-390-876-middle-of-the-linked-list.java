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
    public ListNode middleNode(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        //travel until fast pointer reaches the last node
        while(fastPtr != null && fastPtr.next != null){
            //slow poniter move one node
            slowPtr = slowPtr.next;

            //fastPtr move 2 node
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }
}