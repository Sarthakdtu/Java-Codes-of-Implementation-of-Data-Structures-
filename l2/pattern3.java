package l2;
import java.util.Scanner;
public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,p,k,n,q;
	        Scanner s=new Scanner(System.in);
	n=s.nextInt();
	        i=n;
	        while(i>1)
	{
		p=1;
		q=i-1;
		k=0;
		while(p<n-i+2)
		{
			System.out.print(p);
			p++;
		}
		
		System.out.print(" ");
		q++;
		
		while(q<2*(i-1))
		{
			System.out.print(" ");
			q++;
			k++;
		}
	q--;q--;
	while(k>0)
	{
		System.out.print(" ");
		k--;q--;
	}
	p=1;
	while(p<n-i+2)
		{
			System.out.print(n-p);
			p++;
		}
		
	System.out.print("\n");
	i--;

	        
	    }

	}

}
