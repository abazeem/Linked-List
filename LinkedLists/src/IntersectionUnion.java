public class IntersectionUnion {
	
	public static void main(String args[])
	{
		Node a = new Node(10);
		a.next = new Node(20);
		a.next.next = new Node(30);
		a.next.next.next = new Node(40);
		Node b = new Node(30);
		b.next = new Node(50);
		Node c = intersection(a,b);
		disp(c);
		Node d = Union(a,b);
		disp(d);
	}

	public static Node intersection(Node a , Node b)
	{
		Node c = new Node(0);
		Node temp = c;
		while(b!=null)
		{
			if(check(a,b.val))
			{
				if(c.val == 0 && b.val != 0)
					c.val = b.val;
				else
				{
					c.next = new Node(b.val);
					c= c.next;
				}
			}
			b = b.next;
		}
		return temp;
	}
	
	public static boolean check(Node a, int val)
	{
		while(a!=null)
		{
			if(a.val == val)
				return true; 
				a = a.next;
		}
		return false;
	}

	public static void disp(Node a)
	{
		while(a!=null)
		{
			System.out.println(a.val);
			a = a.next;
		}
		return;
	}

	public static Node Union(Node a , Node b)
	{
		Node a_last = a;
		while(a_last.next!=null)
		{
			a_last = a_last.next;
		}
		while(b!=null)
		{
			if(!check(a,b.val))
			{
				Node temp = b.next;
				a_last.next = b;
				a_last = a_last.next;
				b.next = null;
				b =temp;
			}
			else
				b=b.next;
		}
		return a;
	}
}
