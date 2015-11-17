
public class twoStack 
{
	private int maxsize1;
	private int maxsize2;
	private int[] ary;
	private int top1;
	private int top2;
	public twoStack(int x, int y)
	{
		maxsize1 = x;
		maxsize2 = y;
		ary =	new int[x+y];
		top1 = -1;
		top2 = x-1;
	}
	public boolean isEmpty1()
	{
		return (top1==-1);
	}
	public boolean isEmpty2()
	{
		return (top2==maxsize1-1);
	}	
	public boolean isFull1()
	{
		if(top1 == maxsize1-1)
		return true;
		else 
			return false;
	}
	public boolean isFull2()
	{
		if(top2 == (maxsize1+maxsize2)-1)
		return true;
		else 
			return false;
	}
	public void push1(int x)
	{
		ary[++top1]= x;
	}
	public void push2(int x)
	{
		ary[++top2]= x;
	}
	public int pop1()
	{
		return(ary[top1++]);
	}
	public int pop2()
	{
		return(ary[top2++]);
	}
}
