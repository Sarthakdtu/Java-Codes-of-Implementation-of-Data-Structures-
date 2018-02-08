package L6;

public class Rec_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Poe(5);
Poe(4);
	}
	
	
	
	
	public static void Poe(int num)
	{
		if(num<=0)
	{
		return;
	}
	     System.out.println(num);
	    
		Poe(num-2);
	    
		
	}

}






