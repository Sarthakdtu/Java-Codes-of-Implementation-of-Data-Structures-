package L7;

import java.util.ArrayList;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BoardPath(7,5));

	}

	
	public static ArrayList<String> BoardPath(int end ,int current)
	{
		ArrayList<String> ways=new ArrayList<>();
		if(end<current)
		{ways.add("1");
			return ways;
		}
		for(int i=0;i<ways.size();i++)
		{
			ArrayList<String> way1=BoardPath(end-1,1);
			ArrayList<String> way2=BoardPath(current-1,1);
			
		
		ways.add((int)(way1.get(i))+(int)(char)(way2.get(i)));
		}
		return ways;
		
		
	}
}
