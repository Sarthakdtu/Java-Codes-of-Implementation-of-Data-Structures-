package l2;

import java.util.Scanner;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter n");
		int n;
		Scanner s = new Scanner(System.in);
		
		n=s.nextInt();
		int f = 1;
		int a = 0;
		int b = 1;
		int i = 1;
		while (i<=n) {
			if(f<=n){System.out.println(f);}
			f = a + b;
			b = f;
			a = b - a;
			i++;
		}

	}

}
