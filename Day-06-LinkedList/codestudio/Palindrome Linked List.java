import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
    public static boolean isPalindrome(LinkedListNode<Integer> head) {

        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        LinkedListNode<Integer> prev = head;

        // Find the middle node using TORTOISE-HARE-APPROACH.
        while (fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }

        /*
            Fast pointer would become NULL when there are even elements in the list and
            not NULL for odd elements. We need to skip the middle node for odd case.
        */

        if (fast != null) {
            slow = slow.next;
        }

        // When there is only one node in given Linked List.
        if (slow == null) {

            return true;
        }

        // Dividing Linked LIst in two part by pointing prev next to null.
        prev.next = null;

        // Now reverse the second half.
        LinkedListNode<Integer> reverseHead = reverse(slow);

        // Iterate through both LinkedList and then compare it.
        while (head != null) {

            if (!head.data.equals(reverseHead.data)) {
                return false;
            }
            reverseHead = reverseHead.next;
            head = head.next;

        }
        return true;

    }

    // Reverse the LinkedList.
    private static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {

        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> reverseHead = null;

        while (current != null) {

            LinkedListNode<Integer> currentNext = current.next;
            current.next = reverseHead;
            reverseHead = current;
            current = currentNext;

        }
        return reverseHead;

    }
}