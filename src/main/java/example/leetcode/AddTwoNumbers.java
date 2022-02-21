package example.leetcode;

public class AddTwoNumbers {
    public static void main(String[] args) {

        int[] arr1 = {2, 4, 9};
        int[] arr2 = {5, 6, 4, 9};
        ListNode l1 = new ListNode(arr1[0]);
        for (int i = 1; i < arr1.length; i++) {
            l1.next = new ListNode(arr1[i]);
            l1 = new ListNode(arr1[i]);
        }
        ListNode l2 = null;
        for (int i = 0; i < arr2.length; i++) {
            l2 = new ListNode(arr2[i], l2);
        }

        ListNode.print(l1);
        ListNode.print(l2);
        //ListNode listNode = addTwoNumbers(l1, l2);
        //ListNode.print(listNode);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode.print(l1);
        int number1 = getListNodeNumber(l1);
        int number2 = getListNodeNumber(l2);
        System.out.println("number1 " + number1);
        System.out.println("number2 " + number2);
        int sum = number1 + number2;
        System.out.println("Sum " + sum);

        char[] chars = String.valueOf(sum).toCharArray();
        ListNode reverseSum = null;
        for (int i = 0; i < chars.length; i++) {
            reverseSum = new ListNode(Integer.parseInt(String.valueOf(chars[i])), reverseSum);
        }
        return reverseSum;
    }

    private static int getListNodeNumber(ListNode l1) {
        String s1 = "";
        while (true) {
            s1 = s1 + l1.val;
            if (l1.next == null) {
                break;
            }
            l1 = l1.next;
        }
        return Integer.parseInt(s1);
    }
}


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void print(ListNode listNode) {
        while (true) {
            System.out.print(" " + listNode.val);
            if (listNode.next == null) {
                break;
            }
            listNode = listNode.next;
        }
        System.out.println();
    }
}

