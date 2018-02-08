package Heap;

import java.util.Random;
import java.util.Scanner;

public class TTT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int[][] board=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j]=-1;
			}
		}
	
		rules(board);
		System.out.println();
		System.out.println();
		
		startPlaying(board,s);
		
	}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~RULES FOR THE GAME~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

	private static void rules(int[][] board) {
		System.out.println("\t\t\t\t\t\t\tHELLO AND WELCOME TO THE GREAT \n\t\t\t\t\t\t\t\tTIC-TAC-TOE \n  \t\t\t\t\t\t\t\t...GAME...");
		System.out.println();
		System.out.println();
		System.out.println("  =>RULES FOR THE GAME");
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		System.out.println("1. The Board is divided into 9 squares ...");
		System.out.println("2. You have to choose one square  at a time and computer will choose a new square after you.");
		System.out.println("3. To win the game ..........you know what to do !!!");
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		System.out.println();
		displayboardFirstTime(board);
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t~~~~~~~~~~~~Good Luck!!!~~~~~~~~~~~~");
		System.out.println("\t\t\t\t\t\t\t~~~~~~~~~~~~Have Fun!!!!~~~~~~~~~~~~");
	}
	
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//	

	public static void startPlaying(int[][] board,Scanner s) {
		
		Random rand = new Random(); 
		playerMove(board,s);
		if(WinnerFound(board))
		{
			return ;
		}
		compMove(board,rand);
		if(WinnerFound(board))
		{
			return ;
		}
		displayboard(board);
		startPlaying(board,s);
	}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
	
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~PLAYER'S MOVE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//	
	
	private static void playerMove(int[][] board,Scanner s) {                       
	    System.out.println();
	    System.out.println();
		System.out.print("Enter square number =");
		int move=s.nextInt();
		if(move>9)
		{
			System.out.println("Please enter valid choice !!!!!");
			playerMove(board,s);
		}
		if(check(move,board))
		{
			System.out.println("You have selected :"+ move);
			fillBoard(move,board,1);
			return;
		}
		System.out.println();
		System.out.println("Already Filled");
		playerMove(board,s);
	}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`//	

//~~~~~~~~~~~~~~~~~~~~~~~~~~COMPUTER'S MOVE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
	private static void compMove(int[][] board,Random rand) {
		
		if(compCheckWin(board,0))
		{
			return ;
		}
		int move= rand.nextInt(9);
		move=move+1;
		
			
		if(check(move,board))
		{
			
			fillBoard(move,board,0);
			System.out.print("Computer has chosen square : "+ move);
			return;
		}
		
		compMove(board,rand);
			
 }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//	
	
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~WINNER FOUND FUNCTION~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//	
private static boolean WinnerFound(int[][] board) 
   {
		
		for(int i=0;i<3;i++)
		{
			if(checkcol(board,i))
			{
				displayboard(board);
				return true;
			}
			if(checkrow(board,i))
			{
				displayboard(board);
				return true;
			}
		}
	
		if(checkDiagonal(board))
		{
			displayboard(board);
			return true;
		}
		
		
		return false;
	}

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//



//~~~~~~~~~~~~~~~~~~~~~~~~~~~CHECKING FOR COMPUTER'S WINNING POTENTIAL~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

private static boolean compCheckWin(int[][] board, int pre) {
	
      for(int i=1;i<10;i++)
      {
    	  if(check(i,board)&&WinnerFound(board))
    	  {
    		    computerPrintWin(board,i);
    			return true;
       	  }
      }
	return false;
}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//


//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~FILLING BOARD WITH CHOICES~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~```//
private static void fillBoard(int move, int[][] board,int n) {
	
	int[] arr=findCoordinates(move);
	board[arr[0]][arr[1]]=n;
	
}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~CHECKING FOR AVAILABILITY OF SQUARE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
private static boolean check(int move, int[][] board) {
	
	int[] arr=findCoordinates(move);
	if(board[arr[0]][arr[1]]==-1)
	{
		return true;
	}

	return false;
}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~FINDING COORDINATES ACCORDING TO SQUARE NUMBER~~~~~~~~~~~~~~~~~~~~~~~~~~//

private static int[] findCoordinates(int move) {
     int [] arr=new int[2];
     
     if(move==1 )
     {
    	 arr[0]=0 ;
    	 arr[1]= 0;
     }
     else if(move== 2)
     {
    	 arr[0]= 0;
    	 arr[1]= 1;
     }
     else  if(move==3 )
     {
    	 arr[0]= 0;
    	 arr[1]= 2;
     }
     else if(move==4 )
     {
    	 arr[0]= 1;
    	 arr[1]= 0;
     }else  if(move==5 )
     {
    	 arr[0]= 1;
    	 arr[1]= 1;
     }
     else if(move==6 )
     {
    	 arr[0]= 1;
    	 arr[1]= 2;
     }
     else if(move==7 )
     {
    	 arr[0]= 2;
    	 arr[1]= 0;
     }else  if(move==8 )
     {
    	 arr[0]= 2;
    	 arr[1]= 1;
     }
     else if(move==9 )
     {
    	 arr[0]= 2;
    	 arr[1]= 2;
     }

    
	return arr;
}

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//


