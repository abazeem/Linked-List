import java.util.Scanner;
public class reversestack {

	public static void main(String args[])
	{
		String str;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		str = in.nextLine();
		Stackc stk = new Stackc(str.length());
		reverse(str,stk);
	}

	public static void reverse(String str, Stackc stk)
	{
		for(int i =0;i<str.length();i++)
		{
			stk.push(str.charAt(i));
		}
		for(int j = 0;j<str.length();j++)
		{
			char x = stk.pop();
			System.out.print(x);
		}
		
	}

}
