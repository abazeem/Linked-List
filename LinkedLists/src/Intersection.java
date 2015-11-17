
public class Intersection {
	
	public static void main(String args[])
	{
		Node head = new Node(2);
		head.next = new Node(2);
		head.next.next = new Node(1);
		head.next.next.next = new Node(2);
		head.next.next.next.next = new Node(2);
		Node second = new Node(3);
		second.next = head.next.next;
		Node a = getintersection(head,second);
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
	
	public static Node getintersection(Node a, Node b)
	{
		Node temp = null;
		int l1 = length(a);
		int l2 = length(b);
		if(l1>l2)
			a = traverse(a,l1-l2);
		else
			b = traverse(b,l2-l1);
		while(a!=null && b!=null)
		{
			if( a == b)
			{
				temp = a;
				break;
			}
			a = a.next;
			b = b.next;
		}
		if(temp== null)
			System.out.println("No intersection point");
		else
			System.out.println("Intersection point " + temp.val);
		return temp;		
	}
	
	public static Node traverse(Node a, int l)
	{
		while(l>0)
		{
			a = a.next;
			l--;
		}
		return a;
	}
}
