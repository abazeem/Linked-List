
public class infix {

	public static void main(String args[])
	{
		String exp = "a+b*(c^d-e)^(f+g*h)-i";
		disp(exp);
	}
	
	public static boolean isoperand(char c)
	{
		int j = c;
		int k = j;
		j = j -'a';
		k = k - 'A';
		if(( j <= 26 && j>= 0) || (k <= 26 && k >= 0))
			return true;
		else
			return false;
	}
	public static boolean isoperator(char c)
	{
		if( c == '+' || c == '-' || c == '/' || c == '*' || c == '^')
			return true;
		else
			return false;
	}
	
	public static int prec(char c)
	{
		if( c == '+' || c == '-')
			return 1;
		else
		{
			if(c == '*' || c == '/')
				return 2;
			else
				if(c == '^')
					return 3;
			return -1;
		}
	}
	public static void disp(String S)
	{
		String exp = "";
		Stackc stk = new Stackc(S.length());
		for(int i = 0;i< S.length(); i++)
		{
			char c = S.charAt(i);
			if(isoperand(c))
				exp+=c;
			else
			{
				if( c == '(')
					stk.push(c);
				else
				{
					if( c == ')')
					{
					while(stk.peek() != '('&& !stk.isEmpty() )
						exp += stk.pop();
					if(!stk.isEmpty() && stk.peek() == '(')
						stk.pop();
					}
					else
					{
						if(isoperator(c))
						{
							while(!stk.isEmpty() && prec(c)<=prec(stk.peek()))
								exp+=stk.pop();
							stk.push(c);
						}
					}
				}
			}
		}
		while(!stk.isEmpty())
			exp+=stk.pop();
		System.out.print(exp);
	}
}	
