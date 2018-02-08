import java.util.Scanner;

public class Asciibw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
		
		StringBuilder str=new StringBuilder();//s.next();
		str.append("A");
		str.append("C");str.append("G");str.append("O");str.append("P");str.append("x");
		
		System.out.println(between(str));  
	}
	
	public static String between(StringBuilder str)
	{
		char ch1;
		char ch2;
		int j=0;
		
		StringBuilder str1=new StringBuilder();
	
		for(int i=0;i<str.length();i++)
		{ch1=str.charAt())(i);ch2=str.(i+1);
		int m=(int)ch1-(int)ch2;
			str1.setCharAt(j,ch1);
			str1.setCharAt(j,(char)m);
			str1.setCharAt(j,ch2);
			j=j+3;
		}
		return(str1.toString());	
		}
		

}
