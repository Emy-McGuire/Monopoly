import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MonopolyBank {
	static Scanner playerChoose = new Scanner(System.in);
	static int player1Choice;
	// static int player2Choice;
	static ArrayList<players> playName = new ArrayList<players>();
	static String playerName;
	static int dungeonChoice;
	static Scanner intInput = new Scanner(System.in);
	static int choice;
	static int choice2;
	static int choice3;

	

	public static void bankMath() {
		// Starting amount
		System.out.println("Each player starts out with $1500");
		System.out
				.println(" 2 $500s" + "\n 2 $100s" + "\n 2 $50s" + "\n 6 $20s" + "\n 5 $10s" + "\n 5 $5s" + "\n 5 $1s");
	}

	public static void choosePlayer() {

		playName.add(new players(1500.00, "Scar", 0));
		playName.add(new players(1500.00, "Hades", 0));
		playName.add(new players(1500.00, "Ysma", 0));
		playName.add(new players(1500.00, "Ursula", 0));

		System.out.println(" ");
		System.out.println("Choice your chracter *insert mortal combat theme song*:"

				+ "\n 1) Scar" + "\n 2) Hades" + "\n 3) Ysma" + "\n or" + "\n 4) Ursula");

		player1Choice = playerChoose.nextInt();

		if (player1Choice == 1) {
			playerName = "Scar";
			System.out.println("OOOOO Scar, I guess you have to BE PRRRREEEEEEPAAAAARREEED!");
			System.out.println("You will now be known as Scar.");
			System.out.println();
	
										// System.out.println("Now player 2 who do you want to be? Your choises are:"
										// + "\n 1) Hades"
										// + "\n 2) Ysma"
										// + "or "
										// + "\n 3) Ursula");
		
										// player2Choice = playerChoose.nextInt();
										// if(player2Choice == 1)
										// {
										// System.out.println("How do you kill a god? The one question Hades is still
										// asking.");
										// System.out.println("You will now be known as Hades.");
							
										// }
										// else if(player2Choice == 2)
										// {
										// System.out.println("Pull the Lever Cronk, WRONG LEVER!! The master mind of
										// postions Ysma.");
										// System.out.println("You will now be known as Ysma.");
							
										// }
										// else if(player2Choice == 3)
										// {
										// System.out.println("THOSE POOR UNFORTINATE SOULS that have to watch Ursula
										// practic her BODY LANGUAGE...");
										// System.out.println("You will now be known as Ursula.");
							
										// }

		}

		if (player1Choice == 2) {
			playerName = "Hades";
			System.out.println("How do you kill a god? The one question Hades is still asking.");
			System.out.println("You will now be known as Hades.");
			System.out.println();

										// System.out.println("Now player 2 who do you want to be? Your choises are:"
										// + "n/ 1) Scar"
										// + "n/ 2) Ysma"
										// + "or "
										// + "n/ 3) Ursula");
										// player2Choice = playerChoose.nextInt();
										// if(player2Choice == 1)
										// {
										// System.out.println("OOOOO Scar, I guess you have to be PREPARED!");
										// System.out.println("You will now be known as Scar.");
							
										// }
										// else if(player2Choice == 2)
										// {
										// System.out.println("Pull the Lever Cronk, WRONG LEVER!! The master mind of
										// postions Ysma.");
										// System.out.println("You will now be known as Ysma.");
							
										// }
										// else if(player2Choice == 3)
										// {
										// System.out.println("THOSE POOR UNFORTINATE SOULS that have to watch Ursula
										// practic her BODY LANGUAGE...");
										// System.out.println("You will now be known as Ursula.");
							
										// }

		}

		if (player1Choice == 3) {
			playerName = "Ysma";
			System.out.println("Pull the Leva Cronk, WRONG LEVAAA!! The master mind of postions Ysma.");
			System.out.println("You will now be known as Ysma.");
			System.out.println();

										// System.out.println("Now player 2 who do you want to be? Your choises are:"
										// + "n/ 1) Scar"
										// + "n/ 2) Hades"
										// + "or "
										// + "n/ 3) Ursula");
										// player2Choice = playerChoose.nextInt();
										// if(player2Choice == 1)
										// {
										// System.out.println("OOOOO Scar, I guess you have to be PREPARED!");
										// System.out.println("You will now be known as Scar.");
							
										// }
										// else if(player2Choice == 2)
										// {
										// System.out.println("How do you kill a god? The one question Hades is still
										// asking.");
										// System.out.println("You will now be known as Hades.");
							
										// }
										// else if(player2Choice == 3)
										// {
										// System.out.println("THOSE POOR UNFORTINATE SOULS that have to watch Ursula
										// practic her BODY LANGUAGE...");
										// System.out.println("You will now be known as Ursula.");
							
										// }

		}

		if (player1Choice == 4) {
			playerName = "Ursula";
			System.out.println("THOSE POOR UNFORTINATE SOULS that have to watch Ursula practic her BODY LANGUAGE...");
			System.out.println("You will now be known as Ursula.");
			System.out.println();

										// System.out.println("Now player 2 who do you want to be? Your choises are:"
										// + "n/ 1) Scar"
										// + "n/ 2) Hades"
										// + "or "
										// + "n/ 3) Ysma");
										// player2Choice = playerChoose.nextInt();
										// if(player2Choice == 1)
										// {
										// System.out.println("OOOOO Scar, I guess you have to be PREPARED!");
										// System.out.println("You will now be known as Scar.");
							
										// }
										// else if(player2Choice == 2)
										// {
										// System.out.println("How do you kill a god? The one question Hades is still
										// asking.");
										// System.out.println("You will now be known as Hades.");
							
										// }
										// else if(player2Choice == 3)
										// {
										// System.out.println("Pull the Lever Cronk, WRONG LEVER!! The master mind of
										// postions Ysma.");
										// System.out.println("You will now be known as Ysma.");
							
										// }

		}

	}

	public static void visitingDungeon() {
		if (players.index == 10) {
			System.out.println(
					"Haha sucker you have to go pay a visit to the DUNGEON!" + "\n and 1 of your turns was skipped");
			System.out.println(playerName + " is now on tile 11.");
			

		}
		playName.get(0).setIndex(11);
		MonopolyCardsandDice.rollDice();
	}

	public static void inDungeon() {
		if (players.index == 30) {
			System.out.println(" ");
			System.out.println("You are now in the dungeon, " + playerName);
			System.out.println("You either have to pay $200 or lose three turns.");
			System.out.println("What is your choice..." + playerName + "\n 1) Pay $200" + "\n 2) Lose Three Turns");

			dungeonChoice = playerChoose.nextInt();

				if (dungeonChoice == 1) 
					{
						System.out.println(playerName + ", you are now out $200. The bank now is $200 richer.");
						playName.get(0).setMoney(playName.get(0).getMoney() - 200.0);

					} 
				else if (dungeonChoice == 2) 
					{
						System.out.println(
								"You have lost three turns " + playerName + " You are now back where you started on tile 1");
					}
		}
		
		playName.get(0).setIndex(31);
		MonopolyCardsandDice.rollDice();
	}

	public static void landOnProperty() {
		if (players.index == 1) {
			System.out.println("Would you like to buy this property?");

			System.out.println("(1) Yes");
			System.out.println("(2) No");
			choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();

				} 
			
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(1);
				}
			
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 3) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();

				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(3);
				}
			
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 6) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
					

				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(6);
				}
			
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 8) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(8);
				}
			
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();
		}
		
		if (players.index == 9) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(9);
				}
			
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();
		}
		
		if (players.index == 11) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(11);
				}
			
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}

		if (players.index == 13) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(13);
				}
			
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 14) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();

				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(14);
				}
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 16) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(16);
				}
			
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 18) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(18);
				}
			
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 19) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(19);
				}
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 21) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				}
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(21);
				}
			
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 23) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(23);
				}
			
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 24) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				} 
			else if (choice == 2) 
				{
					
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(24);
				}
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 26) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(26);
				}
			
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 27) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(27);
				}
			
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();
		}
		
		if (players.index == 29) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(29);
				}
			
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 31) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1)
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(31);
				}
			
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 32) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(32);
				}
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();
		}
		
		if (players.index == 34) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(34);
				}
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 37) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(37);
				}
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 39) 
			{
				System.out.println("Would you like to buy this property?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice = intInput.nextInt();

			if (choice == 1) 
				{
					System.out.println("You have chosen to purchase the property");
					playName.get(0).setMoney(playName.get(0).getMoney() - 100.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				} 
			else if (choice == 2) 
				{
					System.out.println("You chose not to buy the Property, roll again!");
					playName.get(0).setIndex(38);
				}
			
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}

	}

	public static void landOnRailroad() {
		if (players.index == 5) 
			{
				System.out.println("Would you like to buy this railroad?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice2 = intInput.nextInt();

			if (choice2 == 1) 
				{
					System.out.println("You have chosen to purchase the railroad");
					playName.get(0).setMoney(playName.get(0).getMoney() - 250.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				} 
			else if (choice2 == 2) 
				{
					System.out.println("You chose not to purchase the Railroad, please roll again!");
					playName.get(0).setIndex(7);
				}
			
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 15) 
			{
				System.out.println("Would you like to buy this railroad?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice2 = intInput.nextInt();

			if (choice2 == 1) 
				{
					System.out.println("You have chosen to purchase the railroad");
					playName.get(0).setMoney(playName.get(0).getMoney() - 250.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				}
			else if (choice2 == 2) 
				{
					System.out.println("You chose not to purchase the Railroad, please roll again!");
					playName.get(0).setIndex(15);
				}
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 25) 
			{
				System.out.println("Would you like to buy this railroad?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice2 = intInput.nextInt();

			if (choice2 == 1) 
				{
					System.out.println("You have chosen to purchase the railroad");
					playName.get(0).setMoney(playName.get(0).getMoney() - 250.0);
					MonopolyCardsandDice.CheckMoneyLevel();
				}
			else if (choice2 == 2) 
				{
					System.out.println("You chose not to purchase the Railroad, please roll again!");
					playName.get(0).setIndex(25);
				}
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();
		}

	}

	public static void landOnUtility() 
		{
		if (players.index == 12) 
			{
				System.out.println("Would you like to buy this utility?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice3 = intInput.nextInt();

			if (choice3 == 1) 
				{
					System.out.println("You have chosen to purchase the utility");
					playName.get(0).setMoney(playName.get(0).getMoney() - 300.0);
				} 
			else if (choice3 == 2) 
				{
					System.out.println("You chose not to purchase the Utility, please roll again!");
					playName.get(0).setIndex(12);
				}
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		
		if (players.index == 28) 
			{
				System.out.println("Would you like to buy this utility?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice3 = intInput.nextInt();

			if (choice3 == 1) 
				{
					System.out.println("You have chosen to purchase the utility");
					playName.get(0).setMoney(playName.get(0).getMoney() - 300.0);
				} 
			else if (choice3 == 2) 
				{
					System.out.println("You chose not to purchase the Utility, please roll again!");
					playName.get(0).setIndex(28);
				}
			
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}
		if (players.index == 35) 
			{
				System.out.println("Would you like to buy this utility?");
	
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				choice3 = intInput.nextInt();

			if (choice3 == 1) 
				{
					System.out.println("You have chosen to purchase the utility");
					playName.get(0).setMoney(playName.get(0).getMoney() - 300.0);
				} 
			else if (choice3 == 2) 
				{
					System.out.println("You chose not to purchase the Utility, please roll again!");
					playName.get(0).setIndex(35);
				}
			playName.get(0).setIndex(playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
			MonopolyCardsandDice.rollDice();

		}

	}

	public static void incomeTax() 
		{
			//why cant this merge
		}

}
