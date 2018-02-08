package Heap;

import java.util.LinkedList;
import java.util.Scanner;

public class GameOfArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		LinkedList<String> list1=new LinkedList();
		playgame(list1,20,8,s,"");
		System.out.println("Your path is" +list1);
		System.out.println("And Your Score is : "+list1.size());
		
	}

	private static void playgame(LinkedList<String> list1, int a, int b,Scanner s,String pre) {
	  	
		clearAndshow(list1,a,b);
	    String ch=s.next();
		
	    if(ch.equals("X")&&!ch.equals(pre))
	    {
	    	a=a+3;
	    	b=b+2;
	    	 if(a<0||b<0)
	  	    {
	  		  return;
	  	    }
	    	 list1.addLast(ch);
	    	playgame(list1,a,b,s,ch);
	    }
	    else  if(ch.equals("Y")&&!ch.equals(pre))
	    {
	    	a=a-5;
	    	b=b-10;
	    	 if(a<0||b<0)
	  	    {
	  		  return;
	  	    }
	    	 list1.addLast(ch);
	    	playgame(list1,a,b,s,ch);
	    }
	    else if(ch.equals("Z")&&!ch.equals(pre))
	 	    {
	 	    	a=a-20;
	 	    	b=b+5;
	 	    	 if(a<0||b<0)
	 	  	    {
	 	  		  return;
	 	  	    }
	 	    	 list1.addLast(ch);
	 	    	playgame(list1,a,b,s,ch);
	 	    }
	    else
	    {
	    	System.out.println("Enter right path");
	    	playgame(list1,a,b,s,ch);
	    }
		
	}
	
	public static void clearAndshow(LinkedList<String> list,int a,int b)
	{
		System.out.println(list);
		System.out.println("Your powers are A : "+a+" and  B : "+ b);
		System.out.println("X(3,2) , Y(-5,-10) , Z(-20,5) ");
	}

}
