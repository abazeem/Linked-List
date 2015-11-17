
public class Segregateevenodd {

	public static void main(String args[])
	{
		Node a = new Node(4);
		a.next = new Node(6);
		a.next.next = new Node(1);
		a.next.next.next = new Node(10);
		a.next.next.next.next = new Node(3);
		seg(a);
	}
	
	public static void seg(Node head)
	{
		Node two = null;
		Node list = null;
		Node temp;
		//int count = 0;
		Node a = head;
		while(a != null)
		{
			if( a.val % 2 == 1)
			{
				a = a.next;
				continue;
			}
			Node even = a;
			temp = a.next;
			a.next = null;
			Node prev = head;
			if(head == a)
				prev = null;
			else
			{	
				while(prev.next != a)
					prev = prev.next;
			}
			if(prev == null)
			{
				a = temp;
				head = a;
			}
			else
			{
				prev.next = temp;
				a = temp;
			}
			if(list == null)
			{
				list = even;
				two = even;
			}
			else
			{
				list.next = even;
				list = list.next;
			}
		}
		disp(head);
		disp(two);
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
}
