
public class reversekth {

	public static void main(String args[])
	{
		Node a = new Node(4);
		a.next = new Node(6);
		a.next.next = new Node(1);
		a.next.next.next = new Node(10);
		a.next.next.next.next = new Node(3);
		a.next.next.next.next.next = new Node(12);
		a.next.next.next.next.next.next = new Node(2);
		a.next.next.next.next.next.next.next = new Node(13);
		a = rev(a,3);
		disp(a);
		
	}
	
	public static void disp(Node x)
	{
		while(x!=null)
		{
			System.out.print(x.val + " ");
			x = x.next;
		}
		return;			
	}
	
	public static Node rev(Node head, int k)
	{
		Node current = head;
		Node prev = null;
		Node next = null;
		int count = 0;
		while(current != null && count < k)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		if( head != null)
			head.next = current;
		count = 0;
		while(current!=null && count < k-1)
		{
			current = current.next;
			count++;
		}
		if(current!= null)
			current.next = rev(current.next, k);
		return prev;
			
	}
}
