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
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode nextNode = head;
        ListNode pre = null;
        while(nextNode!=null){
            nextNode = nextNode.next;
            temp.next = pre;
            pre = temp;
            temp = nextNode;
        }
        head = pre;

        return head;
    }
}