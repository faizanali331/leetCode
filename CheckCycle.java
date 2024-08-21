import java.util.Stack;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class CheckCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;

        Stack<ListNode> st = new Stack<>();

        while(head!=null){
            if(st.contains(head)){
                return true;
            }
            else{
                st.push(head);
                head=head.next;
            }
        }
        return false;
    }
}
