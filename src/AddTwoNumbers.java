/*
public class AddTwoNumbers {


    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode startNode = null;
        ListNode temp = null;

        int rest = 0;
        // Loop for the two lists
        while (l1 != null || l2 != null) {

            int sum = rest;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode node = new ListNode(sum % 10);

            rest = sum / 10;

            if (temp == null) {
                temp = startNode = node;
            }

            else {
                temp.next = node;
                temp = temp.next;
            }
        }

        if (rest > 0) {
            temp.next = new ListNode(rest);
        }
        return startNode;
    }
}

// Definition for singly-linked list.
  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) {
         this.val = val;
     }
     ListNode(int val, ListNode next) {
         this.val = val; this.next = next;
     }
 }
*/
