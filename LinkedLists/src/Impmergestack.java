
public class Impmergestack {
	public static void main(String args[])
	{
		MergeStack stk1 = new MergeStack();
		MergeStack stk2 = new MergeStack();
		stk1.push(10);
		stk1.push(10);
		stk1.push(10);
		stk1.push(10);
		stk2.push(20);
		stk2.push(20);
		stk2.push(20);
		stk2.push(20);
		stk2.push(20);
		stk1 = stk1.Merge(stk1, stk2);
		System.out.println("Hello World");
	}
}
