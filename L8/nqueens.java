package L8;

public class nqueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board=new boolean[8][8];
		//System.out.println(nqueens(board,0));
		printnqueens(board,0,"");

	}
	
	
	public static int nqueens(boolean[][] board, int row)
	{
		if(row==board.length){
			return 1;
		}
		
		int count=0;
		for(int col=0;col<board[row].length;col++)
		{
			if(isItSafe(board,row,col)){
				board[row][col]=true;
				count=count+nqueens(board,row+1);
				board[row][col]=false;
			}
		}
		return count;
		
	}
	public static void printnqueens(boolean[][] board, int row,String str)
	{
		if(row==board.length){
			System.out.println(str);
			return ;
		}
		
		
		for(int col=0;col<board[row].length;col++)
		{
			if(isItSafe(board,row,col)){
				board[row][col]=true;
				//System.out.println(" {"+row+"-"+col+"} ");
				char ch1=(char)(row+49);
				char ch2=(char)(col+49);
				printnqueens(board,row+1, str+"{"+ch1+"-"+ch2+"};  " );
				board[row][col]=false;
			}
		}
		
		
	}
	public static boolean isItSafe(boolean[][] board,int row,int col)
	{
		for(int i=0;i<board.length;i++)
		{ 
			for(int j=0;j<board[i].length;j++)
			{
				int p=i;
					if(board[i][j]==true)
					{	for(int k=i+1;k<board[i].length;k++)
					       {										
							if((k==row)&&(j==col))
							return false;				
					       }		
					for(int m=j+1;m<board[i].length;m++)
					{   p++;
						if((p==row)&&(m==col))
							return false;	
					}
					p=i;
					for(int m=j-1;m>-1;m--)
					{   p++;
					
						if((p==row)&&(m==col))
							return false;	
					}

					
				   }
			}
			}
		
		return true;
	}

}
