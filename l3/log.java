import java.util.Scanner;

public class log {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter n");
		Scanner s=new Scanner(System.in);	
				int n=s.nextInt();
				

				System.out.println("Enter x");
					
						int x=s.nextInt();
						
						

						System.out.println(log(n,x));			
				
						
	
	}

	
	
	public static int log(int n, int x)
	{int i=0;
	int p=1;
	
		while(n>1)
		{i++;
			n=n/x;
			
		}
		return i;
	}
	


	}

