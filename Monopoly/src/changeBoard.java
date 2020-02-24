

	import java.io.File;

	import java.util.Scanner;

	import java.io.File;

	import java.io.BufferedReader;

	import java.io.FileReader;

	import java.io.*;



	public class changeBoard {



	static Tile[] board1 = new Tile[40];

	public static void changeGameBoard()throws Exception

	{

		board1 = new Tile[40];

	System.out.println("Please pick a Board that you want to play");

	System.out.println("please press 1 for Original or 2 for Disney theme");

	Scanner userInput = new Scanner (System.in);

	int choice = userInput.nextInt();

	if(choice == 1)

	{

		FileReader file1 = new FileReader("OrigionalMonopolyBoard");

		BufferedReader file2 = new BufferedReader(file1);

		String file;

		file = file2.readLine();

		board1[0] = new Go(file);

		file = file2.readLine();

		board1[1] = new Property( file , "PURPLE", 60);

		file = file2.readLine();

		board1[2] = new CommunityChest(file);

		file = file2.readLine();

		board1[3] = new Property(file, "PURPLE", 60);

		file = file2.readLine();

		board1[4] = new Tax(file);

		file = file2.readLine();

		board1[5] = new Railroad(file, "GRAY", 200);

		file = file2.readLine();

		board1[6] = new Property(file, "LIGHT BLUE", 100);

		file = file2.readLine();

		board1[7] = new CommunityChest(file);

		file = file2.readLine();

		board1[8] = new Property(file, "LIGHT BLUE", 100);

		file = file2.readLine();

		board1[9] = new Property(file, "LIGHT BLUE", 120);

		file = file2.readLine();

		board1[10] = new Dungeon(file);

		file = file2.readLine();

		board1[11] = new Property(file, "PINK", 140);

		file = file2.readLine();

		board1[12] = new Utility(file, "WHITE", 150);

		file = file2.readLine();

		board1[13] = new Property(file, "PINK", 140);

		file = file2.readLine();

		board1[14] = new Property(file, "PINK", 160);

		file = file2.readLine();

		board1[15] = new Railroad(file, "GRAY", 200);

		file = file2.readLine();

		board1[16] = new Property(file, "ORANGE", 180);

		file = file2.readLine();

		board1[17] = new CommunityChest(file);

		file = file2.readLine();

		board1[18] = new Property(file, "ORANGE", 180);

		file = file2.readLine();

		board1[19] = new Property(file, "ORANGE", 200);

		file = file2.readLine();

		board1[20] = new FreeParking(file);

		file = file2.readLine();

		board1[21] = new Property(file, "RED", 220);

		file = file2.readLine();

		board1[22] = new CommunityChest(file);

		file = file2.readLine();

		board1[23] = new Property(file, "RED", 220);

		file = file2.readLine();

		board1[24] = new Property(file, "RED", 240);

		file = file2.readLine();

		board1[25] = new Railroad(file, "GRAY", 200);

		file = file2.readLine();

		board1[26] = new Property(file, "YELLOW", 260);

		file = file2.readLine();

		board1[27] = new Property(file, "YELLOW", 260);

		file = file2.readLine();

		board1[28] = new Utility(file, "WHITE", 150);

		file = file2.readLine();

		board1[29] = new Property(file, "YELLOW", 280);

		file = file2.readLine();

		board1[30] = new Dungeon(file);

		file = file2.readLine();

		board1[31] = new Property(file, "GREEN", 300);

		file = file2.readLine();

		board1[32] = new Property(file, "GREEN", 300);

		file = file2.readLine();

		board1[33] = new CommunityChest(file);

		file = file2.readLine();

		board1[34] = new Property(file, "GREEN", 320);

		file = file2.readLine();

		board1[35] = new Utility(file, "WHITE", 200);

		file = file2.readLine();

		board1[36] = new CommunityChest(file);

		file = file2.readLine();

		board1[37] = new Property(file, "DARK BLUE", 350);

		file = file2.readLine();

		board1[38] = new Tax(file);

		file = file2.readLine();

		board1[39] = new Property(file, "DARK BLUE", 400);

		file = file2.readLine();

		file2.close();

		for(int i = 0; i < board1.length; i++)

		{

			System.out.print(board1[i].name + " ");

			System.out.print(board1[i].color + " ");

			System.out.println(board1[i].price);

			

		}

	}

	else if(choice == 2) 

	{

		//board1 = new Tile[40];

		board1[0] = new Go("GO");

		board1[1] = new Property("AURORA'S COTTAGE", "PURPLE", 60);

		board1[2] = new CommunityChest("COMMUNITY CHEST");

		board1[3] = new Property("SLEEPING BEAUTY'S CASTLE", "PURPLE", 60);

		board1[4] = new Tax("INCOME TAX");

		board1[5] = new Railroad("HOME ON THE RANGE RAILROAD", "GRAY", 200);

		board1[6] = new Property("SHADOWLAND", "LIGHT BLUE", 100);

		board1[7] = new CommunityChest("COMMUNITY CHEST");

		board1[8] = new Property("HAKUNA MATATA FALLS", "LIGHT BLUE", 100);

		board1[9] = new Property("PRIDE ROCK", "LIGHT BLUE", 120);

		board1[10] = new Dungeon("IN THE DUNGEON (JUST VISITING");

		board1[11] = new Property("THE SNUGGLY DUCKLING", "PINK", 140);

		board1[12] = new Utility("ELECTRIC COMPANY", "WHITE", 150);

		board1[13] = new Property("RAPUNZEL'S CASTLE", "PINK", 140);

		board1[14] = new Property("CORONA CASTLE", "PINK", 160);

		board1[15] = new Railroad("FOX AND THE HOUND RAILROAD", "GRAY", 200);

		board1[16] = new Property("THE BOG", "ORANGE", 180);

		board1[17] = new CommunityChest("COMMUNITY CHEST");

		board1[18] = new Property("THE FERRY", "ORANGE", 180);

		board1[19] = new Property("TIANA'S PLACE", "ORANGE", 200);

		board1[20] = new FreeParking("FREE PARKING");

		board1[21] = new Property("THE JUNGLE", "RED", 220);

		board1[22] = new CommunityChest("COMMUNITY CHEST");

		board1[23] = new Property("PACHA'S VILLAGE", "RED", 220);

		board1[24] = new Property("KUZCO'S PALACE", "RED", 240);

		board1[25] = new Railroad("ARISTOCATS RAILROAD", "GRAY", 200);

		board1[26] = new Property("BELLE'S VILLAGE", "YELLOW", 260);

		board1[27] = new Property("WOLVES' WOODS", "YELLOW", 260);

		board1[28] = new Utility("WATER WORKS", "WHITE", 150);

		board1[29] = new Property("THE BEAST'S CASTLE", "YELLOW", 280);

		board1[30] = new Dungeon("GO TO THE DUNGEON");

		board1[31] = new Property("URSULA'S LAIR", "GREEN", 300);

		board1[32] = new Property("ERIC'S SHIP", "GREEN", 300);

		board1[33] = new CommunityChest("COMMUNITY CHEST");

		board1[34] = new Property("TRITON'S KINGDOM", "GREEN", 320);

		board1[35] = new Utility("SHORT LINE", "WHITE", 200);

		board1[36] = new CommunityChest("COMMUNITY CHEST");

		board1[37] = new Property("CITY OF THEBES", "DARK BLUE", 350);

		board1[38] = new Tax("LUXURY TAX");

		board1[39] = new Property("MOUNT OLYMPUS", "DARK BLUE", 400);

	}

	}
}
