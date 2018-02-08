package l2;

import java.util.Scanner;

public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint i,n,p,k,q;
		Scanner s=new Scanner(System.in);
int m=s.nextInt();
int i=1;
int q=0;
int n;
n=m;
int p=n-i;
int k=0;

while(i<=n)
{
	k=0;
	q=i;
	p=n-i;
	 while(p>=0)
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
while(p>=0)
{
	// System.out.print("*\t");
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
	while(p<=n-i+2)
	{
		System.out.print(q+"\t");
		p++;
	}
	
	System.out.print("\t");
	q++;
	
	while(q<2*(i-1))
	{
		System.out.print("\t");
		q++;
		k++;
	}
q--;q--;
while(k>0)
{
	System.out.print("\t");
	k--;q--;
}
p=1;
while(p<=n-i+2)
{
	System.out.print(q+"\t");
	p++;
}
System.out.print("\n");
i--;
}



	}

}
