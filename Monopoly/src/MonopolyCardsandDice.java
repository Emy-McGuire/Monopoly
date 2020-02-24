
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class MonopolyCardsandDice
	{
		static int rollTotal;
		static boolean playing = true;
		
		
		static int randomNumber1;
		static int randomNumber2;
		
		static int diceA;
		static int diceB;
		
		static int diceSum;
		
		
		static String roll;
		
		static Scanner userInput = new Scanner(System.in);

		
public static void rollDice()
	{
				
	while(playing)
		{
			randomNumber1 = (int) (Math.random() * 6 + 1);
			randomNumber2 = (int) (Math.random() * 6 + 1);
		
			diceA = randomNumber1;
			diceB = randomNumber2;
			diceSum = diceA + diceB;
		
			if(players.index >= 0 && players.index <= 38)
			  {
				playing = true;
	
					System.out.println("Click enter to roll");
					roll = userInput.nextLine();
					System.out.println("You rolled: " + diceA + " and " + diceB + " for a total of " + diceSum);
					MonopolyBank.playName.get(0).setIndex(MonopolyBank.playName.get(0).getIndex() + diceSum);
					MonopolyPlay.locationPics();
					
				}
			
			if(players.index >= 39)
				{
					
					GoTriggerEvent();
					
					
				}
		}
	}
	
				public static void CheckMoneyLevel()
					{
						if(players.money == 5000.0)
							{
								System.out.println("YAY! " + MonopolyBank.playName + ". You just won Disney Monopoly!!");
								playing = false;
							}
									
						else if(players.money == 0.0)
							{
								System.out.println("Ooops looks like you are out of money meaning you are..."
												+ "\n "
												+ "\n BANKRUPT!!"
												+ "\n ");
								playing = false;
							}
						
						else
							{
								System.out.println(MonopolyBank.playerName + "'s bank account is currently at: " + players.money);
								rollDice();
							}
					}
					
				public static void GoTriggerEvent()
					{	
						System.out.println("You have passed GO! So you get $200 added to your bank account." );
						MonopolyBank.playName.get(0).setMoney(MonopolyBank.playName.get(0).getMoney() + 200.0);
						MonopolyBank.playName.get(0).setIndex(1);
										
						CheckMoneyLevel();
								
				
					}

		
		
		
/*
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
 */
		
}

