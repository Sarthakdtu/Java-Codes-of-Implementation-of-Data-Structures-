package L5;

import java.util.Scanner;

public class WavePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr=takeinput();
		//wave(arr);
		spiral(arr);
		

	}
	
	
	public static int [][] takeinput(){ 
		Scanner s=new Scanner(System.in);
		System.out.print("enter the no. of rows= ");
		int rows=s.nextInt();
		
	int[][] arr=new int[rows][];
	for(int i=0;i<rows;i++)
	{   
		System.out.print("enter the no. of cols= ");
	    int cols=s.nextInt();
	    arr[i]=new int [cols];
	    for(int j=0;j<cols;j++)
	    {
	    	
	    	    System.out.print("enter the data= ");
	    arr[i][j]=s.nextInt();
	    }
	 
	}
	return arr;
	
}
	
	public static void wave(int[][] arr)
	{int j;
		for(int i=0;i<arr.length;i++)
		{if(i%2==0)
			for(j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		else
			for(j=arr[i].length-1;j>-1;j--)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
	}

	
	public static void spiral(int[][] arr)
	{
		int top=0;
		int bottom=arr.length-1;
		int left=0;
		int right=arr.length-1;
		int c=top;
		int x=1;
		int i;
		int y=0;
		//int count=((bottom+1)*(right+1))-1;
		while((top<=bottom)&&(left<=right))
		{
			if((x>0)&&(y==0)){
				c=top;
			for(i=top;i<=right;i++)
			{
				System.out.print(arr[c][i]+" ");
			}
			top++;x=0;y=-1;
			}
			else if((x==0)&&(y<0))
			{    c=right;
				for(i=top;i<=bottom;i++)
				{
					System.out.print(arr[i][c]+" ");
				}
				right--;x=-1;y=0;
			}
			else if((x<0)&&(y==0))
			{ c=bottom;
				for(i=right;i>left-1;i--)
				{
					System.out.print(arr[c][i]+" ");
				}
				bottom--;x=0;y=1;
			}
			else if((x==0)&&(y>0))
			{c=left;
				for(i=bottom;i>top-1;i--)
				{
					System.out.print(arr[i][c]+" ");
				}
				left++;x=1;y=0;
			}
			
			
			
			
		}
		
		
		
		
	}
	
}
