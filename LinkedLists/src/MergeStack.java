public class MergeStack 
{
	int count;
	Dnode head;
	Dnode last;
	public MergeStack()
	{
		count = 0;
		head = null;
		last = null;
	}
	public void push(int x)
	{
		Dnode temp = new Dnode(x);
		temp.prev = null;
		temp.next = head;
		count+=1;
		if(count == 1)
		{
			head = temp;
			last = head;
		}
		else
		{
			head.prev = temp;
			head = temp;
		}
	}
	public int pop()
	{
		if(count == 0)
			return 0;
		else
			{
			int x = head.val;
			Dnode temp =head.next;
			head.next = null;
			head = temp;
			count-=1;
			return x;
			}
	}
	public MergeStack Merge(MergeStack s1, MergeStack s2)
	{
		s1.head.prev = s2.last;
		MergeStack s3 = new MergeStack();
		s3.last = s1.last;
		s3.head = s2.head;
		s3.count = s1.count+s2.count;
		return s3;
	}
}