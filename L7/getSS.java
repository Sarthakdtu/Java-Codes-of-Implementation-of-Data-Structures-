package L7;

import java.util.ArrayList;
import java.util.Scanner;

public class getSS {
	
    

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
	    String str=s.next();
	  ArrayList <String> list=getSS(str);
	 // display(list,str);
	  System.out.print(list);

	}
	public static ArrayList<String> getSS(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> baseResult=new ArrayList<>();
			baseResult.add("");
			return baseResult;
			
		}
		
		char cc=str.charAt(0);
		String ros=str.substring(1);
		ArrayList <String> myResult=new ArrayList<>();
		ArrayList <String> recResult=getSS(ros);
		for(int i=0;i<recResult.size();i++)
		{
			myResult.add(recResult.get(i));
			myResult.add(cc+recResult.get(i));
			}
		return myResult;
	}
//	public static void display(ArrayList<String> arr,String str) {
//		for (int i = 0; i <pow(2,str.length()) ; i++) {
//			System.out.print(arr[i] + " ");
//		}
//	}
	
	public static int power(int n, int x)
	{int i=1;
	int p=1;
	
		while(i<=x)
		{
			p=p*n;
			i++;
		}
		return p;
	}

}
