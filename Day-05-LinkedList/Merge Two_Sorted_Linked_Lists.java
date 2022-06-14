import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {

    public static LinkedListNode<Integer> sort(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        
        // When only one node is in first list, point its head to the second list.
        if (first.next == null) {
            first.next = second;
            return first;
        }

        LinkedListNode<Integer> cur1 = first, next1 = first.next;
        LinkedListNode<Integer> cur2 = second, next2 = second.next;

        while (next1 != null && cur2 != null) {
            if ((cur2.data) >= (cur1.data) && (cur2.data) <= (next1.data)) {
                next2 = cur2.next;
                cur1.next = cur2;
                cur2.next = next1;

                // Let cur1 and cur2 to point to their immediate next pointers.
                cur1 = cur2;
                cur2 = next2;
            } 
            
            else {
                
                // If there are more nodes in first list.
                if (next1.next != null) {
                    next1 = next1.next;
                    cur1 = cur1.next;
                }

                // Else point the last node of first list to the remaining nodes of second list.
                else {
                    next1.next = cur2;
                    return first;
                }
            }
        }

        return first;
    }

    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        
        if (first == null) {
            return second;
        }
        
        if (second == null) {
            return first;
        }

        if ((first.data) < (second.data)) {
            return sort(first, second);
        } 
        else {
            return sort(second, first);
        }
    }

}
