package L6;

public class arr_more {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a={2,3,4,5,5,5,5,4,9,9,5,9,7,5,11};
System.out.println(check(a,0,11));
System.out.println(checkfirst(a,0,5));
System.out.println(checklast(a,0,5));
int[] b=allindices(a,0,5,0);



	}
	
	public static int check(int[] a,int si,int n)
	{
		if(si==a.length)
		{
			return -1;
		}
		if(a[si]==n)
		{
			return si;
		}
		else 
		{
			return (check(a,si+1,n));
		}
		
	}

	public static int checkfirst(int[] a,int si,int n)
	{
		if(si==a.length)
		{
			return -1;
		}
		if(a[si]==n)
		{
			return si;
		}
		else 
		{
			return (checkfirst(a,si+1,n));
		}
			
		
	}

	
	public static int checklast(int[] a,int si,int n)
	{
		if(si==a.length)
		{
			return -1;
		}
		
		int index=checklast(a,si+1,n);
		if(index!=-1)
		{
			
		}
		else
		{
		if(a[si]==n)
		{
			return si;
		}
		else 
		{
			return -1;
		}
		
			
		}
	}
	
	public static int[] allindices(int[] arr, int si, int num, int count) {
		if (si == arr.length) {
			return new int[count];
		}

		int[] indices = null;
		if (arr[si] == num) {
			indices = allindices(arr, si + 1, num, count + 1);
		} 
		else {
			indices = allindices(arr, si + 1, num, count);
		}

		if (arr[si] == num) {
			indices[count] = si;
		}

		return indices;
	}

	public static void printPattern(int N, int row, int col) {
		if (row > N) {
			return;
		}
		if (col > row) {
			System.out.println();
			printPattern(N, row + 1, 1);
			return;
		}
		System.out.print("*\t");
		printPattern(N, row, col + 1);
	}

}

	
	