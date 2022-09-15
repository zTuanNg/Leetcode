package homework;

public class _203 {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(2);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        printLinkedList(head);
        System.out.println("-------");

        head = removeElements(head, 2);
        printLinkedList(head);
        System.out.println("-------");

        head = removeElements2(head, 2);
        printLinkedList(head);

    }

    public static ListNode removeElements(ListNode head, int val) {

        ListNode pNode = null;
        ListNode cNode = head;

        while (cNode != null) {
            if (cNode.value == val) {
                if (pNode == null) {
                    head = head.next;
                } else {
                    pNode.next = cNode.next;
                    cNode = cNode.next;
                }
            } else {
                pNode = cNode;
                cNode = cNode.next;
            }
        }

        return head;
    }

    public static ListNode removeElements2(ListNode head, int val) {
        ListNode prev = head;
        ListNode curr = head;

        while (curr != null) {
            if (curr.value == val) {
                prev.next = curr.next;
                curr = curr.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        if (head != null && head.value == val) {
            return head.next;
        }
        return head;
    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.println(head);
            head = head.next;
        }
    }
}
