import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        LinkedListNode(T data)
        {
            this.data = data;
            this.next = null;
        }
    }

*****************************************************************/

public class Solution {
    public static void deleteNode(LinkedListNode<Integer> node) {
     LinkedListNode<Integer>head = node;
        LinkedListNode<Integer>prev = null;
     
           while(head.next != null){
            int temp = head.next.data;
        
                head.data = temp;
            prev = head;
            head = head.next;
        } 
        prev.next = null;    
    }
}