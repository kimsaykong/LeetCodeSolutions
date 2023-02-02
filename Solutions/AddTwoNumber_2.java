package Solutions;
// Medium problem

// You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order, and each of their nodes contains a single digit.
// Add the two numbers and return the sum as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
public class AddTwoNumber_2 {
    /**
     * Definition for singly-linked list.
     */
     public static class ListNode {
          int val;
          ListNode next;
          public ListNode() {}
          public ListNode(int val) { this.val = val; }
          public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int temp1=0,temp2=0,tempresult=0,carry = 0;
        ListNode header = new ListNode();
        ListNode result = new ListNode();
        header = result;
        while (l1 != null || l2!=null){
             if (l1 == null){
                 temp1 = 0;
             }else {
                 temp1 = l1.val;
                 l1 = l1.next;
             }
             if (l2==null){
                 temp2 = 0;
             }else {
                 temp2 = l2.val;
                 l2 = l2.next;
             }
             tempresult = temp1 + temp2 + carry;
             if (tempresult > 9){
                 carry = 1;
                 tempresult = tempresult%10;
             }else{
                 carry = 0;
             }
             result.val = tempresult;
             if (l1 != null || l2 != null){
                result.next = new ListNode();
            }else {
                 if (carry>0) result.next = new ListNode(carry);
             }
             result = result.next;
         }
        return header;
    }
}
