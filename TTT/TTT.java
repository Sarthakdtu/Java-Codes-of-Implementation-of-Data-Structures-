package TTT;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class TTT extends JFrame implements ActionListener{

	
	
	public static final int size=3;
	private static enum GameStatus{
		Xwins,Zwins,Incomplete,Tie;
	}
	
	boolean crossTurn=true;
	private JButton buttons[][]=new JButton[size][size];
	
	TTT()
	{
		super.setSize(800, 800);
		super.setVisible(true);
		super.setTitle("Tic-Tac-Toe");
		
		GridLayout grid=new GridLayout(size,size);
		super.setLayout(grid);
		Font font =new Font("Comic Sans",1,150);
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				JButton button=new JButton("");
				button.addActionListener(this);
				button.setFont(font);
				buttons[i][j]=button;
				super.add(button);
			}	
		}	
		
		super.setResizable(false);
			
	}	
		
		
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clickedButton=(JButton)(e.getSource());
		makeMove(clickedButton);
		GameStatus gs=getgamestatus();
		if(gs==GameStatus.Incomplete)
		{
			return;
		}
		declareWinner(gs);
		int choice=JOptionPane.showConfirmDialog(this, "Wanna Play Again ?");
		if(choice==JOptionPane.YES_OPTION)
		{
			for(int i=0;i<size;i++)
			{
				for(int j=0;j<size;j++)
				{
					buttons[i][j].setText("");
				}
		    }
		crossTurn=true;
		}
		else
		{
			super.dispose();
		}
	}



	private void declareWinner(GameStatus gs) {
		// TODO Auto-generated method stub
		
		if(gs==GameStatus.Xwins)
		{
			JOptionPane.showMessageDialog(this, "X Wins!!!");
		}
		else if(gs==GameStatus.Zwins)
		{
			JOptionPane.showMessageDialog(this, "Z Wins!!!");
		}
		else if(gs==GameStatus.Tie)
		{
			JOptionPane.showMessageDialog(this, "Tie !!!!");
		}
	}



	private GameStatus getgamestatus() {
		// TODO Auto-generated method stub
		String  text1="",text2="";
		int row=0;
		int col=0;
		
		while(row<size)
		{
			col=0;
			while(col<size-1)
			{
				text1=buttons[row][col].getText();
				text2=buttons[row][col+1].getText();
				if(text1.equals("")||text2.equals("")||!text1.equals(text2))
				{
					break;
				}
				col++;
				if(col==size-1)
				{
					String winner =buttons[row][col].getText();
					if(winner.equals("X"))
					{
						return GameStatus.Xwins;
					}
					else if(winner.equals("O"))
					{
						return GameStatus.Zwins;
					}
				}
				
			}
			row++;
		}
		
		row=0;
		col=0;
		while(col<size)
		{
			row=0;
			while(row<size-1)
			{
				text1=buttons[row][col].getText();
				text2=buttons[row+1][col].getText();
				if(text1.equals("")||text2.equals("")||!text1.equals(text2))
				{
					break;
				}
				row++;
				if(row==size-1)
				{
					String winner =buttons[row][col].getText();
					if(winner.equals("X"))
					{
						return GameStatus.Xwins;
					}
					else if(winner.equals("O"))
					{
						return GameStatus.Zwins;
					}
				}
				
			}
			col++;
		}
		
		 row=0;
	      col=0;
	      while(row<size-1)
	      {

				text1=buttons[row][col].getText();
				text2=buttons[row+1][col+1].getText();
			
				if(text1.equals("")||text2.equals("")||!text1.equals(text2))
				{
					break;
				}
				row++;
				col++;
				if(row==size-1)
				{
					String winner =buttons[row][col].getText();
					if(winner.equals("X"))
					{
						return GameStatus.Xwins;
					}
					else if(winner.equals("O"))
					{
						return GameStatus.Zwins;
					}
				}
				
			
	      }
	      

			 row=size-1;
		      col=0;
		      while(row>0)
		      {

					text1=buttons[row][col].getText();
					text2=buttons[row-1][col+1].getText();
				
					if(text1.equals("")||text2.equals("")||!text1.equals(text2))
					{
						break;
					}
					row--;
					col++;
					if(row==0)
					{
						String winner =buttons[row][col].getText();
						if(winner.equals("X"))
						{
							return GameStatus.Xwins;
						}
						 if(winner.equals("O"))
						{
							return GameStatus.Zwins;
						}
					}
					
				
		      }
		      
		      
		      for(int i=0;i<size;i++)
				{
					for(int j=0;j<size;j++)
					{
						String text=buttons[i][j].getText();
						if(text.equals(""))
								{
							             return GameStatus.Incomplete;
								}
								
					}
			    }
		      
		      return GameStatus.Tie;
 }
	
	


      private void makeMove(JButton clickedButton) {
		// TODO Auto-generated method stub
		String text=clickedButton.getText();
		if(text.length()>0)
		{
			JOptionPane.showMessageDialog(this,"Inavlid Choice");
			return;
		}
		else
		{
			if(crossTurn)
			{
				clickedButton.setText("X");
			}
			else
			{
				clickedButton.setText("O");
			}
			crossTurn=!crossTurn;
		}
				
	}
      
     

}
