public class Queued {

	int count;
	int max;
	Noded front;
	Noded last;
	
	public Queued(int m)
	{
		count = 0;
		max = m;
		front = null;
		last = null;
	}
	
	public boolean isEmpty()
	{
		return(front == null);
	}
	
	public void insert(Noded x, boolean flag)
	{
		if(count >= max && flag)
		{
			Noded temp = last.prev;
			last.prev = null;
			temp.next = null;
			last = temp;
		}
		else
		{
			if(flag)
				count++;
		}
		if(count == 1)
		{
			front = x;
			last = x;
			return;
		}
		if(!flag)
		{
			Noded temp2 = find(x);
			Noded temp3 = temp2.prev;
			Noded temp4 = temp2.next;
			if(temp3 != null)
				temp3.next = temp4;
			if(temp4 != null)
				temp4.prev = temp3;
			temp2.prev = null;
			temp2.next = front;
			front.prev = temp2;
			front = temp2;
			while(temp2.next != null)
				temp2 = temp2.next;
			last = temp2;
		}
		else
		{
			x.next = front;
			front.prev = x;
			front = x;
		}
	}
	
	public Noded find(Noded x)
	{
		Noded temp = this.front;
		while(temp!=x)
			temp = temp.next;
		return temp;
	}
	
	public Noded peek()
	{
		return (front);
	}
}
