import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);	
        char ch;
        //char ch2='a';
       do{
                    //ch=s.nextChar();
                    ch =s.next().charAt(0);
 
                        //ch2=ch;
                  calc(ch);
                  }while((ch!='x')&&(ch!='X'));
        

						//System.out.println(power(n,x));			
				

	
	}

	
	
	public static void calc(char ch)
	{ Scanner m=new Scanner(System.in);	
    
	    int n;
	    int x;
	    if(ch=='+')
	 { n=m.nextInt();
	    x=m.nextInt();
	   
	   System.out.print(n+x);
	 }
	 else 	 if(ch=='-')
	 { n=m.nextInt();
	    x=m.nextInt();
	   
	     System.out.print(n-x);
	 }
	 else 	 if(ch=='*')
	 { n=m.nextInt();
	    x=m.nextInt();
	   
	     System.out.print(n*x);
	 }
	 else 	 if(ch=='/')
	 { n=m.nextInt();
	    x=m.nextInt();
	   
	    System.out.print(n/x);
	 }
	 else 	 if(ch=='%')
	 { n=m.nextInt();
	    x=m.nextInt();
	   
	     System.out.print(n%x);
	 }
	 else  if((ch=='x')||(ch=='X'))
	 { 
	   ;
	     //return 0;
	 }
	 else 
	 {
	     System.out.print("Invalid operation. Try again");
	     //return 0;
	 }
	    
	}
	
	

}
