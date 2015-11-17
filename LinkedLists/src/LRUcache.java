import java.util.HashMap;

public class LRUcache {

	public static void main(String args[])
	{
		HashMap<String, Noded> map = new HashMap<String, Noded>();
		Queued que = new Queued(5);
		Noded temp = getreference("Hello", map,que);
		temp = getreference("World", map,que);
		temp = getreference("Hi", map,que);
		temp = getreference("Hello", map,que);
		temp = getreference("Goodnight", map,que);
		temp = getreference("Goodmorning", map,que);
		temp = getreference("Goodafternoon", map,que);
		temp = getreference("Hello", map,que);
	}
	
	public static Noded getreference(String page, HashMap<String, Noded> map, Queued que)
	{
		boolean flag = false;
		Noded x;
		if(!map.containsKey(page))
		{
			flag = true;
			x = new Noded(page);
			map.put(page, x);
		}
		else
			x = map.get(page);
		que.insert(x, flag);
		return (que.peek());
	}
	
}
