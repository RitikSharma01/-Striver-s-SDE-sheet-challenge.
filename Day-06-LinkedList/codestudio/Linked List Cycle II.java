import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

        class Node
		{
		    public int data;
		    public Node next;

		    Node(int data)
		    {
		        this.data = data;
		        this.next = null;
		    }
		}

*****************************************************************/

public class Solution  

{

   public static Node firstNode(Node head)  

   {

       //    Write your code here.

 if(head==null ||head.next==null){

  return null;

 }

 Node fast = head;

 Node slow = head;

 while(fast!=null && fast.next!= null){

  fast = fast.next.next;

  slow = slow.next;

  if(fast == slow){

   break;

  }

 }

 if(slow!=fast){

  return null;

 }

 fast = head;

 while(fast!=slow){

  slow = slow.next;

  fast = fast.next;

 }

 return slow;

   }

}