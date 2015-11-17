public class nextgreatest {

	public static void main(String args[])
	{
		int a[] = {1,6,2,5,7,9,6,2};
		int k = a.length;
		Stack1 stk = new Stack1(k);
		calc(stk,a);
		
	}

	public static void calc(Stack1 stk, int[] a)
	{
		for(int i = 0; i<a.length;i++)
		{
			if(stk.isEmpty())
			{
				stk.push(a[i]);
				System.out.println("-1");
			}
			
			else
			{
				int temp = stk.peek();
				if(a[i]<temp)
				{
					stk.push(a[i]);
					System.out.println(temp);
				}
					else
				{
						Loops:
					if(a[i]>=temp)
					{
						while(!stk.isEmpty())
						{
							temp = stk.peek();
							if(a[i]<temp)
							{
								stk.push(a[i]);
								System.out.println(temp);
								break Loops;
							}
							else{
							/*	if(a[i]== temp)
								{
									int x = stk.pop();
									if(stk.isEmpty())
									{
										System.out.println("-1");
										break Loops;
									}
									stk.push(x);
								}
								else if(a[i]>temp)
								{*/
									temp =stk.pop();
									if(stk.isEmpty())
										{
											stk.push(a[i]);
											System.out.println("-1");
											break Loops;
										}
								}
								}
						}
					}
				}
						
			}
				
				
		}
	}
		
		
		
	
