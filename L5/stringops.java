package L5;

import java.util.Scanner;

public class stringops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        String str=s.next();
	     System.out.print(strcomp1(str));
	        
	    }
	   public static String strcomp1(String str) {
					StringBuilder sb = new StringBuilder();
					int c=0;
					char pre = str.charAt(0);
					for (int i = 0; i < str.length(); i++) {
						char cc = str.charAt(i);
						c=0;int y=0;
						if(i!=0)
						 pre=str.charAt(i-1);
							if((cc!=pre)||(i==0))
						{for(int j=i;j<str.length();j++)
						{if((j<str.length()-1)&&(y==0))
						    {if((cc==str.charAt(j))&&(cc==str.charAt(j+1)))
							{c++;y=0;}
						else 
							{y=1;}
						}
						}
					        	sb.append(cc);
					        	if(c>0)
						    	sb.append(c+1);
				
						}
					

					}
		
					

					return sb.toString();
				}
}