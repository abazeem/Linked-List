
public class Add2 {

	
	public static void main(String args[])
	{
		Node x = new Node(9);
		x.next = new Node(9);
		x.next.next = new Node(9);
		x.next.next.next = new Node(9);
		Node y = new Node(1);
//		y.next = new Node(4);
//		y.next.next = new Node(5);
//		y.next.next.next = new Node(9);
//		Add(x,y);
//		disp(x);
		Node sum = reverseadd(x,y);
		disp(sum);
	}
	
	public static int length(Node x)
	{
		int count =1;
		if(x==null)
			return 0;
		while(x.next!=null)
		{
			x=x.next;
			count++;
		}
		return count;
	}
	
	public static void disp(Node head)
	{
		while(head!=null)
		{
			System.out.println(head.val);
			head = head.next;
		}
		return;
	}
	
	public static void Add(Node x, Node y)
	{
		int s=0;
		int carry = 0;
		Node temp = x;
		int l1 = length(x);
		int l2 = length(y);
		Stack1 stk1 = new Stack1(l1);
		Stack1 stk2 = new Stack1(l2);
		Stack1 stk3 = new Stack1(Math.max(l1, l2)+1);
		stk1 = fill(x,stk1);
		stk2 = fill(y,stk2);
		while(!stk1.isEmpty()||!stk2.isEmpty())
		{
			int a=0, b=0;
			if(!stk1.isEmpty())
				a = stk1.pop();
			if(!stk2.isEmpty())
				b = stk2.pop();
			s = a+b + carry;
			carry = s/10;
			s=s%10;
			stk3.push(s);
		}
		if(carry == 1)
			stk3.push(carry);
		store(temp,stk3);//To extract the value from the stack and store it in the linked list temp
	}
		
	public static Stack1 fill(Node y, Stack1 stk)
	{
		while(!stk.isFull() && y!=null)
		{
			if(y!=null)
			{
				stk.push(y.val);
				y=y.next;
			}
		}
			return stk;
	}
	
	public static void store(Node x, Stack1 stk)
	{
		Node temp;
		while(!stk.isEmpty())
		{
			x.val = stk.pop();
			if(x.next==null && !stk.isEmpty())
			{
				 temp = new Node(0);
				 x.next = temp;
			}			
			x=x.next;
		}
	}
	
	public static Node revadd(Node a, Node b, Node c)
	{
		if(a==null)
			return null;
		Node result = new Node(0);
		result.next =revadd(a.next,b.next, c);
		int sum = a.val + b.val + c.val;
		c.val = sum/10;
		sum = sum%10;
		result.val = sum;
		return result;
	}
	
	public static Node reverseadd(Node a, Node b)
	{
		int l1 = length(a);
		int l2 = length(b);
		if(l1>l2)
			b  = append(a,l1,b,l2);
		else
			a = append(a,l1,b,l2);
		Node c = new Node(0);
		Node result = revadd(a,b,c);
		if(c.val == 1)
		{
			Node temp = new Node(1);
			temp.next = result;
			result = temp;
		}
		return result;		
	}
	
	public static Node append(Node a , int l1, Node b, int l2)
	{
		if(l1>l2)
		{
			int diff = l1-l2;
			while(diff>0)
			{
				Node temp = new Node(0);
				temp.next = b;
				b = temp;
				diff--;
				
			}
			return b;
		}
		else
		{
			int diff = l2-l1;
			while(diff>0)
			{
				Node temp = new Node(0);
				temp.next = a;
				a = temp;
			}
			return a;
		}
	}
}
