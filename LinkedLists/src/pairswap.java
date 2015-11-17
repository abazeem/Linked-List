
public class pairswap {

	public static void main(String args[])
	{
		Node x = new Node(1);
		x.next = new Node(2);
		x.next.next = new Node(3);
		x.next.next.next = new Node(4);
	//	x.next.next.next.next = new Node(5);
		x = swap(x);
		print(x);
	}
	
	public static void print(Node x)
	{
		while(x!= null)
		{
			System.out.print(x.val + " ");
			x = x.next;
		}
	}
	
	public static Node swap(Node x)
	{
		int count = 1;
		Node next = null;
		Node prev = null;
		Node curr = x;
		while(count <= 2 && curr!= null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		if(curr!=null)
			x.next = swap(curr);
		return prev;
	}
}
