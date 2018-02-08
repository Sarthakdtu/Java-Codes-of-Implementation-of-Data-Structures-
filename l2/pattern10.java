package l2;

import java.util.Scanner;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,n;
        Scanner s=new Scanner(System.in);
n=s.nextInt();
i=1;
j=0;
k=0;
        
    while(i<=n)
    {k=(2*i)-1;
    	j=1;
    	while(j<=i)
    	{
    		System.out.print(j+"\t");
    		j++;
    	}
    	
    	while(k<(2*n)-2)
    	{
    		System.out.print("\t");
    		k++;
    	}
    	if(i!=n)
    	{j=j-1;}
    	else
    		{j=j-2;}
    	
    	while(j>0)
    	{
    		System.out.print(j+"\t");
    		j--;
    	}
    	System.out.print("\n");
    	i++;
    	
    	
    }
	}

}
