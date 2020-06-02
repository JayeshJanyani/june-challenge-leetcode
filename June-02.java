/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        while(node.next.next!=null){
            node.val=node.next.val;
            System.out.println(node.val);
            node=node.next;
        }
        System.out.println(node.val);
        node.val=node.next.val;
        node.next=null;
    }
}