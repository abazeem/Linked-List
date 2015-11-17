
public class oddeven {

	public static void main(String args[])
	{
		Node x = new Node(2);
		x.next = new Node(2);
		x.next.next = new Node(1);
		x.next.next.next = new Node(4);
		x.next.next.next.next = new Node(4);
		split(x,x.next.next.next.next );
	}
	
	public static void split(Node head, Node last)
	{
		Node tail = last;
		Node odd = head;
		Node even = null;
		Node prev = null;
		Node breakpoint = null;
		while( head != last.next)
		{
			if(head == even)
				break;
			if(head.val % 2 == 0)
			{
				Node temp = head.next;
				if(prev != null)
					prev.next = temp;
				else
					odd = temp;
				tail.next = head;
				tail = head;
				head.next = null;
				head = temp;
			}
			else
			{
				prev = head;
				head = head.next;
			}
			if(head == last)
			{
				if(last.val%2==0)
					breakpoint = prev;
				else
					breakpoint = last;
			even = breakpoint.next;
			breakpoint.next = null;
			}
			}
		print(odd);
		System.out.println("");
		print(even);
		
	}
	
	public static void print(Node x)
	{
		while(x!= null)
		{
			System.out.print(x.val + " ");
			x = x.next;
		}
	}
}
