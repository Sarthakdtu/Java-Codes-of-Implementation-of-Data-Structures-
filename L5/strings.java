package L5;

import java.util.Scanner;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
	String str=s.next();
	//print(str);
//sub(str);
//	if(pal(str)==1)
//		{
//		System.out.println("true");
//		}
//	else
//	{
//		System.out.println("false");
//	}
	
	System.out.println(csub(str));
	}

	public static void print(String s)
	{
		for(int i=0;i<s.length();i++)
		System.out.println(s.substring(i,i+1));
	}
	
	
	public static void sub(String s)
	{
		for(int i=0;i<s.length();i++)
			{for(int j=i+1;j<s.length()+1;j++)
			System.out.println(s.substring(i,j));// or s.charAt(i);
			}
		
	}
	public static int csub(String s)
	{int c=0;
		for(int i=0;i<s.length()-1;i++)
			{for(int j=i+1;j<s.length();j++)
			//System.out.println(s.substring(i,j));// or s.charAt(i);
				if(pal(s.substring(i,j))==1)
				c++;
			}
		return c;
	}
	public static int pal(String str)
	{
		int f=1;
		int j=str.length()-1;
		for(int i=0;i<(str.length()/2);i++)
		     {if(str.charAt(i)!=str.charAt(j))
		     {
		    	 f=-1;
		     }
		    	 j--;
		    	 
			}
	
	return f;
	
}
}
