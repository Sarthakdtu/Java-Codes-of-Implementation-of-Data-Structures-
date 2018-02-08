package L9;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={8,6,38,92,7,9};
		//int[] b={2,7,9};
		quicksort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		

	}
	
	public static void quicksort(int[] arr,int low,int high)
	{
		
		
		
		int left=low;
		int right=high;
		int mid=(left+right)/2;
		int pivot=arr[mid];
		
		if(low>=high)
		{
			return;
		}
		while(left<=right)
		{
			while(arr[left]<pivot)
			{
				left++;
			}
			
			while(arr[right]>pivot)
			{
				right--;
			}
			
		if(left<=right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}								
			
		}
		
		quicksort(arr,low,right);
		quicksort(arr,left,high);
		
	}

}
