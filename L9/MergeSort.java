package L9;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={8,6,3,10,7,12};
		//int[] b={2,7,9};
		int[] c=mergesort(a,0,a.length-1);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
		
		
	}
	
	public static int[] mergesort(int[] arr,int low,int high)
	{
		if(low==high)
		{
			int[] baseresult=new int[1];
			baseresult[0]=arr[low];
			return baseresult;
		}
		
		
		int mid=(low+high)/2;
		int[] fhalf=mergesort(arr,low,mid);
		int[] shalf=mergesort(arr,mid+1,high);
		
		int[] sorted=merge(fhalf,shalf);
		return sorted;
	}
	
	
	public static int[] merge(int[] a,int[] b)
	{
		int[] c=new int[a.length+b.length];
		int j=0;
		int i=0;
		int k=0;
		while((i<b.length)&&(j<a.length))
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
			while(j<a.length){
				c[k]=a[j];
				k++;j++;
			}
			
			while(i<b.length){
				c[k]=b[i];
				k++;i++;
			}
			
			return c;
			
			
		}
		

}
