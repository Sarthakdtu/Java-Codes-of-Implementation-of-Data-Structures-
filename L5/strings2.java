package L5;

import java.util.Scanner;

public class strings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		StringBuilder str=new StringBuilder();//s.next();
		str.append("a");
		str.append("B");str.append("c");str.append("D");str.append("e");str.append("F");
		
		System.out.println(toggle(str));
	}

	
	
	public static String toggle(StringBuilder str)
	{char ch;
		for(int i=0;i<str.length();i++)
		{ch=str.charAt(i);
			//for(ch='A';ch<='Z';ch++)
			if((ch>='A')&&(ch<='Z'))
			{str.setCharAt(i,(char)((int)ch+32));}
			//for(ch='a';ch<='z';ch++)
			if((ch>='a')&&(ch<='z'))
				{str.setCharAt(i,(char)((int)ch-32));}
		}
		return(str.toString());
		
	}
}
