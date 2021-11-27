import java.util.*;

class Main {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    //midNode can be optimised -> optimized code written in midNodeOptimized method
    public static ListNode midNode(ListNode head) {
        
        int length = 0;
        ListNode temp = head;
        
        //firstly we will calculate the length of the linked list
        while(temp != null){
            temp = temp.next;
            length++;
        }
        //calculating the mid element
        length = (length - 1)/2;
        System.out.println(length);
        //iterating from 0th node to middle node
        ListNode temp1 = head;
        System.out.println(temp1.val);
        while(length > 0){
            temp1 = temp1.next;
            length--;
        }
        
        return temp1;
    }

    public static ListNode midNodeOptimized(ListNode head){
        return null;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = midNode(dummy.next);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}