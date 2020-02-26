import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DisneyArrayList {

	// static ArrayList<DisneyTile> disneyNames = new ArrayList<DisneyTile>();
	// static Scanner s = new Scanner(new File("OrigionalMonopolyBoard"));
	// static ArrayList<OriginalTile> origional = Arraylist<OriginalTile>();
	public static void Boards() throws FileNotFoundException {

		System.out.println("Please pick a Board that you want to play");

		System.out.println("please press 1 for Original or 2 for Disney theme");

		Scanner userInput = new Scanner(System.in);

		int choice = userInput.nextInt();
		Scanner s = new Scanner(new File("OrigionalMonopolyBoard"));

		ArrayList<OriginalTile> origionalTiles = new ArrayList<OriginalTile>();
		while (s.hasNextLine()) {

			// origionalTiles.add(s.next());
			String toInput = s.nextLine();
			origionalTiles.add(new OriginalTile(toInput));

		}
		s.close();
		/*
		 * for( OriginalTile o : origionalTiles) { System.out.println(o.getName()); }
		 */

		System.out.println(" ");
		Scanner d = new Scanner(new File("DisneyTheme"));
		ArrayList<DisneyTile> disneyTiles = new ArrayList<DisneyTile>();
		while (d.hasNextLine()) {

			// origionalTiles.add(s.next());
			String toInput2 = d.nextLine();
			disneyTiles.add(new DisneyTile(toInput2));

		}
		d.close();
		/*
		 * for( DisneyTile d1 :disneyTiles) { System.out.println(d1.getName()); }
		 */
		if (choice == 1) {
			for (OriginalTile o : origionalTiles) {
				System.out.println(o.getName());
			}
		} else if (choice == 2) {
			for (DisneyTile d1 : disneyTiles) {
				System.out.println(d1.getName());
			}
		}

		/*
		 * disneyNames.add(new DisneyTile("GO")); disneyNames.add(new
		 * DisneyTile("AURORA'S COTTAGE")); disneyNames.add(new
		 * DisneyTile("COMMUNITY CHEST")); disneyNames.add(new
		 * DisneyTile("SLEEPING BEAUTY'S CASTLE")); disneyNames.add(new
		 * DisneyTile("INCOME TAX")); disneyNames.add(new
		 * DisneyTile("HOME ON THE RANGE RAILROAD")); disneyNames.add(new
		 * DisneyTile("THE BADLANDS")); disneyNames.add(new
		 * DisneyTile("COMMUNITY CHEST")); disneyNames.add(new
		 * DisneyTile("HAKUNA MATATA FALLS")); disneyNames.add(new
		 * DisneyTile("PRIDE ROCK")); disneyNames.add(new
		 * DisneyTile("IN THE DUNGEON (VISITING)")); disneyNames.add(new
		 * DisneyTile("THE SNUGGLY DUCKLING")); disneyNames.add(new
		 * DisneyTile("ELECTRIC COMPANY")); disneyNames.add(new
		 * DisneyTile("RAPUNZEL'S CASTLE")); disneyNames.add(new
		 * DisneyTile("CORONA CASTLE")); disneyNames.add(new
		 * DisneyTile("FOX AND THE HOUND RAILROAD")); disneyNames.add(new
		 * DisneyTile("THE BOG")); disneyNames.add(new DisneyTile("COMMUNITY CHEST"));
		 * disneyNames.add(new DisneyTile("THE FERRY")); disneyNames.add(new
		 * DisneyTile("TIANA'S PLACE")); disneyNames.add(new
		 * DisneyTile("FREE PARKING")); disneyNames.add(new DisneyTile("THE JUNGLE"));
		 * disneyNames.add(new DisneyTile("COMMUNITY CHEST")); disneyNames.add(new
		 * DisneyTile("PACHA'S VILLAGE")); disneyNames.add(new
		 * DisneyTile("KUZCO'S PALACE")); disneyNames.add(new
		 * DisneyTile("ARISTOCATS RAILROAD")); disneyNames.add(new
		 * DisneyTile("BELLE'S VILLAGE")); disneyNames.add(new
		 * DisneyTile("WOLVES' WOODS")); disneyNames.add(new DisneyTile("WATER WORKS"));
		 * disneyNames.add(new DisneyTile("THE BEAST'S CASTLE")); disneyNames.add(new
		 * DisneyTile("GO TO THE DUNGEON")); disneyNames.add(new
		 * DisneyTile("URSULA'S LAIR")); disneyNames.add(new DisneyTile("ERIC'S SHIP"));
		 * disneyNames.add(new DisneyTile("COMMUNITY CHEST")); disneyNames.add(new
		 * DisneyTile("TRITON'S KINGDOM")); disneyNames.add(new
		 * DisneyTile("SHORT LINE")); disneyNames.add(new
		 * DisneyTile("COMMUNITY CHEST")); disneyNames.add(new
		 * DisneyTile("CITY OF THEBES")); disneyNames.add(new DisneyTile("LUXURY TAX"));
		 * disneyNames.add(new DisneyTile("MT. OLYMPUS"));
		 */

	}

}