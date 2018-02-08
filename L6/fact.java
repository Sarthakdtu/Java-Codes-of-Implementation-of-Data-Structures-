package L6;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(6));

	}

	public static int fact(int f)
	{
		if(f==1)
		{
			return 1;
		}
		return (f*fact(f-1));
		//System.out.print()
	}
	
	
	
	
	
}
