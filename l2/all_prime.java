package l2;

import java.util.Scanner;

public class all_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Please enter n=");
Scanner s=new Scanner(System.in);
	int n;
	n=s.nextInt();
	int i=2;
	int j=3;
	int m,k;
	m=0;
	System.out.println(" 2");
	while(i<n)
	{k=3;m=0;
		if(j%2!=0)
		{
			while(k<=n/2)
			{if((j%k==0)&&(j!=k))
			{m=1;
			}
			k++;
			}
			
			if(m==0)
				System.out.println(" "+j);
		}
		i++;j++;
	}
	
	
	
	
	}

}
