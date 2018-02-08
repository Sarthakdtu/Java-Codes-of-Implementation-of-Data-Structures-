import java.util.Scanner;

public class BINToDEC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the decimal number to convert it into binary");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(dectobin(n));
		
		System.out.println("Enter the binary number to convert it into decimal");
		n=s.nextInt();
		System.out.println(bintodec(n));
		

	}
	
	public static int dectobin(int n)
		{
		
	           int i=1;
	           int m;
	           int bin=0;
	           while(n!=0)
	           {
	        	   m=n%2;
	        	   bin=bin+(m*i);
	        	   i=i*10;
	        	   n=n/2;
	        	   
	           }
	           return bin;
		
		
		}
	
	public static int bintodec(int n)
	{
	
           int i=1;
           int m;
           int dec=0;
           while(n!=0)
           {
        	   m=n%10;
        	   dec=dec+(m*i);
        	   i=i*2;
        	   n=n/10;
        	   
           }
           return dec;
	
	
	}


}
