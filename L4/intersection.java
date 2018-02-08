package L4;

import java.util.Scanner;

public class intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        Scanner s = new Scanner(System.in);
				int n = s.nextInt();
				int[] arr1 = new int[n];
				int i;
				int[] c=new int[n];
				int[] arr2 = new int[n];
				for (i = 0; i < n; i++) {
					arr1[i] = s.nextInt();
				}
			for (i = 0; i < n; i++) {
					arr2[i] = s.nextInt();
				}
		        int m,p;
		        m=0;
		        p=0;
		        int count=0;
		        
		        
		       	for (i = 0; i < 10; i++) {
		       	    m=0;p=0;
		       	    	for (int j = 0; j < n; j++) {
								if(arr1[j]==i)
								m++;
								if(arr2[j]==i)
								p++;
				} 
				
				if((m>0)&&(p>0))
				{
				if(m>=p)
				{while(p>0){
				    c[count]=i;p--;count++;
				}
				    
				}
				else if(m<p)
				{while(m>0){
				    c[count]=i;m--;count++;
				}
				    
				}
		        
		        
		       	}
		       	}
		       	System.out.print("]");
		       	for (i = 0; i < count-1; i++) {
					System.out.print(c[i]+",\t");
				}
		       System.out.print(c[count-1]+"]");
		        
		    }
		}