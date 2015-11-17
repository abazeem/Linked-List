
public class quicksort3 {

	public static void main(String  args[])
	{
		Node a = new Node(30);
		a.next = new Node(20);
		a.next.next = new Node(10);
		a.next.next.next = new Node(40);
		Node b = sort(a, a.next.next.next);
		while(b!= null)
		{	
			System.out.print(b.val + " ");
			b = b.next;
		}
	}
	
	public static Node partition(Node head, Node tail, Point h1, Point t1)
	{
		Node pivot =tail;
		Node current = head;
		Node prev = null;
		while(current != pivot)
		{
			if(current.val < pivot.val)
			{
				if( h1.node == null)
					h1.node = current;
				prev = current;
				current = current.next;
			}
			else
			{
				if(prev != null)
					prev.next = current.next;
				Node temp = current.next;
				tail.next = current;
				current.next = null;
				tail = current;
				current = temp;
			}
		}
		if(h1.node == null)
			h1.node = pivot;
		t1.node = tail;
		return pivot;
	}
	
	public static Node sort(Node head, Node tail)
	{
		if(head == null || head == tail)
			return head;
		Point newhead = new Point(null);
		Point newtail = new Point(null);
		Node pivot = partition(head, tail, newhead, newtail);
		if(newhead.node != pivot)
		{
			Node temp = newhead.node;
			while(temp.next != pivot)
				temp = temp.next;
			temp.next = null;
			newhead.node = sort(newhead.node, temp);
			Node temp2 = newhead.node;
			while(temp2.next!=null)
				temp2 = temp2.next;
			temp2.next = pivot;
		}
		pivot.next = sort(pivot.next, newtail.node);
		return newhead.node;
	}
}
