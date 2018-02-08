package L4;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] arr = takeinput();
		System.out.println("enter number to be found=");
		int a = s.nextInt();
		System.out.println("element found at" + linear_search(arr, a) + "th index");
		// 5 10 20 30 40 50
		reverse(arr);
		System.out.println("reversed array is");
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

	public static int linear_search(int[] arr, int a) {

		int f = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				f = i;
			}
		}

		return f;

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void reverse(int[] arr) {
		for (int i = 0; i < (arr.length / 2); i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;

		}

		// return arr;
	}

}
