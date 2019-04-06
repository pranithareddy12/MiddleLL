import java.util.*;
public class MiddleElement
{
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static  Node head=null;
    public static Node tail=null;
    public static void add(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            Node temp=head;
            head=newnode;
            head.next=temp;
        }
    }
    public static void printMiddle(int n) 
    { 
        Node slow_ptr = head; 
        Node fast_ptr = head; 
        if (head != null) 
        { 
            while (fast_ptr.next != null && fast_ptr.next.next != null) 
            { 
                fast_ptr = fast_ptr.next.next; 
                slow_ptr = slow_ptr.next; 
            } 
            if(n%2!=0)
                System.out.println(slow_ptr.data); 
            else
            {
                System.out.println(slow_ptr.data); 
            }
        } 
    } 
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		MiddleElement l=new MiddleElement();
		for(int i=0;i<n;i++){
		    l.add(s.nextInt());
		}
	
		    l.printMiddle(n);
	
	}
}