import java.util.* ;
import java.io.*; 
/****************************************************************

       Following is the class structure of the Node class:

       class Node {
	int data;
	Node next;
	Node child;

	public Node(int data) {
		this.data = data;
		this.next = null;
		this.child = null;
	}
}

*****************************************************************/
public class Solution 
{
    static Node merge(Node a,Node b)
    {
        Node temp=new Node(1);
        Node res=temp;
        while(a!=null && b!=null)
        {
            if(a.data <= b.data)
            {
                temp.child=a;
                a=a.child;
                temp=temp.child;
                temp.next=null;
            }
            else
            {
                temp.child=b;
                b=b.child;
                temp=temp.child;
                temp.next=null;
            }
        }
        if(a!=null)
            temp.child=a;
        if(b!=null)
            temp.child=b;
    return res.child;
}
public static Node flattenLinkedList(Node head) 
{
    // Write your code here
    if(head==null || head.next==null)
        return head;
    
    Node right=flattenLinkedList(head.next);
    
    return merge(head,right);
}
}
