package HashTables;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Character,Integer> frequency=new HashMap();
		
		Scanner s=new Scanner(System.in);
		String str=s.next();
		
    System.out.println(maxFrequency(str,frequency));		
System.out.println(frequency);

	}

	private static char maxFrequency(String str, HashMap <Character, Integer> frequency) {
		
		
		int i=0;
		while(i<str.length())
		{
			char ch=str.charAt(i);
			
			if(!frequency.containsKey(ch)){
			frequency.put(ch,1 );
			}
			else
			{
				frequency.put(ch,frequency.get(ch)+1);
			}
			i++;
		}
		
		i=0;
		char max='\0';
		int maxf=0;
		int maxcurr=0;
		
		Set <Character> keys=frequency.keySet();
		
		for(Character key:keys)
		{
			char ch=key;
			maxcurr=frequency.get(ch);
			if(maxcurr>maxf)
			{
				maxf=maxcurr;
				max=ch;
			}
			
		}
		
		return max;
		
	}

}
