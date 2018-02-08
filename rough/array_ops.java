package rough;

import java.util.Scanner;

public class array_ops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] arr = takeinput();
		//System.out.println("enter number to be found=");
		//int a = s.nextInt();
		//System.out.println("element found at" + linear_search(arr, a) + "th index");
		// 9 9 8 4 5 7 6 3 2 1
		//reverse(arr);
		//System.out.println("reversed array is");
		sort(arr,0,arr[0]);
		display(arr);

	}

	public static int[] takeinput() {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		return arr;

	}

	public static void sort(int[] a,int si,int min)
	{
		
		if(si==a.length)
		{
			return;
		}
		
		if(min>=a[si])
		{
			min=a[si];
			sort(a,si+1,min);
			
			a[a.length-si-1]=min;
			
		}
		else if(si==a.length-1)
		{
			//min=a[si];
			sort(a,si+1,min);
			
			a[a.length-si-1]=min;
			
		}
		else
			{
			int ce=a[si];
			
			sort(a,si+1,min);
			a[a.length-si-1]=ce;
			}
		
		
		
		
	}
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
