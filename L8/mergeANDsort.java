package L8;

public class mergeANDsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={5,8,10,14};
		int[] b={2,7,9};
		int[] c=merge(a,b);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}

	}
	
	
	public static int[] merge(int[] a,int[] b)
	{
		int[] c=new int[a.length+b.length];
		int j=0;
		int i=0;
		int k=0;
		while(i<b.length)
		{
			if(a[j]>b[i])
			{
				c[k]=b[i];
				i++;k++;
			}
			else
			{
				c[k]=a[j];
				j++;k++;
			}
		}
			for(int m=j;m<a.length;m++)
			{
				c[k]=a[m];
				k++;
			}
			
			return c;
			
			
		}
		
	

}