//----------------------------------------------------------------------------------------------------------


//-----------------********************CHECKING PART********************----------------------------------//

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~CHECKING ROW FOR COMPLETION~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
private static boolean checkrow(int[][] board, int i) {
	
	if(checkrow(board,i,0))
	{
		return true;
	}
	
	if(checkrow(board,i,1))
	{
		return true;
	}
	
	return false;
}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~CHECKING ROW PROPERLY FOR WINNER~~~~~~~~~~~~~~~~~~~~~~~~~~//

private static boolean checkrow(int[][] board,int j,int pre) {
	
		if(board[j][0]==pre&&board[j][1]==pre&&board[j][2]==pre)
		{
			declareWinner(pre);
			return true;
		}
	
	return false;
}


//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//


//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~CHECKING DIAGONAL FOR WINNER~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
private static boolean checkDiagonal(int[][] board) {

	if(checkForDiagonalL(board,0))
	{
		return true;
	}
	if(checkForDiagonalL(board,1))
	{
		return true;
	}

	if(checkForDiagonalR(board,0))
	{
		return true;
	}
	if(checkForDiagonalR(board,1))
	{
		return true;
	}
	return false;
}

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
//
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~CHECKING RIGHT DIAGONAL~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
private static boolean checkForDiagonalR(int[][] board, int pre) {
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
		 if(i+j==2&&board[i][j]!=pre)
			{
				return false;
			}

		}
	}
	declareWinner(pre);
	return true;
}

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~CHECKING FOR LEFT DIAGONAL~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

private static boolean checkForDiagonalL(int[][] board, int pre) {

	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
		 if(i==j&&board[i][j]!=pre)
			{
				return false;
			}

		}
	}
	declareWinner(pre);
	return true;
}

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//


//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~CHECKING COLUMN FOR WINNER~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
private static boolean checkcol(int[][] board, int i) {


	if(checkcol(board,i,0))
	{
		return true;
	}
	
	if(checkcol(board,i,1))
	{
		return true;
	}
	
	return false;
}

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//


//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~CHECKING COLUMN PROPERLY FOR WINNER~~~~~~~~~~~~~~~~~~~~~~~~~~//

private static boolean checkcol(int[][] board, int i,int pre) {
	if(board[0][i]==pre&&board[1][i]==pre&&board[2][i]==pre)
	{
		declareWinner(pre);
		return true;
	}

	return false;
}

//----------------------------------------------------------------------------------------------------------


//-----------------********************PRINTING PART********************----------------------------------//


//~~~~~~~~~~~~~~~~~~~~~~~~~~DISPLAY BOARD FOR THE FIRST TIME~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
public static void displayboardFirstTime(int[][] board) {
		int count=1;
		for(int i=0;i<3;i++)
		{
			System.out.print("\t\t\t\t\t\t\t\t  ");
			for(int j=0;j<3;j++)
			{
				System.out.print(count+" ");
				if(j!=2)
				System.out.print(" | ");
				count++;
			}
			if(i!=2)
			{
				System.out.println();
				System.out.print("\t\t\t\t\t\t\t\t~~~~~~~~~~~~~~~~");
			    System.out.println();
			}
		}
	}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~DISPLAY BOARD~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
	public static void displayboard(int[][] board) {
		System.out.println();
		System.out.println();
		System.out.println();
		for(int i=0;i<3;i++)
		{
			System.out.print("   ");
			for(int j=0;j<3;j++)
			{
				Printcheck(board[i][j]);
				if(j!=2)
				System.out.print(" | ");
			}
			if(i!=2)
			{
				System.out.println();
				System.out.print("~~~~~~~~~~~~~~~~");
			    System.out.println();
			}
		}
	}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
	
//~~~~~~~~~~~~~~~~~~~~~~~~ACTUAL DECISION FOR PRINTING~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
	public static void Printcheck(int i) {
	
	if(i==-1)
	 {
		System.out.print(" ");
	 }
		else
		{
			if(i==1)
			{
				System.out.print("O");
			}
			else
			{
				System.out.print("X");
			}
		}
		
	}
	
	public static void computerPrintWin(int[][] board,int i)
	{
		    fillBoard(i,board,0);
			System.out.print("Computer has chosen square : "+ i);
	}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
	
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~DECLARING WINNER~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
	private static void declareWinner(int pre) {
		if(pre==1)
			{
			System.out.print("\n~~~~~~~~~~~~~~~~~~~~YOU WON~~~~~~~~~~~~~~~~~~ ");
			System.out.println();}
			else
			{
			System.out.print("\n~~~~~~~~~~~~~~~~~~~~Computer Won ~~~~~~~~~~~~~~~~~~ ");
			System.out.println();
			}
	}

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
	
//*****************************************************************************************************
}
