
public class Middlenodes {

	public static void main(String arg[])
	{
		Node1 head = new Node1(1,10);
		Node1 second = new Node1(2,10);
		Node1 third = new Node1(7,10);
		Node1 fourth = new Node1(7,8);
		Node1 fifth = new Node1(7,6);
		Node1 sixth = new Node1(7,1);
		head.next =second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = null;
		removenode(head);
		disp(head);
	}
	
	public static void removemid(Node1 head)
	{
		Node1 a = head;
		int x = 0;
		int y = 0;
		try{
		while(a.next != null)
		{
			if(head.x == a.next.x)
			{
				x=1;
				a=a.next;
			}
			else
				if(x==1)
				{
					x=0;
					Node1 temp = head;
					remove(temp,a);
					head = a;
				}
			if(head.y == a.next.y)
			{
				y=1;
				a=a.next;
			}
			else if(y==1)
			{
				y=0;
				Node1 temp= head;
				remove(temp,a);
				head = a;
			}
			}
		}
		catch(Exception er)
		{
			if (head.x == a.x || head.y == a.y )
			{
				Node1 temp = head;
				remove(temp,a);
				head =a;
			}
		}
		
		}

	public static void remove(Node1 head, Node1 a)
	{
		while(head.next!=a)
			head = head.next;
		Node1 temp = a.next;
		head.next = temp;
		a.next = null;
	}

	public static void disp(Node1 head)
	{
		while(head!=null)
		{
	System.out.print("("+ head.x+"," );
	System.out.print(head.y+")");
	System.out.println();
	head = head.next;
		}
		if(head==null)
			return;
		}
	
	public static Node1 removenode(Node1 x)
	{
		if(x == null || x.next == null || x.next.next == null)
			return x;
		Node1 next = x.next;
		Node1 nextnext = x.next.next;
		if(x.x == next.x)
		{
			while(nextnext != null && nextnext.x == next.x)
			{
				remove(x,next);
				next = nextnext;
				nextnext = nextnext.next;
			}
		}
		else if(x.y == next.y)
		{
			while(nextnext != null && nextnext.y == next.y)
			{
				remove(x,next);
				next = nextnext;
				nextnext = nextnext.next;
			}
		}
		else
		{
			System.out.print("given list is invalid");
			return null;
		}
		removenode(x.next);
		return x;
	}


}
	
	

