
public class recursivereverse {
	public static void main(String args[])
	{
		Stack1 stk = new Stack1(5);
		stk.push(3);
		stk.push(2);
		stk.push(1);
		Stack1 temp = stk;
		reverse(stk);
		System.out.println("Reverse Completed");
	}
	
	public static void reverse(Stack1 stk)
	{
		int temp;
		if(!stk.isEmpty())
		{
			temp = stk.pop();
			reverse(stk);
			insertbottom(stk,temp);
		}
	}
	public static void insertbottom(Stack1 stk, int item)
	{
		if(stk.isEmpty())
			stk.push(item);
		else
		{
			int temp = stk.pop();
			insertbottom(stk,item);
			stk.push(temp);
		}
	}
}
