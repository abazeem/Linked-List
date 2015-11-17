import java.util.HashMap;
import java.util.Map;

public class Clone {

	public static void main(String args[])
	{
		Nodearb head = new Nodearb(1);
		
		head.next = new Nodearb(2);
		
		head.next.next = new Nodearb(3);
		head.next.next.arb = head.next;
		head.next.arb = head;
		head.arb = head.next.next;
		
		Nodearb clone1 = clone3(head);
		disp(clone1);
	}
	
	public static void disp(Nodearb x)
	{
		while(x!=null)
		{
			System.out.print(x.val + " "  + x.arb.val + " ");
			x = x.next;
		}
	}
	
	public static Nodearb clone(Nodearb head)
	{
		Nodearb temp2 = head;
		while(head!=null)
		{
			Nodearb temp = head.next;
			head.next = new Nodearb(head.val);
			head.next.next = temp;
			head = head.next.next;
		}
		head = temp2;
		while(head.next!=null)
		{
			head.next.arb = head.arb.next;
			head = head.next.next;
			if(head == null)
				break;
		}
		head = temp2;
		Nodearb clone1 = temp2.next;
		Nodearb temp4 = clone1;
		while(head != null)
		{
			Nodearb temp3 = head.next;
			if(temp3 != clone1)
				clone1.next = temp3;
			if(head.next.next!=null)
				head.next = head.next.next;
			else
				head.next = null;
			head = head.next;
			clone1 = clone1.next;
		}
		return temp4;
	}
	
	public static Nodearb clone2(Nodearb head)
	{
		Map<Nodearb,Nodearb> map = new HashMap<Nodearb, Nodearb>();
		Nodearb temp = head;
		while(head!=null)
		{
			map.put(head,head.next);
			head = head.next;
		}
		head = temp;
		Nodearb copy = new Nodearb(temp.val);
		Nodearb temp3 = copy;
		while(head !=null)
		{
			if(head != temp)
			{
				copy.next = new Nodearb(head.val);
				copy = copy.next;
			}				
			Nodearb temp2 = head.next;
			head.next = copy;
			copy.arb = head;
			head = temp2;
		}
		copy = temp3;
		head = temp;
		while(copy!=null)
		{
			copy.arb = copy.arb.arb.next;
			copy = copy.next;
		}
		while(head!=null)
		{
			head.next = map.get(head);
			head = head.next;
		}
		head = temp;
		return temp3;
	}
	
	public static Nodearb clone3(Nodearb head)
	{
		Nodearb temp = head;
		Map<Nodearb,Nodearb> map = new HashMap<Nodearb,Nodearb>();
		Nodearb copy = null;
		while(head!=null)
		{
			copy = new Nodearb(head.val);
			map.put(head,copy);
			head = head.next;
		}
		head = temp;
		while(head!=null)
		{
			copy = map.get(head);
			copy.next = map.get(head.next);
			copy.arb = map.get(head.arb);
			head = head.next;
		}
		return map.get(temp);
		
		
	}
}
