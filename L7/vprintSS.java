package L7;

public class vprintSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSS("ab","");
		

	}
	
	public static void printSS(String str,String res)
	{
		if(str.length()==0)
		{
			System.out.print(res+" ");
			return;
		}
		
		//System.out.print(str+" ");
		char ch=str.charAt(0);
		
		printSS(str.substring(1),res);
		
		printSS(str.substring(1),res+ch);
		printSS(str.substring(1),res+(int)ch);
		
	}
	
	
	

}
