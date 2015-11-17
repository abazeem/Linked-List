
public class MergeSort {

	public static void main(String args[])
	{
		Node a = new Node(4);
		a.next = new Node(6);
		a.next.next = new Node(1);
		a.next.next.next = new Node(10);
		a.next.next.next.next = new Node(3);
		a = mergesort(a, a.next.next.next.next);
		disp(a);
	}
	
	public static void disp(Node x)
	{
		while(x!=null)
		{
			System.out.println(x.val + " ");
			x = x.next;
		}
		return;			
	}
	
	public static Node mergesort(Node head, Node tail)
	{
		if( head == null  )
			return null;
		if( head == tail)
			return head;
		Node mid = getmid(head);
		Node temp = mid.next;
		mid.next = null;
		head = mergesort(head, mid);
		temp = mergesort(temp, tail);
		head = merge(head,temp);
		return head;
	}
	public static Node merge(Node a, Node b)
	{
		if( a == null)
			return b;
		if ( b == null)
			return a;
		Node result;
		if ( a.val < b.val)
		{
			result = a;
			result.next = merge(a.next,b);
		}
		else
		{
			result = b;
			result.next = merge(a,b.next);
		}
		return result;
	}
	
	
	public static Node getmid(Node x)
	{
		if(x == null)
			return null;
		Node temp = x;
		while(x.next != null && x.next.next != null)
		{
			temp = temp.next;
			x = x.next.next;
		}
		return temp;
	}
}
