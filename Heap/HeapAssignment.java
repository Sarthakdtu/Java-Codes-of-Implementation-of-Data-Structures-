package Heap;

public class HeapAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Integer[] arr={2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
		
//		Heaps heap=new Heaps(true);
//		for(int i=0;i<arr.length;i++)
//		{
//			heap.add(arr[i]);
//		}
//
//		Heaps heaparr=new Heaps(arr,true);
//		heap.display();
//		
		
//		Heaps<Integer> heap=new Heaps();
//
//		heap.add(35);
//		heap.add(30);
//		heap.add(25);
//		heap.add(10);
//		heap.add(20);
//	//	heap.add(22);
//		
//		heap.add(5);
//		//heap.add(12);
//		
//		heap.add(15);
//		//heap.add(19);
//		heap.add(2);
//		//heap.add(8);
//		//heap.add(29);n  
//		heap.display();
//		System.out.println(heap.size());
		//System.out.println(heap.returnMedian());
		int[] arr={2,4,5,1,3};
		
		
		HeapSort(arr);
		for(int i=0;i<arr.length;i++)
		{		 
			System.out.print(arr[i]+" , ");
		}

	}                                                    //HEAP SORT 

	public static void HeapSort(int[] arr)
	{
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(arr,arr.length,i);
		}
	    for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
	}
	
	
	
	public static void heapify(int[] arr,int n,int i)
	{
		int left=2*i+1;
		int right=2*i+2;
		int large=i;
		
		if(left<n&&arr[left]>arr[i])
		{
			large=left;
		}
		if(right<n&&arr[right]>arr[large])
		{
			large=right;
		}
		
		if(large!=i)
		{
			int temp=arr[i];
			arr[i]=arr[large];
			arr[large]=temp;
			heapify(arr,n,large);
		}
		
	}
}
