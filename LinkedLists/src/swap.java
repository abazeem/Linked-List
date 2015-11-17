
public class swap {

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
		int  k = 8;
		
		if(k>6||k<0)
			System.out.println("Error");
		else{
			detk(head, k);
			if(k ==1 || k==6)
				disp(sixth);
			else
				disp(head);
		}
	}
	
	public static void detk(Node head, int k)
	{
		Node temp = head;
		 int m = k-1;
		 int n = k+1;
		Node a= head;
		Node b = head;
		int count = 1;
		while(head!=null)
		{
			if( count == m)
				a = head;
			if( count>n)
				b = b.next;
				head = head.next;
				count++;
		}
		if(k==1 || k==count-1)
			swapfirstlast(temp);		
		else
		{
			int x = (count-1)%2;
			if(x==0)
			{
				if( k != (count-1)/2 && k!= ((count-1)/2)+1)
					swapnode(a,b);
				else 
					if(k==(count-1)/2)
						swapk(a,b);
					else
						swapk(b,a);
			}
			if(x==1)
			{
				if (k+1==(count-1)/2)
					return;
				else
					swapnode(a,b);
			}
		}
		if(head ==null)
			return;
		}
	public static void swapnode(Node a, Node b)
	{
		Node temp3 = b.next.next;
		Node temp = a.next;
		Node temp2 = a.next.next;
		a.next = b.next;
		if(a.next.next.val != temp2.val)
			a.next.next = temp2;
		b.next = temp;
		temp.next = temp3;
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
	public static void swapk(Node a , Node b)
	{
		Node temp3 = b.next.next;
		Node temp = a.next;
		Node temp2 = a.next.next;
		a.next = b.next;
		temp2.next =temp;
		temp.next = temp3;
		
	/*System.out.println(head.val );
	System.out.println(head.next.val);*/
		}
		
public static void swapfirstlast(Node head)
{
	Node tail2 = head;
	while(tail2.next.next !=null )
	{
	tail2 =	tail2.next;
	}
	Node t1 = head.next;
	Node tail = tail2.next;
	tail.next = t1;
	tail2.next = head;
	head.next = null;
}
}


