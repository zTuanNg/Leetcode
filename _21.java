package homework;

public class _21 {
    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode(0);
        ListNode l3 = head;

        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                l3.next = list1;
                list1 = list1.next;
            } else {
                l3.next = list2;
                list2 = list2.next;
            }
            l3 = l3.next;

        }

        if (list1 != null) {
            l3.next = list1;
        }
        if (list2 != null) {
            l3.next = list2;
        }

        return head.next;
    }
}
