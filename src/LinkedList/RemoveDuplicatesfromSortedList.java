package LinkedList;

class Node {
    int val;
    Node next; // Use 'Node' consistently, not 'ListNode'

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveDuplicatesfromSortedList {
    public static Node removeDuplicatesfromSortedList(Node head) {
        if (head == null) return null;

        Node temp = head;

        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                // Move to the next node if no duplicate
                temp = temp.next;
            }
        }
        return head;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        head = removeDuplicatesfromSortedList(head);

        printList(head);
    }
}
