public class Display {

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
		//disp(head);
		Node temp = head.next;
		alternatereverse(head);
		//disp(temp);
	}


	
	
	public static void alternatereverse(Node head)
	{
		Node temp = head;
		if(head!=null)
	{
		Node a = head;
		int flag =0;
		while(head!= null)
		{			
			a=head.next.next;
			if(a==null)
				{
		Node first=	swap(head);
		temp.next =first;
			break;
				}
			else
			{
			head.next.next = null;
			Node first = swap(head);
			if ( flag !=0)
			{
			temp.next = first;
			temp = temp.next.next;
			}
			head.next = a;
			head = head.next;
			flag =1;
		}
		}
	}
		else
			return;
	}
	
	public static Node swap(Node head)
	{
		if(head.next!=null)
		{
			Node a = head;
			head = head.next;
			head.next = a;
			a.next = null;
			return head;
		
	/*System.out.println(head.val );
	System.out.println(head.next.val);*/
		}
		else
			return null;
	}

}
