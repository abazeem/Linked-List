
public class Impmidstack {
	public static void main(String args[])
	{
		MidStack stk = new MidStack();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		int x = stk.pop();
		int y = stk.pop();
		int z = stk.pop();
		int w = stk.pop();

		System.out.print(x+y+z+w);
	}

}
