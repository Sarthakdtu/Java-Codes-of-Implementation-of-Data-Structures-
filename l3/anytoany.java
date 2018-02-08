import java.util.Scanner;

public class anytoany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,db,sb;
		System.out.println("Enter the decimal number to convert it into any form");
		Scanner s=new Scanner(System.in);
		 n=s.nextInt();
				
		System.out.println("Enter the destination base");
		 db=s.nextInt();
		System.out.println(dectoany(n,db));
		
		System.out.println("Enter the any number to convert it into any form");
		 n=s.nextInt();
		System.out.println("Enter the source base");
		 sb=s.nextInt();
		 System.out.println("Enter the destination base");
		 db=s.nextInt();
		System.out.println(anytoany(n,sb,db));
		
		
		

	}
	
	
	public static int anytoany(int n,int sb,int db)
	{           int m=anytodec(n,sb);
	
             m=dectoany(m,db);
           
           return m;
	
	
	}


	public static int dectoany(int n,int db)
		{
		
	           int i=1;
	           int m;
	           int any=0;
	           while(n!=0)
	           {
	        	   m=n%db;
	        	   any=any+(m*i);
	        	   i=i*10;
	        	   n=n/db;
	        	   
	           }
	           return any;
		
		
		}
	
	public static int anytodec(int n,int sb)
	{
	
           int i=1;
           int m;
           int dec=0;
           while(n!=0)
           {
        	   m=n%10;
        	   dec=dec+(m*i);
        	   i=i*sb;
        	   n=n/10;
        	   
           }
           return dec;
	}
	
	



}
