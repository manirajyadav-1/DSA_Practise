package LinkedList;

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MiddleOfLinkedList {

    public ListNode1 middleNode(ListNode1 head){
        ListNode1 slow = head;
        ListNode1 fast = head;


        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public void printList(ListNode1 head) {
        ListNode1 curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MiddleOfLinkedList list = new MiddleOfLinkedList();

        ListNode1 head = new ListNode1(1);
        head.next = new ListNode1(2);
        head.next.next = new ListNode1(3);
        head.next.next.next = new ListNode1(4);
        head.next.next.next.next = new ListNode1(5);

        System.out.println("Original List:");
        list.printList(head);

        // Find the middle node
        ListNode1 middle = list.middleNode(head);

        // Print the middle node's value
        System.out.println("Middle Node: " + middle.val);
    }
}
