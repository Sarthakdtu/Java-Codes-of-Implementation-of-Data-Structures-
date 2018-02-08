package DataStructures;

import java.util.Scanner;

public class BalancedString {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
DynamicStack stack=new DynamicStack(str.length());
	

		System.out.println(isbalanced(stack,str));
		
		
		
	}
	
	public static boolean isbalanced(DynamicStack s,String str) throws Exception
	{int y=0;
		if(str.length()==0)
		{
			if(s.isEmpty())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		String ros=str.substring(1);
		char ch=str.charAt(0);
		if(ch=='{')
		{
			s.push(ch);
		}
		else if(ch=='[')
		{
			s.push(ch);
		} 
		else if(ch=='(')
		{
			s.push(ch);
		}
		else if(ch==')'&&(char)s.top()=='(')
		{
			
			s.pop();
		}
		else if(ch=='}'&&(char)s.top()=='{')
		{
			s.pop();
		}
		else if(ch==']'&&(char)s.top()=='[')
		{
			s.pop();
		}
		 else if(ch==')'&&(char)s.top()!='(')
		{
			return false;
			}
		else if(ch=='}'&&(char)s.top()!='{')
		{return false;
		}
		else if(ch==']'&&(char)s.top()!='[')
		{return false;
		}
		
		boolean ans=isbalanced(s,ros);
		
		
		return ans;
		
	}

}
