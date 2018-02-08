package LinkedList;

import java.util.Scanner;

public class ClientPoly {
//4 3 1 7 2 1 2 1 1 1 0 
	//8 3 1 7 1 1 5 0 0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		PolynomialsAdd p1=new PolynomialsAdd();
		PolynomialsAdd p2=new PolynomialsAdd();
		PolynomialsAdd p;
		
		int ch=1;
		do 
		{
			System.out.println("Enter coeff and exp=");
			int data=s.nextInt();
			int exp=s.nextInt();
		    p1.addAtLast(data,exp);	
			
			
	     System.out.println("\nEnter choice");	
	     ch=s.nextInt();
	     
		}while(ch==1);
				p1.display();
		do 
		{
			System.out.println("Enter coeff and exp=");
			int data=s.nextInt();
			int exp=s.nextInt();
		    p2.addAtLast(data,exp);	
			
			
	     System.out.println("\nEnter choice");	
	     ch=s.nextInt();
	     
		}while(ch==1);
		p2.display();

		p=p1.addPoly(p1,p2);
		p.display();
		System.out.println();
		p=p1.proPoly(p1,p2);
		p.display();
	}

}
