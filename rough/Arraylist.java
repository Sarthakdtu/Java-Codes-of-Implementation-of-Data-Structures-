package rough;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> list=getBoardPath(3,0);
		
		printpath(3,0);
		//System.out.println(list);
	}
	public static ArrayList<String> getss(String str)
	{
		if(str.length()==0)
		{ArrayList<String> res=new ArrayList<>();
		res.add("");
			return  res;
		}
		ArrayList<String> myres=new ArrayList<>();
		ArrayList<String> pre=getss(str.substring(1));
		char ch=str.charAt(0);
		for(int i=0;i<pre.size();i++)
		{
			myres.add(pre.get(i));
			myres.add(ch+pre.get(i));
		
		}
		
		return myres;
		
	}
	
	public static ArrayList<String> allp(String str)
	{
		if(str.length()==0)
		{ArrayList<String> res=new ArrayList<>();
		res.add("");
			return  res;
		}
		ArrayList<String> myres=new ArrayList<>();
		ArrayList<String> pre=allp(str.substring(1));
		char ch=str.charAt(0);
		for(int i=0;i<pre.size();i++)
		{String s1=(pre.get(i));
			for(int j=i;j<=s1.length();j++)
			{
				//String s1=(pre.get(i));
				myres.add(s1.substring(0, j)+ch+s1.substring(j));
				//String s2=myres.add(ch+pre.get(i));
			
			}
		}
		
		return myres;
	}
	public static ArrayList<String> getBoardPath(int end, int current) {
		if (current == end) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		if (current > end) {
			ArrayList<String> baseResult = new ArrayList<>();
			return baseResult;
		}
		ArrayList<String> recResult = null;
		ArrayList<String> myResult = new ArrayList<>();
		for (int i = 1; i <= 2; i++) {
			recResult = getBoardPath(end, current + i);
			for (int j = 0; j < recResult.size(); j++) {
				myResult.add(i + recResult.get(j));
			}
		}

		return myResult;
	}
	public static void printpath(int e,int c)
	{
		if(e==c)
		{System.out.println("");
			return;
		}
		
		if(e<c)
		{	
			return;
		}
		for(int i=1;i<e;i++)
		{
			for(int j=1;j<e-i;j++)
			{	printpath(e,c+i);
			
			System.out.print(i+" ");
			}
			}
	}

}
