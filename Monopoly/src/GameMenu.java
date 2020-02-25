import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameMenu
	{		
		static JFrame frame = new JFrame();

		public static void gameIntro()
		{
			ImageIcon villains = new ImageIcon(("villains.jpg"));
		    JOptionPane.showMessageDialog(frame, "Welcome to Disney Villain Monopoly!", null, JOptionPane.QUESTION_MESSAGE, villains);
	
		    
		    final String[] answer = { "Yes", "No" };
			
			final JFrame frame = new JFrame("JFrame Name");
			
		    String directions = (String) JOptionPane.showInputDialog(frame, 
		            
		    		"Would you like instructions?",
		            "Instructions",
		            JOptionPane.QUESTION_MESSAGE, 
		            null, 
		            answer, 
		            answer[0]);
		    
		    if (directions == answer[0])
		    	{
		    		gameInstructions();
		    	}
		    else
		    	{
		    		System.out.println("Well alrighty then smarty pants. Let's get started.");
		    	}
		}
		
		
		public static void gameInstructions()
			{

				// Emy master comment 
				//MonopolyCardsandDice.dices();
		System.out.println("Instructions: ");
				System.out.println();
				System.out.println("Each player begins with $1500."
						+ "\n One player will be selected at random to go first. the turns will proceed in numeric order.");
				System.out.println("Roll the dice on your turn to move across the board. "
						+ "\n The space you land on will tell you if you can buy a property, pay rent, go to jail, or draw a card.");
				System.out.println("The player with the most money at the end of the game wins!");


			

				System.out.println("Mother Gothal will serve as the bank and collect income tax, distribute money,"
						+ "\n and collect money when you choose to buy a proterty, railroad, or utility.");

				System.out.println("");

			}

	}