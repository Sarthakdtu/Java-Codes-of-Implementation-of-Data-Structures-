package L6;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pattern(5,0,0);
	}
	public static void pattern(int n,int row,int col)
	{if(row==n)
	{
		return;
	}
		System.out.print("*");
		pattern(n-1,row+1,col);
		 if(col<=row)
		{
			pattern(n-1,row,col+1);
		}
	}

}
