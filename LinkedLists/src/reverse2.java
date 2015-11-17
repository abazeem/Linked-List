import java.util.HashMap;


public class reverse2 {

	static Node head;
	
	public static void main(String args[])
	{
		Node x = new Node(1);
		x.next = new Node(2);
		x.next.next = new Node(3);
		x.next.next.next = new Node(4);
		x.next.next.next.next = new Node(5);
		x = swap(x, null);
		//reverse(x);
		//remove(x);
		print(x);
	}
	
	public static void remove(Node x)
	{
		Node prev = null;
		boolean flag = false;
		HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
		while(x!=null)
		{
			if(map.containsKey(x.val))
			{
				flag = true;
				Node temp = x.next;
				if(prev != null)
					prev.next = temp;
				x = null;
				x = temp;
			}
			else
				map.put(x.val, true);
			
			if( x != null && !flag)
			{
				prev = x;
				x = x.next;
			}
			else
				flag = false;
		}
	}
	
	
	public static void print(Node x)
	{
		while(x!= null)
		{
			System.out.print(x.val + " ");
			x = x.next;
		}
	}
	public static void reverse(Node x)
	{
		if(x != null)
		{
			Node temp = revutil(x);
			temp.next = null;
		}
	}
	
	public static Node revutil(Node x)
	{
		if( x.next!= null)
		{
			revutil(x.next);
			x.next.next = x;
			return x;
		}
		else
			head = x;
		return null;
	}
	
	public static void split(Node x)
	{
		Node head = x;
		Node head2 = x.next;
		Node temp; 
		Node temp2 = null;
		while(x != null)
		{
			temp = x.next;
			if(temp != null)
			{
				x.next = temp.next;
				temp.next = null;
			}
			else
				x.next = null;
			if(temp2 == null)
				temp2 = temp;
			else
			{
				temp2.next = temp;
				temp2 = temp2.next;
			}
			x = x.next;
		}
		print(head);
		print(head2);
	}
	
	public static Node swap(Node x, Node prev)
	{
		Node c = null;
		Node curr = x;
		int count = 0;
		while(curr!= null && count < 2 )
		{
			c = curr.next;
			curr.next = prev;
			prev = curr;
			curr = c;
			count++;
		}
		if( c!= null)
			x.next = swap(c,prev.next);
		else
			x.next = null;
		return prev;
	}
}

