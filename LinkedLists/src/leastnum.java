
public class leastnum {
	public static void main(String args[])
	{
		String str = "8662";
		NodeS head = new NodeS(str.charAt(0) - '0');
		NodeS last = head;
		for(int i =1;i<str.length();i++)
		{
			last=last.insert(str.charAt(i)-'0');
		}
		int k = 2;
		calc(head, k);
	}
	
	public static void calc(NodeS head, int k )
	{
		NodeS temp = head;
		while( temp.next != null && k>0)
		{
			if(temp.val > temp.next.val)
			{
				temp = head.delete(temp.val);
				k--;
			}
			else
			{
				temp = temp.next;
			}
		}
		while(head!= null)
		{
			System.out.print(head.val);
			head = head.next;
		}
	}
}
