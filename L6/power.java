package L6;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(4,3));

	}
	//static int c=0;
	public static int pow(int n,int x)
	{  if(x==0)
	{
		return 1;
	}
		//c++;
		return (pow(n,x-1)*n);
	}

}
