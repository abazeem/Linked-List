
public class Impspecialstack {

	public static void main(String args[])
	{
		SpecialStack stk = new SpecialStack(10);
		//for(long i = 10;i<=50;i+=10)
		stk.Push(40);
		stk.Push(30);
		stk.Push(50);
		stk.Push(0);
		stk.Push(10);
		stk.Pop();
		long x = stk.mini();
		System.out.println(x);
	}
}
