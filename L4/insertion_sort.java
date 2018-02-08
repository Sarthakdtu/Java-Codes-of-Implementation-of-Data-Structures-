package L4;

import java.util.Scanner;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] arr = takeinput();

		// 8 80 40 60 30 70 20 50 10
		insertion_sorting(arr);
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

	public static void insertion_sorting(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			
			int key = arr[i];
			int j = i - 1;
			
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			
			arr[j + 1] = key;

		}
	}
}
