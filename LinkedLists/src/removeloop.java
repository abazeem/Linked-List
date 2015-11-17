
public class removeloop {

	public static void main(String args[])
	{
		
	}
	
	public static Node detectloop(Node head)
	{
		Node slow = head;
		Node fast = head;
		while(slow!= null && fast!= null && fast.next!= null)
		{
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow)
				return fast;
		}
		return null;
	}
	
	public static void remove(Node head)
	{
		Node loop = detectloop(head);
		if(loop == null)
			return;
		Node temp = loop;
		loop = loop.next;		
		int count = 1;
		while(loop!= temp)
		{	
			loop = loop.next;
			count++;
		}
		System.out.print(count);
		
	}
}
