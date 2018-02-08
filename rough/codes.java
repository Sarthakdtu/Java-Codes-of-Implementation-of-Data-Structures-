package rough;

import java.util.ArrayList;
import java.util.Scanner;

public class codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner s=new Scanner(System.in);
		        String str=s.next();
		        System.out.print(code(str));

		    }
		    
		    
		    public static ArrayList<String> code(String str)
		    {
		        if(str.length()==0)
		        {ArrayList<String> base=new ArrayList<>();
		            base.add("");
		            return base ;
		        }
		        
		        ArrayList <String> res=code(str.substring(1));
		        ArrayList<String> myres=new ArrayList<>();
		        
		        char ch=str.charAt(0);
		        int n=(int)ch+48;
		        
		        for(int i=0;i<res.size();i++)
		        {
		            String s=res.get(i);
		            
		            	myres.add((char)n+s);
		            
		        }
		        
		        if(str.length()>1){
		        res=code(str.substring(2));
		        ch=str.charAt(0);
		        char ch1=str.charAt(1);
		        n=((int)ch-48)*10+(int)ch1+48;
		        for(int i=0;i<res.size();i++)
		        {
		            String s=res.get(i);
		            
		            	myres.add((char)n+s);
		            
		        }
		        }
		        return myres;
		            }
		}