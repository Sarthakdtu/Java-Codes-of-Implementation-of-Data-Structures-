package L4;

import java.util.Scanner;

public class bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] arr = takeinput();
	
		// 8 80 70 60 50 40 30 20 10
		bubble_sorting(arr);
	display(arr);	
	}
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
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
	
	public static void bubble_sorting(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
				    arr[j]=arr[j+1];
				    arr[j+1]=temp;
				}
			}
		}
	}
}
