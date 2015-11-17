
public class Inverse {

	public static void main(String args[])
	{
		int[] a = { 2, 4, 1, 3, 5};
		System.out.println(invercount(a,0,a.length-1));
	}
	
	public static int invercount(int[] a, int l , int r)
	{
		int invcount = 0;
		if(l<r)
		{

			int mid = l+ (r-l)/2;
			invcount = invercount(a,l,mid);
			invcount += invercount(a,mid+1,r);
			invcount += merge(a,l,mid,r);					
		}
		return invcount;
	}
	
	public static int merge(int[] a , int l, int mid, int r)
	{
		int n1 = mid - l +1;
		int invcount = 0;
		int n2 = r - mid ;
		int[] L = new int[n1];
		int[] R = new int[n2];
		for(int i = 0; i<n1;i++)
			L[i] = a[l+i];
		for(int j = 0;j<n2;j++)
			R[j] = a[mid+1+j];
		int i = 0;
		int j = 0;
		int k = l;
		while(j<n2 && i<n1)
		{
			if(L[i] <= R[j])
			{
				a[k] = L[i];
				i++;
			}
			else
			{
				a[k] = R[j];
				j++;
				invcount += mid-i + 1;
			}
			k++;
		}
		while(i<n1)
		{
			a[k++] = L[i++];
		}
		while(j<n2)
		{
			a[k++] =R[j++];
		}
		return invcount;
	}
}
