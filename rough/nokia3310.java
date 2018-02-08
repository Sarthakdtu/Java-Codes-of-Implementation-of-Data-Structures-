package rough;

import java.util.Scanner;

public class nokia3310 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scn = new Scanner(System.in);
				
				String str = scn.nextLine();
				System.out.println(countKeypadCombinations(str, ""));
				
				printKeypadCombinations(str, "");
				
			}
	
		
	public static int countKeypadCombinations(String str, String osf) {
	    if(str.length()==0)
	    {//System.out.println("end");
	        return 1;
	    }
	    
	    String str1="abc";
	    String str2="def";
	    String str3="ghi";
	    String str4="jkl";
	    String str5="mno";
	    String str6="pqr";
	    String str7="stu";
	    String str8="vwx";
	    String str9="yz";
	   
	   int k=0;
	   int n=(int)str.charAt(0)-48;
	   for(int i=1;i<10;i++)
	    {if(n==i)
	    {   
	        k=i;
	    }}
	    
	   int c1=0,c2=0,c3=0; 
	    
	    switch(k)
	    {
	        case 1: {c1=countKeypadCombinations(str.substring(1),str1.charAt(0)+osf);
	                  c2=countKeypadCombinations(str.substring(1),str1.charAt(1)+osf);
	                  c3=countKeypadCombinations(str.substring(1),str1.charAt(2)+osf);
	                break;}  
	        
	         case 2: {c1=countKeypadCombinations(str.substring(1),str2.charAt(0)+osf);
	                  c2=countKeypadCombinations(str.substring(1),str2.charAt(1)+osf);
	                  c3=countKeypadCombinations(str.substring(1),str2.charAt(2)+osf);
	               break; }  
	                
	                
	        case 3: {c1=countKeypadCombinations(str.substring(1),str3.charAt(0)+osf);
	                  c2=countKeypadCombinations(str.substring(1),str3.charAt(1)+osf);
	                  c3=countKeypadCombinations(str.substring(1),str3.charAt(2)+osf);
	               break; }  
	                
	                
	                
	        case 4: {c1=countKeypadCombinations(str.substring(1),str4.charAt(0)+osf);
	                  c2=countKeypadCombinations(str.substring(1),str4.charAt(1)+osf);
	                  c3=countKeypadCombinations(str.substring(1),str4.charAt(2)+osf);
	                break;}          
	        
	        case 5: {c1=countKeypadCombinations(str.substring(1),str5.charAt(0)+osf);
	                  c2=countKeypadCombinations(str.substring(1),str5.charAt(1)+osf);
	                  c3=countKeypadCombinations(str.substring(1),str5.charAt(2)+osf);
	               break; }          
	        
	        case 6: {c1=countKeypadCombinations(str.substring(1),str6.charAt(0)+osf);
	                  c2=countKeypadCombinations(str.substring(1),str6.charAt(1)+osf);
	                  c3=countKeypadCombinations(str.substring(1),str6.charAt(2)+osf);
	               break; }  
	                
	        case 7: {c1=countKeypadCombinations(str.substring(1),str7.charAt(0)+osf);
	                  c2=countKeypadCombinations(str.substring(1),str7.charAt(1)+osf);
	                  c3=countKeypadCombinations(str.substring(1),str7.charAt(2)+osf);
	                break;}  
	            
	        case 8: {c1=countKeypadCombinations(str.substring(1),str8.charAt(0)+osf);
	                  c2=countKeypadCombinations(str.substring(1),str8.charAt(1)+osf);
	                  c3=countKeypadCombinations(str.substring(1),str8.charAt(2)+osf);
	                break;}  
	        
	        case 9: {c1=countKeypadCombinations(str.substring(1),str9.charAt(0)+osf);
	                  c2=countKeypadCombinations(str.substring(1),str9.charAt(1)+osf);
	                 c3=0;
	                break;}          
	                
	    }
	          
	          return (c1+c2+c3);      
	                
	                
	                
	                
	                
	        
	    }
	    
	    
	    

	public static void printKeypadCombinations(String str, String osf) {
	    if(str.length()==0)
			{System.out.print(osf+" ");
			    return ;
			}

			String str1="abc";
			String str2="def";
			String str3="ghi";
			String str4="jkl";
			String str5="mno";
			String str6="pqr";
			String str7="stu";
			String str8="vwx";
			String str9="yz";

			int k=0;
			int n=(int)str.charAt(0)-48;
			for(int i=1;i<10;i++)
			{
			   if(n==i)
			   {
			    k=i;
			   }
			}
		 

			switch(k)
			{
			    case 1: { printKeypadCombinations(str.substring(1),osf+str1.charAt(0) );
			               printKeypadCombinations(str.substring(1),osf+str1.charAt(1) );
			               printKeypadCombinations(str.substring(1),osf+str1.charAt(2) );
			            break;}  
			    
			     case 2: { printKeypadCombinations(str.substring(1),osf+str2.charAt(0) );
			               printKeypadCombinations(str.substring(1),osf+str2.charAt(1) );
			               printKeypadCombinations(str.substring(1),osf+str2.charAt(2) );
			            break;}  
			            
			            
			    case 3: { printKeypadCombinations(str.substring(1),osf+str3.charAt(0) );
			               printKeypadCombinations(str.substring(1),osf+str3.charAt(1) );
			               printKeypadCombinations(str.substring(1),osf+str3.charAt(2) );
			            break;}  
			            
			            
			            
			    case 4: { printKeypadCombinations(str.substring(1),osf+str4.charAt(0) );
			               printKeypadCombinations(str.substring(1),osf+str4.charAt(1) );
			               printKeypadCombinations(str.substring(1),osf+str4.charAt(2) );
			            break;}          
			    
			    case 5: { printKeypadCombinations(str.substring(1),osf+str5.charAt(0) );
			               printKeypadCombinations(str.substring(1),osf+str5.charAt(1) );
			               printKeypadCombinations(str.substring(1),osf+str5.charAt(2) );
			            break;}          
			    
			    case 6: { printKeypadCombinations(str.substring(1),osf+str6.charAt(0) );
			               printKeypadCombinations(str.substring(1),osf+str6.charAt(1) );
			               printKeypadCombinations(str.substring(1),osf+str6.charAt(2) );
			           break; }  
			            
			    case 7: { printKeypadCombinations(str.substring(1),osf+str7.charAt(0) );
			               printKeypadCombinations(str.substring(1),osf+str7.charAt(1) );
			               printKeypadCombinations(str.substring(1),osf+str7.charAt(2) );
			           break; }  
			        
			    case 8: { printKeypadCombinations(str.substring(1),osf+str8.charAt(0) );
			               printKeypadCombinations(str.substring(1),osf+str8.charAt(1) );
			               printKeypadCombinations(str.substring(1),osf+str8.charAt(2) );
			           break; }  
			    
			    case 9: { printKeypadCombinations(str.substring(1),osf+str9.charAt(0) );
			               printKeypadCombinations(str.substring(1),osf+str9.charAt(1) );
			             
			           break; }          
			            
			}
			   
	}      
			            
			            
			            
			            
			            
			    
			


	}