
public class mergealternate {

	public static void main(String args[])
	{
		Node a = new Node(1);
		a.next = new Node(2);
		a.next.next = new Node(3);
		a.next.next.next = new Node(6);
		Node b = new Node(4);
		b.next = new Node(5);
		a = calc(b,a);
		disp(a);
	}
	public static void disp(Node a)
	{
		while(a!=null)
		{
			System.out.println(a.val + " ");
			a = a.next;
		}
		return;
	}
	
	public static Node calc(Node a, Node b)
	{
		Node head = a;
		while(a!=null && b!=null)
		{
			Node temp1 = b;
			b = b.next;
			Node temp2 = a.next;
			a.next = temp1;
			temp1.next = temp2;
			a = temp2;
		}
/*		if(a==null && b!=null)
		{
			a = head;
			while(a.next!=null)
				a = a.next;
			a.next = b;
		}
		*/
		return head;
	}
}
