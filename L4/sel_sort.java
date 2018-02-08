package L4;

import java.util.Scanner;

public class sel_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] arr = takeinput();
	
		// 8 80 40 60 30 70 20 50 10
		selection_sorting(arr);
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
	public static void selection_sorting(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{int min=i;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{min=j;}
			}
					int temp;
					temp=arr[i];
				  arr[i]=arr[min];
				  arr[min]=temp;
				}
			
		}
	}



