package l2;

import java.util.Scanner;

public class pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.println("Please enter the height");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int i,j,k;
k=1;
i=0;
int p=1;
j=0;
int fi=1;
int fj=1;
int fij=1;
while(k<n+1)
{p=1;
while(j<=i)
{
while(p<i+1)
	{
		fi=fi*1;
		p++;
		fi++;
	}
p=1;

while(p<j+1)
	{
		fj=fj*1;
		p++;
		fj++;
	}
p=1;
while(p<(i-j+1))
	{
		fij=fij*1;
		p++;
		fij++;
	}

		System.out.print(fi/fj*fij);
j++;
}

System.out.println("");
i++;
}



	}

}
