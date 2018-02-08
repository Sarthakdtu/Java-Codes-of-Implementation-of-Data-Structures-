package LinkedList;

import java.util.Scanner;

public class DuplicateBrackets {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		String str=s.next();
		StackUsingLL stack=new StackUsingLL();
		
		System.out.println(checkDuplicate(str,stack,false));
		
		
		
		

	}

	private static boolean checkDuplicate(String str,StackUsingLL s,boolean sofar) throws Exception {
		
		if(str.length()==0)
		{
			return false;
		}
		char ch=str.charAt(0);
		
		String ros=str.substring(1);
	
		
		if(ch=='(')
		{
			s.push(ch);
			sofar=false;
		}
		else if(ch==')')
		{			
			int n=s.pop();
			if(sofar)
			{
				return true;
			}
			else
			sofar=true;
		}
		
		
		boolean ans=checkDuplicate(ros,s,sofar);
		
		return ans;
	}

}
