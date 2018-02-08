package l2;
import java.util.Scanner;

public class fib1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		
		n=s.nextInt();
		int f = 0;
		int a = 0;
		int b = 1;
		int i = 1;
		while (i<=n) {
			
			f = a + b;
			b = f;
			a = b - a;
			i++;
		}
		
		System.out.print(f);

	}

}
