package homework;

public class MyLinkedList {

    static ListNode head;

    public static void main(String[] args) {

        head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);

        head.next = n2;
        n2.next = n3;

        head = addHeadNode(head, -1);

        head = addNode(head, 100, 1);

        printLinkedList(head);
        System.out.println("-----------");

        System.out.println(getIndex(5));
        System.out.println("-----------");

        head = deleteAtIndex(head, 1);
        printLinkedList(head);

    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.println(head);
            head = head.next;
        }
    }

    public static int getIndex(int index) {

        int cnt = 0;
        ListNode temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == index) {
                return temp.value;
            }
            temp = temp.next;
        }
        return -1;
    }

    public static void addpendNode(ListNode head, int val) {
        ListNode newNode = new ListNode(val);

        while (true) {
            if (head.next == null) {
                head.next = newNode;
                break;
            }
            head = head.next;
        }
    }

    public static ListNode addHeadNode(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;

        return newNode;
    }

    // add newNode to k postion in ListNode
    public static ListNode addNode(ListNode head, int val, int k) {
        /*
         * int val -> newNode's value
         * int k -> k position
         * */

        ListNode newNode = new ListNode(val);

        if (k == 1) {
            return addHeadNode(head, val);
        }

        int cnt = 0;
        while (head != null) {

            cnt++;
            if (cnt == k - 1) {
                newNode.next = head.next;
                head.next = newNode;
                break;
            }
            head = head.next;

        }
        return head;
    }

    public static ListNode deleteHead(ListNode head) {
        head = head.next;
        return head;
    }

    public static ListNode deleteLastNode(ListNode head) {
        if (head.next == null) {
            return null;
        }

        ListNode temp = head;
        while (temp != null) {
            if (temp.next.next == null) {
                temp.next = null;
                break;
            }
            temp = temp.next;
        }

        return head;
    }

    public static ListNode deleteAtIndex(ListNode head, int index) {
        if (index == 1) {
            return deleteHead(head);
        }
        int cnt = 0;
        ListNode temp = head;

        while (temp != null) {
            cnt++;
            if (cnt == index - 1) {
                if (temp.next.next == null) {
                    temp.next = null;
                    return head;
                }
                temp.next = temp.next.next;
                return head;

            }
            temp = temp.next;
        }
        return head;
    }
}
