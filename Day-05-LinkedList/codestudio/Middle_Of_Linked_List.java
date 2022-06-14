import java.util.* ;
import java.io.*; 

public class Solution 
{
    public static Node findMiddle(Node head) 
    {
        // If head is null just return null
        if (head == null) 
        {
           return head;
        }
    
        // If the Linked List has just 1 element that element is the middle
        if (head.next == null) 
        {
           return head;
        }

        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) 
        {
           fast = fast.next.next;
           slow = slow.next;
        }
        
        return slow;
    }
}

