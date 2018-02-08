import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter n");
		Scanner s=new Scanner(System.in);	
				int n=s.nextInt();
				

				System.out.println("Enter x");
				//Scanner s=new Scanner(System.in);	
						int x=s.nextInt();
						
						

						System.out.println(power(n,x));			
				

	
	}

	
	
	public static int power(int n, int x)
	{int i=1;
	int p=1;
	
		while(i<=x)
		{
			p=p*n;
			i++;
		}
		return p;
	}
	
}
