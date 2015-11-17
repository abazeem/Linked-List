
public class NodeS {
	
	int val;
	NodeS next;
	
	public NodeS(int x)
	{
		val = x;
		next = null;
	}
	
	@SuppressWarnings("unused")
	public NodeS insert(int x)
	{
		NodeS insert = new NodeS(x);
		if(this == null)
			return null;
		else
		{
			if(this.next == null)
			{
				this.next = insert;
				return this.next;
			}
			else
			{
				NodeS temp = this.next;
				this.next = insert;
				insert.next = temp;
				return this.next;
			}
		}
	}
	
	public NodeS delete(int x)
	{
		NodeS temp = this; 
		NodeS del = null;
		while(temp!=null)
		{
			if(temp.val == x)
				{
				del = temp;
				break;
				}
			else
				temp = temp.next;
		}
		if(del == null )
			return this;
		else
		{
			if(del.next != null)
			{
				NodeS temp2 = del.next;
				del.val = del.next.val;
				del.next = del.next.next;
				temp2.next = null;
				return this;
			}
			else 
			{
				NodeS temp3 = this;
				while(temp3.next != del)
				{
					temp3 = temp3.next;
				}
				temp3.next = null;
				return this;
			}
		}
	}
}
