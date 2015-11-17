public class m_after_n
	{
	public static void main(String arg[])
	{
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		head.next =second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = null;
		int m = 3;
		int n= 3;
	    func1(m,n,head);	
	    }
	public static void disp(Node head)
	{
		while(head!=null)
		{
		System.out.println(head.val);
		head = head.next;
		}
		if(head==null)
		return;
		}
	
	public static void func1(int m, int n, Node head)
	{
		int count =1;
		Node temp = head;
		while(head!=null)
		{
			if(count == m)
			{				
			 remove(n,head,temp);
			 break;
			}
			count++;
			head=head.next;
		}
		if(head == null)
		return ;
	}
	public static void remove(int n,Node head, Node first)
	{
		try 
		{
		int count =1;
		while(count<=n)
		{
			Node temp = head.next;
			head.next = head.next.next;
			temp.next = null;
			count ++;
			if(head == null)
				throw new Exception();
			}
		if(count>n)
			disp(first);
		if (head == null)
			return ;		
		}
		catch(Exception er)
		{
			System.out.println("N value exceeds the lenght of the list");
		}
	}
		

}
