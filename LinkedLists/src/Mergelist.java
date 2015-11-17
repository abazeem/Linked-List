public class Mergelist {
	
	public static void main(String args[])
	{
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(4);
		head.next.next.next = new Node(5);
		head.next.next.next.next = new Node(6);
		Node second = new Node(3);
		second.next = new Node(7);
		head = merge(head,second);
		disp(head);
	}
	
	public static void disp(Node head)
	{
		while(head!=null)
		{
			System.out.println(head.val);
			head = head.next;
		}
		if(head==null)
			return;
	}

	public static Node merge(Node a , Node b)
	{
		Node x= null;
		Node temp = null;
		while(a!=null &b!=null)
		{
			if(a.val < b.val)
			{	
				x = push(x,a);			
				a = a.next;
			}
			else
			{
				x= push(x,b);
				b = b.next;
			}
			if(length(x)==1)
				temp = x;
			else
				x = x.next;
		}
		if(a==null)
			x.next = b;
		if(b==null)
			x.next = a;
			
		return temp;
	}
	
	public static int length(Node x)
	{
		int count = 0;
		while(x!=null)
		{
			count++;
			x = x.next;
		}
		return count;
	}

	public static Node push(Node x , Node v)
	{
		if(x == null)
			x =  new Node(v.val);
		else
			x.next = new Node(v.val);
		return x;
	}
}