public class quicksortsingle {

	public static void main(String args[])
	{
		Node a = new Node(40);
		a.next = new Node(30);
		a.next.next = new Node(50);
		a.next.next.next = new Node(20);
		quicksort(a);
		disp(a);
	}
	
	public static void disp(Node x)
	{
		if(x==null)
			return;
		while(x!=null)
		{
			System.out.print(x.val + " ");
			x = x.next;
		}
	}
	
	public static Node partition(Node head, Node end, Node newhead , Node newend)
	{
		Node pivot = end;
		Node prev = null;
		Node curr = head;
		Node tail = end;
		while(curr!=pivot)
		{
			if(curr.val < pivot.val)
			{
				if(newhead == null)
					newhead = curr;
				prev = curr;
				curr = curr.next;
			}
			else
			{
				Node temp = curr.next;
				tail.next = curr;
				curr.next = null;
				tail = tail.next;
				curr = temp;
				if(prev != null)
					prev.next = temp;
			}
		}
		if(newhead == null)
			newhead = pivot;
		newend = tail;
		return pivot;
	}
	
	@SuppressWarnings("null")
	public static Node quicksortrec(Node head, Node end)
	{
		if(head== null || head == end)
			return null;
		Node newhead = null;
		Node newend = null;
		Node pivot = partition(head,end,newhead,newend);
		if(newhead != pivot)
		{
			Node temp = newhead;
			while(temp.next != pivot)
				temp = temp.next ;
			temp.next = null;
			newhead = quicksortrec(newhead,temp);
			temp = newhead;
			while(temp.next !=null)
				temp = temp.next;
			temp.next = pivot;
		}
		else
			pivot.next = quicksortrec(pivot.next, end);
		return newhead;
	}
	public static void quicksort(Node x)
	{
		Node temp = x;
		while(temp.next != null)
			temp = temp.next;
	//	x = quicksortrec(x,temp);
	//	x = quicksort2(x,temp);
		quicksort3(x,temp,x);
	}
	
	
	public static Node quicksort2(Node head, Node tail)
	{
		if(head == null || head == tail)
			return null;
		Node pivot = partition2(head,tail);
		if(head!=pivot)
		{
			Node temp = head;
			while(temp.next != pivot)
				temp = temp.next;
			temp.next = null;
			head = quicksort2(head, temp);
			temp = head;
			while(temp.next != null)
				temp = temp.next;
			temp.next = pivot;
		}
		pivot.next = quicksort2(pivot.next,tail);
		return head;
	}


	public static Node partition2(Node head, Node tail)
	{
		Node pivot = tail;
		Node prev = null;
		Node curr = head;
		while(curr!=pivot)
		{
			if(curr.val < pivot.val)
			{
				prev = curr;
				curr = curr.next;
			}
			else
			{
				Node temp = curr.next;
				curr.next = null;
				tail.next = curr;
				tail = tail.next;
				curr = temp;
				if(prev == null)
					head = temp;
				else
					prev.next = temp;
			}
		}
		return pivot;
	}
	
	
	public static Node partition3(Node head, Node tail, Node prev)
	{
		Node i = prev;
		int x = tail.val;
		for(Node j = head; j!=tail; j= j.next)
		{
			if(j.val < x)
			{
				if(i==null)
					i = head;
				else
					i = i.next;
				int temp = i.val;
				i.val = j.val;
				j.val = temp;
			}
		}
		if(i==null)
			i = head;
		else
			i = i.next;
		int temp = i.val;
		i.val = tail.val;
		tail.val = temp;
		return i;
	}
	
	public static void quicksort3(Node head , Node tail , Node Ghead)
	{
		if(tail!=null && head != tail && head != tail.next)
		{
			Node prev;
			if(head!=Ghead)
			{
				prev = Ghead;
				while(prev.next != head)
					prev = prev.next;
			}
			else
				prev = null;
			Node pivot = partition3(head,tail,prev);
			if(pivot!=Ghead)
			{
				prev = Ghead;
				while(prev.next != pivot)
					prev = prev.next;
			}
			else
				prev = null;			
			quicksort3(head,prev,Ghead);
			quicksort3(pivot.next,tail,Ghead);
		}
		
	}
	
	
}
