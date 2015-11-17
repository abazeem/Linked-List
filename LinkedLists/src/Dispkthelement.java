
public class Dispkthelement {

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
		int k =3;
		//dispk(k, head);
		displast(k,head);
	}
	
	public static void dispk(int k, Node head)
	{
		if(head== null)
			return;
		int count = 1;
		while(head!=null)
		{
			if(count == k)
				System.out.println("Kth element value " + head.val);
			count++;
			head=head.next;
		}
	}
public static void displast(int k, Node head)
{
	int count = 1;
Node temp = head;
while(head!=null)
{
	if(count>k)
		temp = temp.next;
		head = head.next;
		count++;
}
	if(head == null)
	{
		if(count!= 1 && k<count-1)
			System.out.println("Kth element value from last " + temp.val);
		else	{			
			if( k> count-1)
				System.out.println("K value exceeds the list length");
			else
			return;
		}
}			

}
}

