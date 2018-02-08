package rough;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);	
        char ch;
        //char ch2='a';
       do{
                    //ch=s.nextChar();
                    ch =s.next().charAt();

                  calc(ch);
                
                  }while((ch!='x')&&(ch!='X'));

	}

	
	
	public static void calc(char ch)
	{ Scanner m=new Scanner(System.in);	
        
	 if(ch=='+')
	 { double n;
        double a;
	    double x;
	    n=m.nextDouble();
	   x=m.nextDouble();
	 
	   a=n+x;
	   System.out.println(a);
	 }
	 else if(ch=='-')
	 {  double n;
        double a;
	    double x;
	   n=m.nextDouble();
	    x=m.nextDouble();
	     a=n-x;
	      System.out.println(a);
	 }
	 else if(ch=='*')
	 {  double n;
        double a;
	    double x;
	   n=m.nextDouble();
	    x=m.nextDouble();
	   a=n*x;
	     System.out.println(a);
	 }
	 else if(ch=='/')
	 { double n;
        double a;
	    double x;
	    n=m.nextDouble();
	    x=m.nextDouble();
	    a=n/x;
	    System.out.println(a);
	   // System.out.println("plus");
	 }
	 else if(ch=='%')
	 {  double n;
        double a;
	    double x;
	   n=m.nextDouble();
	    x=m.nextDouble();
	   a=n%x;
	     System.out.println(a);
	 }
	 else if((ch=='x')||(ch=='X'))
	 { 
	   ;//System.out.println("THE TERMINATION");
	     //return 0;
	 }
	 else 
	 {
	     System.out.println("Invalid operation. Try again.");
	     //return 0;
	     
	 }
	    
	}
	

		

	    

}
