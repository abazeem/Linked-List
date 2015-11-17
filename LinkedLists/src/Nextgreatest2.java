public class Nextgreatest2 {
	
	public static void main(String args[])
	{
		int[] arr = {120, 100, 250, 4, 6, 200, 201};
		calc(arr);
		calc2(arr);
	}
	
	public static void calc(int[] a)
	{
		Stack1 stk = new Stack1(a.length);
		for(int i =0;i<a.length;i++)
		{
			while(!stk.isEmpty())
			{
				int x = stk.pop();
				if(x >a[i])
				{
					stk.push(x);
					stk.push(a[i]);
					System.out.print(x + " ");
					break;
				}
			}
			if(stk.isEmpty())
			{
				System.out.print("-1 ");
				stk.push(a[i]);
			}
		}
		System.out.println("");
	}
	
	public static void calc2(int[] a)
	{
		Stack1 stk = new Stack1(a.length);
		for(int i = 0; i< a.length; i++)
		{
			int count = 0;
			while(!stk.isEmpty())
			{
				count++;
				int x = stk.pop();
				if(x>a[i])
				{
					System.out.print(count + " ");
					stk.push(x);
					while(count>0)
					{
						count--;
						stk.push(a[i]);
					}
					break;
				}
			}
			if(stk.isEmpty())
			{
				System.out.print((i+1)+ " ");
				stk.push(a[i]);
			}
		}
	}
}
