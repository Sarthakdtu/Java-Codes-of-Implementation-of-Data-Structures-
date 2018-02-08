package L9;

public class TCpower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(3,3));

	}
	
	public static int pow(int x,int n)
	{int b=0;
		if(n==1)
		{
			return x;
		}
		//x=x*x;
		int a=pow(x,n/2);
		
		 b=pow(x,(n/2));
		 
		 if(n%2!=0) 
		 {
			 b=b*x;
		 }
		x=a*b;
		return x;
	}

}
