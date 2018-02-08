package L6;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fib(7));
	}

	//static int a=-1;
	//static int b=0;
	//static int c=0;
	public static int fib(int n)
	{ ]
		
		if((n==0))
		{
			return 0;
		}
		else if((n==1))
		{
			return 1;
		}
		
		
		return (fib(n-1)+fib(n-2));
	}
	
}
