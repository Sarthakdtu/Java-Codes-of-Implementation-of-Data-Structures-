package l2;

import java.util.Scanner;

public class fib_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner s = new Scanner(System.in);
		
		n=s.nextInt();
		int f = 1;
		int j=1;
		int a = 0;
		int b = 1;
		int i = 1;
		System.out.print("0\n");
		while (i<n) {
			j=1;
			while(j<i+2)
			{
		System.out.print(f+" ");
			f = a + b;
			b = f;
			a = b - a;
			j++;
		}
			i++;
			System.out.print("\n");
		}
	}

}
