package L4;

import java.util.Scanner;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int[] arr = takeinput();
		System.out.println("enter number to be found=");
		int a = s.nextInt();
		System.out.println( binary_search(arr, a));
		// 8 10 20 30 40 50 60 70 80
		
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
	public static int binary_search(int[] arr,int a)
	{
		int left=0;
		int right=arr.length-1;
		
		while(left<=right){
			int mid =(left+right)/2;
			if(arr[mid]==a){
				return mid;
			}
			else if(a>arr[mid])
			{
				left=mid+1;
			}
			else if(a<arr[mid]){
				right=mid-1;
			}
		 
		}
		
		return -1;
		
	}


}
