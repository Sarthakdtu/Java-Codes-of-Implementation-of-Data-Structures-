package l2;

import java.util.Scanner;

public class sum_dig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter digit=");
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int se, so;
		se = 0;
		so = 0;
		int i=1;
		int m=0;
		while (n>0) {
			m = n % 10;
			if((i%2==0)&&(i!=1)) {
				se = se + m;
			} else {
				so = so + m;
			}
			i++;
			n=n/10;
		}
System.out.println("sum of even places is" + se);
System.out.println("sum of odd places is"+ so);
	}

}
