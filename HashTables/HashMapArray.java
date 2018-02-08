package HashTables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr={2,3,2,1,7,7,1,3,4};
		
		HashMap <Integer,Integer> once=new HashMap();
		
		int i=0;
		
		while(i<arr.length)
		{
			int n=arr[i];
			once.put(n,1);
			i++;
		}
		
Set <Integer> keys=once.keySet();

ArrayList<Integer> stored=new ArrayList<>();
		
		for(Integer key:keys)
		{
			int n=key;
			stored.add(n);
		}
		
		System.out.println(stored);

 }
}
