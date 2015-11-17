public class MidStack 
{
	Dnode head;
	Dnode mid;
	int count;
	public MidStack()
	{
		head = null;
		mid = null;
		count = 0;
	}
	public void push(int x)
	{
		Dnode temp = new Dnode(x);
		temp.prev = null;
		temp.next = head;
		count+=1;
		if(count == 1)
		{
			mid = temp;
		}
		else
		{
			head.prev = temp;
			if(count %2 == 1)
				mid = mid.prev;
		}
		head = temp;
	}
	public int pop()
	{
		if(count == 0)
			return 0;
		else
		{
			if(count == 1)
			{
				int y = head.val;
				count = 0;
				mid  = null;
				head= null;
				return y;
			}
			else
			{
				int x = head.val;
				Dnode temp = head.next;
				head.next = null;
				head = temp;
				head.prev=null;
				count-=1;
				if(count%2== 0)
					mid = mid.next;
				return x;
			}
		}
	}
	public boolean isEmpty()
	{	
		return(count==0);
	}
}
