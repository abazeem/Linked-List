public class Palindrome {
	
	public static void main(String args[])
	{
		Node head = new Node(2);
		head.next = new Node(2);
		head.next.next = new Node(1);
		head.next.next.next = new Node(2);
		head.next.next.next.next = new Node(2);
		disp(head);
	}
	
	public static void disp(Node x)
	{
		Node temp = x;
		int l = length(temp);
		Stack1 stk1 = new Stack1(l);
		stk1= pushnode(stk1,temp);
		if(compare(temp,stk1))
			System.out.print("It is a palindrome");
		else
			System.out.print("Not a palindrome");
	}
	public static boolean compare(Node x, Stack1 stk)
	{
		if(x == null)
			return false;
		while(x!=null)
		{
			int a = stk.pop();
			if(x.val != a)
				return false;
			x = x.next;
		}
		return true;
	}
	
	public static Stack1 pushnode(Stack1 stk1, Node x)
	{
		while(x!=null)
		{
			stk1.push(x.val);
			x = x.next;
		}	
		return stk1;
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
}
