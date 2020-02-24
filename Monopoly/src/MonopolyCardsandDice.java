
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class MonopolyCardsandDice
	{
		static int rollTotal;
		static boolean playing = true;

		static int randomNumber1;
		static int randomNumber2;
		static int randomNumber3;
		static int randomNumber4;
		static int randomNumber5;
		static int randomNumber6;
		static int randomNumber7;
		static int randomNumber8;
		static int randomNumber9;
		static int randomNumber10;

		static int diceA;
		static int diceB;
		static int diceC;
		static int diceD;
		static int diceE;
		static int diceF;
		static int diceG;
		static int diceH;
		static int diceI;
		static int diceJ;

		static int diceSum;
		static int diceSum2;
		static int diceSum3;
		static int diceSum4;
		static int diceSum5;

		static String roll;
		static String roll2;
		static String roll3;
		static String roll4;
		static String roll5;

		static Scanner userInput = new Scanner(System.in);

		public static void rollDice()
			{

				randomNumber1 = (int) (Math.random() * 6 + 1);
				randomNumber2 = (int) (Math.random() * 6 + 1);
				randomNumber3 = (int) (Math.random() * 6 + 1);
				randomNumber4 = (int) (Math.random() * 6 + 1);
				randomNumber5 = (int) (Math.random() * 6 + 1);
				randomNumber6 = (int) (Math.random() * 6 + 1);
				randomNumber7 = (int) (Math.random() * 6 + 1);
				randomNumber8 = (int) (Math.random() * 6 + 1);
				randomNumber9 = (int) (Math.random() * 6 + 1);
				randomNumber10 = (int) (Math.random() * 6 + 1);

				diceA = randomNumber1;
				diceB = randomNumber2;
				diceSum = diceA + diceB;

				diceC = randomNumber3;
				diceD = randomNumber4;
				diceSum2 = diceC + diceD;

				diceE = randomNumber5;
				diceF = randomNumber6;
				diceSum3 = diceE + diceF;

				diceG = randomNumber7;
				diceH = randomNumber8;
				diceSum4 = diceG + diceH;

				diceI = randomNumber9;
				diceJ = randomNumber10;
				diceSum5 = diceI + diceJ;

				// Pass go isn't working

				while (playing)
					{

						// 1
						//diceSum = 20;
						System.out.println("Click enter to roll");
						roll = userInput.nextLine();
						System.out.println("Your index is 20");
						System.out.println("You rolled: " + diceA + " and " + diceB + " for a total of " + diceSum);
						MonopolyBank.playName.get(0).setIndex(MonopolyBank.playName.get(0).getIndex() + diceSum);
						MonopolyPlay.locationPics();
						GoTriggerEvent();
					
						// 2
						System.out.println("Click enter to roll again");
						roll2 = userInput.nextLine();
						System.out.println("You rolled: " + diceC + " and " + diceD + " for a total of " + diceSum2);
						MonopolyBank.playName.get(0).setIndex(diceSum + diceSum2);
						MonopolyPlay.locationPics();
						// 3
						System.out.println("Click enter to roll again");
						roll3 = userInput.nextLine();
						System.out.println("You rolled: " + diceE + " and " + diceF + " for a total of " + diceSum3);
						MonopolyBank.playName.get(0).setIndex(diceSum + diceSum2 + diceSum3);
						MonopolyPlay.locationPics();
						// 4
						System.out.println("Click enter to roll again");
						roll4 = userInput.nextLine();
						System.out.println("You rolled: " + diceG + " and " + diceH + " for a total of " + diceSum4);
						MonopolyBank.playName.get(0).setIndex(diceSum + diceSum2 + diceSum3 + diceSum4);
						MonopolyPlay.locationPics();
						// 5
						System.out.println("Click enter to roll again");
						roll5 = userInput.nextLine();
						System.out.println("You rolled: " + diceI + " and " + diceJ + " for a total of " + 0);
						MonopolyBank.playName.get(0).setIndex(diceSum + diceSum2 + diceSum3 + diceSum4 + diceSum5);
						MonopolyPlay.locationPics();

						if (players.index >= 39)
							{

								MonopolyCardsandDice.GoTriggerEvent();

							}
					}
			}

		public static void CheckMoneyLevel()
			{
				if (players.money == 5000.0)
					{
						System.out.println("YAY! " + MonopolyBank.playName + ". You just won Disney Monopoly!!");
						playing = false;
					}

				else if (players.money == 0.0)
					{
						System.out.println("Ooops looks like you are out of money meaning you are..." + "\n "
								+ "\n BANKRUPT!!" + "\n ");
						playing = false;
					}
				else
					{
						System.out
								.println(MonopolyBank.playerName + "'s bank account is currently at: " + players.money);
						rollDice();
					}
			}

		public static void GoTriggerEvent()
			{
				//players.index = players.index - 39;
				System.out.println("You have passed GO! So you get $200 added to your bank account.");
				players.money += 200.0;

				CheckMoneyLevel();

			}
		public static void landOnFreeParking()
			{
				System.out.println("I'm here");

				MonopolyBank.playName.get(0)
						.setIndex(MonopolyBank.playName.get(0).getIndex() + MonopolyCardsandDice.diceSum * -1);

				// if (players.index == 20)
				// {

				// movingForward = false;

				// }

				/*
				 * if (movingForward == true) { for (players.index = 0; players.index <
				 * MonopolyRunner.board.length; players.index++) {
				 * 
				 * players.index += MonopolyCardsandDice.diceSum;
				 * 
				 * } }
				 */

				// if(movingForward == false)
				// {
				// for (players.index = 20; players.index < MonopolyRunner.board.length;
				// players.index--)
				// {
				// }
				// }
			}

		public static void chanceCardsDeck()
			{
				ArrayList<Cards> chance = new ArrayList<Cards>();
				chance.add(new Cards("Chance Card", "Get out Of Jail Free", true, 0, 0));
				chance.add(new Cards("Chance Card", "Pay taxes", false, 0, 150));
				chance.add(new Cards("Chance Card", "Go to Jail", false, 0, 0));
				chance.add(new Cards("Chance Card", "You are assessed for street repair", false, 0, 50));
				chance.add(new Cards("Chance Card", "You inherit a will", false, 200, 0));
				chance.add(new Cards("Chance Card", "Advance to go", false, 0, 0));

			}

		public static void comunnityChestCardsDeck()
			{
				ArrayList<Cards> comunnityChest = new ArrayList<Cards>();
				comunnityChest.add(new Cards("Community Chest Card", "Get out Of Jail Free", true, 0, 0));
				comunnityChest
						.add(new Cards("Community Chest Card", "Advance to Sleeping Beauty's Castle", false, 0, 0));
				comunnityChest.add(new Cards("Community Chest Card", "Go to Jail", false, 0, 0));
				comunnityChest.add(new Cards("Community Chest Card", "go back 3 steps", false, 0, 0));
				comunnityChest
						.add(new Cards("Community Chest Card", "Banck pays you a dividend of 100", false, 100, 0));
				comunnityChest.add(new Cards("Community Chest Card", "Advance to Go", false, 0, 0));

			}
//
	}
