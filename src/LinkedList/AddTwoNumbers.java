// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;


            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }


            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }


            sum += carry;
            carry = sum / 10;


            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = temp.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));


        ListNode result = addTwoNumbers(l1, l2);

        // Print the result list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

