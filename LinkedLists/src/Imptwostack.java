
public class Imptwostack {
	
	public static void main(String arg[])
	{
	twoStack stk = new twoStack(4,5);
	for(int i = 0;!stk.isFull1();i++)
	{
		stk.push1(i);
	}
	for(int i = 0;!stk.isFull2();i++)
	{
		stk.push2(i);
	}
	System.out.println("Hello");
	}
}