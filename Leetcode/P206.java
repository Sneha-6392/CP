package CP.Leetcode;
// 206. Reverse Linked List
public class P206 {
    int val;
    P206 next;
    P206() {}
    P206(int val) {
        this.val = val;
    }
    P206(int val, P206 next) {
        this.val = val;
        this.next = next;
    }
}
class Solution {
    public P206 reverseList(P206 head) {
        P206 curr = head;
        P206 prev = null;
        P206 next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}