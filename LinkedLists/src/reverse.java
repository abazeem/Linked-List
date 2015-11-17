public class reverse {
public  static void main(String args[])
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
	Node temp = reverse1(head);
	temp.disp(temp);
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

	
public static Node reverse1(Node head)
{
	Node a, b,c;
	b=head;
	c=null;
	a=null;
	while(b!=null)
	{
		c= b.next;
		b.next = a;
		a =b;
		b=c;
	}
	head = a;
	return head;
	}
}
