public class quicksort {

	public static void main(String args[])
	{
		Dnode a = new Dnode(30);
		a.next = new Dnode(20);
		a.next.next = new Dnode(10);
		a.next.next.next = new Dnode(40);
		a.prev = null;
		a.next.prev = a;
		a.next.next.prev = a.next;
		a.next.next.next.prev = a.next.next;
		quicksort1(a);
		disp(a);
	}
	
	public static void disp(Dnode x)
	{
		while(x!=null)
		{
			System.out.print(x.val + " ");
			x = x.next;
		}
	}
	
	public static Dnode partition(Dnode l, Dnode h)
	{
		int x = h.val;
		Dnode i = l.prev;
		Dnode j = l;
		while(j != h.next)
		{
			if(j.val < x)
			{
				if(i == null)
					i = l;
				else
					i = i.next;
				int y = i.val;
				i.val = j.val;
				j.val = y;
			}
			j = j.next;
		}
		if(i == null)
			i = l;
		else
			i = i.next;
		int temp = i.val;
		i.val = h.val;
		h.val = temp;
		return i;
	}
	
	public static void quicksort1(Dnode head)
	{
		Dnode tail = head;
		while(tail.next!=null)
			tail = tail.next;
		_quicksort(head,tail);
	}
	
	public static void _quicksort(Dnode l, Dnode h)
	{
		if(h!=null && l!=h && l!= h.next)
		{
			Dnode p = partition(l,h);
			_quicksort(l,p.prev);
			_quicksort(p.next,h);
		}
	}
}
