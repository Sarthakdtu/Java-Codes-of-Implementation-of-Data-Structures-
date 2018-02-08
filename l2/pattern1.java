package l2;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter the height");
		int i,n,p,k,q;
		Scanner s=new Scanner(System.in);
n=s.nextInt();
i=1;
q=0;
p=n-i;
k=0;

while(i<=n)
{
	k=0;
	q=i;
	p=n-i;
	 while(p>0)
	 {
		 System.out.print(" ");
		 p--;
	 }

System.out.print(q);
q++;
while(q<2*i)
{
	System.out.print(q);
	q++;
	k++;}
q--;
q--;
while(k>0)
{System.out.print(q);
	k--;q--;
}
System.out.print("\n");
i++;

}



i--;

while(i>1)
{
	p=1;
	q=i-1;
	k=0;
	while(p<n-i+2)
	{
		System.out.print(" ");
		p++;
	}
	
	System.out.print(q);
	q++;
	
	while(q<2*(i-1))
	{
		System.out.print(q);
		q++;
		k++;
	}
q--;q--;
while(k>0)
{
	System.out.print(q);
	k--;q--;
}
System.out.print("\n");
i--;
}


	
	
	
	
	
	
	}

}
