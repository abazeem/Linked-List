
public class Node 
{
	int val;
	Node next;


	public Node(int v)
	{
			val = v;
			next = null;
	}

	public void disp(Node head)
	{
		while(head!=null)
		{
			System.out.println(head.val);
			head = head.next;
		}
		if(head==null)
			return;
	}

}
