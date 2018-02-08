package l2;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the height");
		int i,n,p,k,q;
		Scanner s=new Scanner(System.in);
int m=s.nextInt();
i=1;
q=0;
n=m;
p=n-i;
k=0;

while(i<=n)
{
	k=0;
	q=i;
	p=n-i;
	 while(p>0)
	 {
		// System.out.print("*\t");
		 p--;
	 }

//System.out.print("\t");
q++;
while(q<2*i)
{
	//System.out.print("\t");
	q++;
	k++;}
q--;
q--;
while(k>0)
{//System.out.print("\t");
	k--;q--;
}
p=n-i;
while(p>0)
{
	 //System.out.print("*\t");
	 p--;
}

//System.out.print("\n");
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
		System.out.print("\t");
		p++;
	}
	
	System.out.print(q+"\t");
	q++;
	
	while(q<2*(i-1))
	{
		System.out.print(q+"\t");
		q++;
		k++;
	}
q--;q--;
while(k>0)
{
	System.out.print(q+"\t");
	k--;q--;
}
p=1;
while(p<n-i+2)
{
	System.out.print("\t");
	p++;
}
System.out.print("\n");
i--;
}


	
	
	}

}


	


