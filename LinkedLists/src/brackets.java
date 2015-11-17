
public class brackets {
	public static void main(String args[])
	{
		String brackets = "{[()]}";
		Stackc stk = new Stackc(brackets.length());
		if(calc(stk,brackets))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}

	public static boolean calc(Stackc stk,String a)
	{
		int count = 0;
		int count1 = 0;
		for(int i =0;i<a.length();i++)
		{
			if(a.charAt(i)=='(' ||a.charAt(i)=='[' ||a.charAt(i)=='{' )
			{
				count++;
				stk.push(a.charAt(i));
			}
			else
			if(a.charAt(i)==')' ||a.charAt(i)==']' ||a.charAt(i)=='}' )
			{
				char x = stk.pop();
				if((a.charAt(i)==')' && x=='(')||(a.charAt(i)=='}' && x=='{')||(a.charAt(i)==']' && x=='['))
					count1++;
			}
		}
		return(count1==count);
	}
}
