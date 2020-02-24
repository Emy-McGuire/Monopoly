import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MonopolyBank
	{
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
		static boolean movingForward = true;

		/*
		 * public static void bankerIntro() //{ //introduction to the banker
		 * //System.out.println("Mother Gothel is the Banker and Auctioneer.");
		 * //System.out.
		 * println("She will manage the funds in this game without actually being an active player."
		 * ); //end of banker introduction
		 * 
		 * //bank function intro System.out.println("The bank has many functions.");
		 * System.out.
		 * println("In this game, Mother Gothel holds title deeds, along with houses and hotels before they are bought by the players."
		 * ); System.out.
		 * println("She will pay your salaries and bonuses. Along with auction off properties and hands out the proper Title Deed cards when bought."
		 * ); System.out.
		 * println("Along with selling houses, hotels, and managing loans for mortagags. Mother Gothel "
		 * ); System.out.
		 * println("collects all taxes, fines, loans, and interest. She will never go bankrupt (no pun intended)."
		 * ); //end of bank function intro }
		 */

		public static void bankMath()
			{
				// Starting amount
				System.out.println("Each player starts out with $1500");
				System.out.println(
						" 2 $500s" + "\n 2 $100s" + "\n 2 $50s" + "\n 6 $20s" + "\n 5 $10s" + "\n 5 $5s" + "\n 5 $1s");
			}

		public static void choosePlayer()
			{

				playName.add(new players(1500.00, "Scar", 0));
				playName.add(new players(1500.00, "Hades", 0));
				playName.add(new players(1500.00, "Ysma", 0));
				playName.add(new players(1500.00, "Ursula", 0));

				System.out.println(" ");
				System.out.println("Choice your chracter *insert mortal combat theme song*:"

						+ "\n 1) Scar" + "\n 2) Hades" + "\n 3) Ysma" + "\n or" + "\n 4) Ursula");

				player1Choice = playerChoose.nextInt();

				if (player1Choice == 1)
					{
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

				if (player1Choice == 2)
					{
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

				if (player1Choice == 3)
					{
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

				if (player1Choice == 4)
					{
						playerName = "Ursula";
						System.out.println(
								"THOSE POOR UNFORTINATE SOULS that have to watch Ursula practic her BODY LANGUAGE...");
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

		public static void visitingDungeon()
			{
				if (players.index == 10)
					{
						System.out.println("Haha sucker you have to go pay a visit to the DUNGEON!"
								+ "\n and 1 of your turns was skipped");
						System.out.println(playerName + " is now on tile 11.");

					}
				players.setIndex(11);
				MonopolyCardsandDice.rollDice();
			}

		public static void inDungeon()
			{
				if (players.index == 30)
					{
						System.out.println(" ");
						System.out.println("You are now in the dungeon, " + playerName);
						System.out.println("You either have to pay $200 or lose three turns.");
						System.out.println(
								"What is your choice..." + playerName + "\n 1) Pay $200" + "\n 2) Lose Three Turns");

						dungeonChoice = playerChoose.nextInt();

						if (dungeonChoice == 1)
							{
								System.out.println(playerName + ", you are now out $200. The bank now is $200 richer.");
								playName.get(0).setMoney(playName.get(0).getMoney() - 200.0);

							}
						else if (dungeonChoice == 2)
							{
								System.out.println("You have lost three turns " + playerName
										+ " You are now back where you started on tile 1");

							}
					}
				players.setIndex(31);
				MonopolyCardsandDice.rollDice();
			}

		public static void landOnProperty()
			{
				if (players.index == 1)
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

							}
						MonopolyBank.playName.get(0)
								.setIndex(MonopolyBank.playName.get(0).getIndex() + MonopolyCardsandDice.diceSum);
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

							}
						// players.index = 3 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = 6 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = 8 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = players.index = 9 + MonopolyCardsandDice.diceSum;
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
								MonopolyCardsandDice.rollDice();

							}
						// players.index = 11 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = 13 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = 14 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = 16 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = 18 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = 19 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = 21 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = 23 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = 24 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = 26 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = 27 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = 29 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = 31 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = 32 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = 34 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = 37 + MonopolyCardsandDice.diceSum;
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

							}
						// players.index = 39 + MonopolyCardsandDice.diceSum;
						MonopolyCardsandDice.rollDice();

					}

			}

		public static void landOnRailroad()
			{
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

							}
						players.index = 5 + MonopolyCardsandDice.diceSum;
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
								players.index = 15 + MonopolyCardsandDice.diceSum;

							}
						players.index = 15 + MonopolyCardsandDice.diceSum;
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

							}
						players.index = 25 + MonopolyCardsandDice.diceSum;
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

							}
						players.index = 12 + MonopolyCardsandDice.diceSum;
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

							}
						players.index = 28 + MonopolyCardsandDice.diceSum;
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

							}
						players.index = 35 + MonopolyCardsandDice.diceSum;
						MonopolyCardsandDice.rollDice();

					}

			}

		public static void testParking()
			{
				players.index = 15;

				MonopolyCardsandDice.diceSum = 5;

			}

		public static void incomeTax()
			{

			}

	}
