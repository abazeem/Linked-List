
public class SpecialStack 
{
	public Stack1 min;
	public Stack1 act;
	public SpecialStack(int x)
	{
		act = new Stack1(x);
		min = new Stack1(x);
	}
	public void Push(int x)
	{
		if(min.top==-1)
		{
			act.push(x);
			min.push(x);
		}
		else
		{
			act.push(x);
			int a = min.pop();
			min.push(a);
			if(a<x)
				min.push(a);
			else
				min.push(x);
		}
	}
	public int Pop()
	{
		min.pop();
		return act.pop();
	}
	
	public int mini()
	{
		return min.peek();
	}
	
	public boolean isEmpty() 
	{
	      return (act.top == -1);
	}
	public boolean isFull() 
	{
		  return (act.top == act.maxSize - 1);
	}
}
	
	


