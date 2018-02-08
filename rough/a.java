package rough;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       
	    //Scanner s = new Scanner(System.in);
		 Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int[] arr1 = new int[n];
			int i;
			
			for (i = 0; i < n; i++) 
			{
				arr1[i] = s.nextInt();
			}
			
			int[] arr2 = new int[n];
			n = s.nextInt();
            for (i = 0; i < n; i++) 
            {
				arr2[i] = s.nextInt();
			}
			//add(arr1,arr2);
			
	     i=arr1.length-1;
	    int j=arr2.length-1;
	    int k;int m;
	   // int[] c;
	   int y=0;
	     //int[] s=new int[i+j];
	    if(i>=j)
	    {
	        k=j;
	       m=j;
	        //c=copy(arr2,i);
	        //int[] s=new int[k];
	        for(k=m;k>-1;k--)
	  {
	       arr1[i]=arr1[i]+arr2[j];
	      if((arr1[i]>9)&&(i>0))
	      {
	          arr1[i]=arr1[i]-10;
	          arr1[i-1]++;
	      }
	       else if((arr1[i]>9)&&(k==0)&&(i>0))
	  	      {arr1[i]=arr1[i]-10;
	  	      //y=1;
	  	      arr1[i-1]++;
	  	      }
	  	      
	       else if((arr1[i]>9)&&(k==0)&&(i==0))
	  	      {arr1[i]=arr1[i]-10;
	  	      y=1;
	  	      //arr1[i-1]++;
	  	      }
	      
	     i--;
	     j--;
	    }
	    }
	    else if(j>i)
	    {//
	        k=i;m=i;
	        for(k=m;k>-1;k--)
	  	  {
	  	       arr2[j]=arr1[i]+arr2[j];
	  	      if((arr2[j]>9)&&(k>0))
	  	      {
	  	          arr2[j]=arr2[j]-10;
	  	          arr2[j-1]++;
	  	      }
	  	      else if((arr2[j]>9)&&(k==0)&&(j>0))
	  	      {arr2[j]=arr2[j]-10;//y=1;
	  	      arr2[j-1]++;
	  	      }
	  	      
	       else if((arr2[j]>9)&&(k==0)&&(j==0))
	  	      {arr2[j]=arr2[j]-10;
	  	      y=1;
	  	      //arr1[i-1]++;
	  	      }
	  	      
	  	      i--;
	  	      j--;
	  	    }
	    }
	    
	    if(y==1)
	    {
	      System.out.print( "1,\t");  
	    }
	    
	  
	     if(arr1.length>=arr2.length)  
	 display(arr1);
	  else
		  display(arr2);
	}
			
			public static void display(int[] arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + ",\t");
			}
			System.out.print("END");
		}
	

	

	}
	