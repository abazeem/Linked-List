
public class addreverse {

	public  static void main(String args[])
	{
		Node head = new Node(1);
//		Node second = new Node(2);
		head.next= new Node(2);
		head.next.next= new Node(3);
		head.next.next.next= new Node(4);
		head.next.next.next.next= new Node(5);
		head.next.next.next.next.next= new Node(6);
		head.next.next.next.next.next.next= new Node(7);
		
		Node last =slice(head);
		append(head, last);
		disp(head);
	}
	
	public static void disp(Node head)
	{
		while(head!=null)
		{
			System.out.println(head.val);
			head = head.next;
		}
//		if(head==null)
		return;
	}
	
	public static Node slice(Node head)
	{
		Node t1 = null;
		Node t2 = head.next;
		Node t3 = null;
		while(head!=null)
		{
			t1 = head.next;
			if(head.next==null)
				return t2;
			else
			{
				head.next= head.next.next;
				t1.next = null;
				head = head.next;
				if(t1==t2)
					t3=t1;
				else
					{
						t3.next = t1;
						t3 = t3.next;
					}
			}
		}
		return t2;
	}
	public static void append(Node first,Node last)
	{	
		Node b = last;
		Node a = null;
		Node c = null;
		while(  b!=null)
		{
			c = b.next;
			b.next = a;
			a= b;
			b=c;
			if(first.next!=null)
			first= first.next;
		}
		first.next = a;
	}
}	
	

