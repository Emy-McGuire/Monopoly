import java.util.Scanner;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class MonopolyPlay {

	static JFrame frame = new JFrame();

	static void locationPics() {

		switch (players.index) {
		case 1: {
			ImageIcon cottage = new ImageIcon(("cottage.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on AURORA'S COTTAGE", null,
					JOptionPane.QUESTION_MESSAGE, cottage);
			MonopolyBank.landOnProperty();
			break;
		}
		case 2: {
			ImageIcon CommunityChest1 = new ImageIcon(("CommunityChest1.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on COMMUNITY CHEST TILE", null,
					JOptionPane.QUESTION_MESSAGE, CommunityChest1);
			break;
		}
		case 3: {
			ImageIcon sleepingBeautysCastle = new ImageIcon(("sleepingBeautysCastle.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on SLEEPING BEAUTY'S CASTLE", null,
					JOptionPane.QUESTION_MESSAGE, sleepingBeautysCastle);
			MonopolyBank.landOnProperty();
			break;
		}
		case 4: {
			ImageIcon TaxPic = new ImageIcon(("TaxPic.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on the TAX TILE, time to pay up", null,
					JOptionPane.QUESTION_MESSAGE, TaxPic);
			break;
		}
		case 5: {
			ImageIcon HomeOnTheRangeRailroad = new ImageIcon(("HomeOnTheRangeRailroad.gif"));
			JOptionPane.showMessageDialog(frame, "You have landed on HOME ON THE RANGE RAILROAD", null,
					JOptionPane.QUESTION_MESSAGE, HomeOnTheRangeRailroad);
			MonopolyBank.landOnRailroad();
			break;
		}
		case 6: {
			ImageIcon badlands = new ImageIcon(("badlands.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on THE BADLANDS", null, JOptionPane.QUESTION_MESSAGE,
					badlands);
			MonopolyBank.landOnProperty();
			break;
		}
		case 7: {
			ImageIcon CommunityChest2 = new ImageIcon(("CommunityChest2.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on a COMMUNITY CHEST TILE", null,
					JOptionPane.QUESTION_MESSAGE, CommunityChest2);
			break;
		}
		case 8: {
			ImageIcon falls = new ImageIcon(("falls.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on HAKUNA MATATA FALLS", null,
					JOptionPane.QUESTION_MESSAGE, falls);
			MonopolyBank.landOnProperty();
			break;
		}
		case 9: {
			ImageIcon prideRock = new ImageIcon(("prideRock.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on PRIDE ROCK", null, JOptionPane.QUESTION_MESSAGE,
					prideRock);
			MonopolyBank.landOnProperty();
			break;
		}
		case 10: {
			ImageIcon VisitingPic = new ImageIcon(("VisitingPic.jpg"));
			JOptionPane.showMessageDialog(frame, "You have to go to jail for a VISIT", null,
					JOptionPane.QUESTION_MESSAGE, VisitingPic);
			ImageIcon dungeon = new ImageIcon(("dungeon.jpg"));
			JOptionPane.showMessageDialog(frame, "Welcome to the DUNGEON", null, JOptionPane.QUESTION_MESSAGE, dungeon);

			MonopolyBank.visitingDungeon();
			break;
		}
		case 11: {
			ImageIcon snugglyDuckling = new ImageIcon(("snugglyDuckling.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on THE SNUGGLY DUCKLING", null,
					JOptionPane.QUESTION_MESSAGE, snugglyDuckling);
			MonopolyBank.landOnProperty();
			break;
		}
		case 12: {
			MonopolyBank.landOnUtility();
			break;
		}
		case 13: {
			ImageIcon tower = new ImageIcon(("tower.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on RAPUNZEL'S TOWER", null,
					JOptionPane.QUESTION_MESSAGE, tower);
			MonopolyBank.landOnProperty();
			break;
		}
		case 14: {
			ImageIcon corona = new ImageIcon(("corona.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on CORONA CASTLE", null, JOptionPane.QUESTION_MESSAGE,
					corona);
			MonopolyBank.landOnProperty();
			break;
		}
		case 15: {
			ImageIcon FoxAndTheHoundRailroad = new ImageIcon(("FoxAndTheHoundRailroad.gif"));
			JOptionPane.showMessageDialog(frame, "You have landed on THE FOX AND THE HOUND RAILROAD", null,
					JOptionPane.QUESTION_MESSAGE, FoxAndTheHoundRailroad);
			MonopolyBank.landOnRailroad();
			break;
		}
		case 16: {
			ImageIcon bog = new ImageIcon(("bog.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on THE BOG", null, JOptionPane.QUESTION_MESSAGE, bog);
			MonopolyBank.landOnProperty();
			break;
		}
		case 17: {
			ImageIcon CommunityChest3 = new ImageIcon(("CommunityChest3.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on a COMMUNITY CHEST TILE", null,
					JOptionPane.QUESTION_MESSAGE, CommunityChest3);
			break;
		}
		case 18: {
			ImageIcon ferry = new ImageIcon(("ferry.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on THE FERRY", null, JOptionPane.QUESTION_MESSAGE,
					ferry);
			MonopolyBank.landOnProperty();
			break;
		}
		case 19: {
			ImageIcon tiana = new ImageIcon(("tiana.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on TIANA'S PLACE", null, JOptionPane.QUESTION_MESSAGE,
					tiana);
			MonopolyBank.landOnProperty();
			break;
		}
		case 20: {
			MonopolyCardsandDice.landOnFreeParking();
			break;
		}
		case 21: {
			ImageIcon jungle = new ImageIcon(("jungle.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on THE JUNGLE", null, JOptionPane.QUESTION_MESSAGE,
					jungle);
			MonopolyBank.landOnProperty();
			break;
		}
		case 22: {
			ImageIcon CommunityChest4 = new ImageIcon(("CommunityChest4.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on a COMMUNITY CHEST TILE", null,
					JOptionPane.QUESTION_MESSAGE, CommunityChest4);
			break;
		}
		case 23: {
			ImageIcon pacha = new ImageIcon(("pacha.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on PACHA'S VILLAGE", null,
					JOptionPane.QUESTION_MESSAGE, pacha);
			MonopolyBank.landOnProperty();
			break;
		}
		case 24: {
			ImageIcon kuzco = new ImageIcon(("kuzco.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on KUZCO'S PALACE", null,
					JOptionPane.QUESTION_MESSAGE, kuzco);
			MonopolyBank.landOnProperty();
			break;
		}
		case 25: {
			ImageIcon AristocatsRailroad = new ImageIcon(("AristocatsRailroad.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on the ARISTOCATS RAILROAD", null,
					JOptionPane.QUESTION_MESSAGE, AristocatsRailroad);
			MonopolyBank.landOnRailroad();
			break;
		}
		case 26: {
			ImageIcon belleVillage = new ImageIcon(("belleVillage.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on BELLE'S VILLAGE", null,
					JOptionPane.QUESTION_MESSAGE, belleVillage);
			MonopolyBank.landOnProperty();
			break;
		}
		case 27: {
			ImageIcon woods = new ImageIcon(("woods.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on WOLVES' WOODS", null, JOptionPane.QUESTION_MESSAGE,
					woods);
			MonopolyBank.landOnProperty();
			break;
		}
		case 28: {
			MonopolyBank.landOnUtility();
			break;
		}
		case 29: {
			ImageIcon beast = new ImageIcon(("beast.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on THE BEAST'S CASTLE", null,
					JOptionPane.QUESTION_MESSAGE, beast);
			MonopolyBank.landOnProperty();
			break;
		}
		case 30: {
			ImageIcon DungeonGif = new ImageIcon(("DungeonGif.gif"));
			JOptionPane.showMessageDialog(frame, "You have landed in the DUNGEON", null, JOptionPane.QUESTION_MESSAGE,
					DungeonGif);

			ImageIcon dungeon = new ImageIcon(("dungeon.jpg"));
			JOptionPane.showMessageDialog(frame, "Welcome to the DUNGEON", null, JOptionPane.QUESTION_MESSAGE, dungeon);

			MonopolyBank.inDungeon();
			break;
		}
		case 31: {
			ImageIcon lair = new ImageIcon(("lair.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on URSULA'S LAIR", null, JOptionPane.QUESTION_MESSAGE,
					lair);
			MonopolyBank.landOnProperty();
			break;
		}
		case 32: {
			ImageIcon ship = new ImageIcon(("ship.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on ERIC'S SHIP", null, JOptionPane.QUESTION_MESSAGE,
					ship);
			MonopolyBank.landOnProperty();
			break;
		}
		case 33: {
			ImageIcon CommunityChest5 = new ImageIcon(("CommunityChest5.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on a COMMUNITY CHEST TILE", null,
					JOptionPane.QUESTION_MESSAGE, CommunityChest5);
			break;
		}
		case 34: {
			ImageIcon tritonKingom = new ImageIcon(("tritonKingom.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on TRITON'S KINGDOM", null,
					JOptionPane.QUESTION_MESSAGE, tritonKingom);
			MonopolyBank.landOnProperty();
			break;
		}
		case 35: {
			MonopolyBank.landOnUtility();

			break;
		}
		case 36: {
			ImageIcon CommunityChest6 = new ImageIcon(("CommunityChest6.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on a COMMUNITY CHEST TILE", null,
					JOptionPane.QUESTION_MESSAGE, CommunityChest6);
			break;
		}
		case 37: {
			ImageIcon thebes = new ImageIcon(("thebes.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on THEBES", null, JOptionPane.QUESTION_MESSAGE,
					thebes);
			MonopolyBank.landOnProperty();
			break;
		}
		case 38: {
			ImageIcon TaxPic2 = new ImageIcon(("TaxPic2.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on AURORA'S COTTAGE", null,
					JOptionPane.QUESTION_MESSAGE, TaxPic2);
			break;
		}
		case 39: {
			ImageIcon olympus = new ImageIcon(("olympus.jpg"));
			JOptionPane.showMessageDialog(frame, "You have landed on OLYMPUS", null, JOptionPane.QUESTION_MESSAGE,
					olympus);
			MonopolyBank.landOnProperty();
			break;
		}

		}

		/*
		 * if (players.index == 0) {
		 * 
		 * } if (players.index == 1) { ImageIcon cottage = new
		 * ImageIcon(("cottage.jpg")); JOptionPane.showMessageDialog(frame,
		 * "You have landed on AURORA'S COTTAGE", null, JOptionPane.QUESTION_MESSAGE,
		 * cottage); MonopolyBank.landOnProperty(); } if (players.index == 2) {
		 * ImageIcon CommunityChest1 = new ImageIcon(("CommunityChest1.jpg"));
		 * JOptionPane.showMessageDialog(frame,
		 * "You have landed on a COMMUNITY CHEST TILE", null,
		 * JOptionPane.QUESTION_MESSAGE, CommunityChest1);
		 * 
		 * } if (players.index == 3) { ImageIcon sleepingBeautysCastle = new
		 * ImageIcon(("sleepingBeautysCastle.jpg"));
		 * JOptionPane.showMessageDialog(frame,
		 * "You have landed on SLEEPING BEAUTY CASTLE", null,
		 * JOptionPane.QUESTION_MESSAGE, sleepingBeautysCastle);
		 * MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 4) { ImageIcon TaxPic = new ImageIcon(("TaxPic.jpg"));
		 * JOptionPane.showMessageDialog(frame,
		 * "You have landed on a TAX TILE, time to pay up", null,
		 * JOptionPane.QUESTION_MESSAGE, TaxPic);
		 * 
		 * } if (players.index == 5) { ImageIcon HomeOnTheRangeRailroad = new
		 * ImageIcon(("HomeOnTheRangeRailroad.gif"));
		 * JOptionPane.showMessageDialog(frame,
		 * "You have landed on the HOME ON THE RANGE RAILROAD", null,
		 * JOptionPane.QUESTION_MESSAGE, HomeOnTheRangeRailroad);
		 * MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 6) { ImageIcon badlands = new
		 * ImageIcon(("badlands.jpg")); JOptionPane.showMessageDialog(frame,
		 * "You have landed on THE BADLANDS", null, JOptionPane.QUESTION_MESSAGE,
		 * badlands); MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 7) { ImageIcon CommunityChest2 = new
		 * ImageIcon(("CommunityChest2.jpg")); JOptionPane.showMessageDialog(frame,
		 * "You have landed on a COMMUNITY CHEST TILE", null,
		 * JOptionPane.QUESTION_MESSAGE, CommunityChest2);
		 * 
		 * } if (players.index == 8) { ImageIcon falls = new ImageIcon(("falls.jpg"));
		 * JOptionPane.showMessageDialog(frame,
		 * "You have landed on HAKUNA MATATA FALLS", null, JOptionPane.QUESTION_MESSAGE,
		 * falls); MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 9) { ImageIcon prideRock = new
		 * ImageIcon(("prideRock.jpg")); JOptionPane.showMessageDialog(frame,
		 * "You have landed on PRIDE ROCK", null, JOptionPane.QUESTION_MESSAGE,
		 * prideRock); MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 10) { ImageIcon VisitingPic = new
		 * ImageIcon(("VisitingPic.jpg")); JOptionPane.showMessageDialog(frame,
		 * "You have to go to jail for a VISIT", null, JOptionPane.QUESTION_MESSAGE,
		 * VisitingPic);
		 * 
		 * ImageIcon dungeon = new ImageIcon(("dungeon.jpg"));
		 * JOptionPane.showMessageDialog(frame, "Welcome to the DUNGEON", null,
		 * JOptionPane.QUESTION_MESSAGE, dungeon);
		 * 
		 * MonopolyBank.visitingDungeon();
		 * 
		 * } if (players.index == 11) { ImageIcon snugglyDuckling = new
		 * ImageIcon(("snugglyDuckling.jpg")); JOptionPane.showMessageDialog(frame,
		 * "You have landed on THE SNUGGLY DUCKLING", null,
		 * JOptionPane.QUESTION_MESSAGE, snugglyDuckling);
		 * MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 12) { System.out.println(players.index);
		 * MonopolyBank.landOnUtility();
		 * 
		 * } if (players.index == 13) { ImageIcon tower = new ImageIcon(("tower.jpg"));
		 * JOptionPane.showMessageDialog(frame, "You have landed on RAPUNZEL'S TOWER",
		 * null, JOptionPane.QUESTION_MESSAGE, tower); MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 14) { ImageIcon corona = new
		 * ImageIcon(("corona.jpg")); JOptionPane.showMessageDialog(frame,
		 * "You have landed on CORONA CASTLE", null, JOptionPane.QUESTION_MESSAGE,
		 * corona); MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 15) { ImageIcon FoxAndTheHoundRailroad = new
		 * ImageIcon(("FoxAndTheHoundRailroad.gif"));
		 * JOptionPane.showMessageDialog(frame,
		 * "You have landed on the FOX AND THE HOUND RAILROAD", null,
		 * JOptionPane.QUESTION_MESSAGE, FoxAndTheHoundRailroad);
		 * MonopolyBank.landOnRailroad();
		 * 
		 * } if (players.index == 16) { ImageIcon bog = new ImageIcon(("bog.jpg"));
		 * JOptionPane.showMessageDialog(frame, "You have landed on THE BOG", null,
		 * JOptionPane.QUESTION_MESSAGE, bog); MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 17) { ImageIcon CommunityChest3 = new
		 * ImageIcon(("CommunityChest3.jpg")); JOptionPane.showMessageDialog(frame,
		 * "You have landed on a COMMUNITY CHEST TILE", null,
		 * JOptionPane.QUESTION_MESSAGE, CommunityChest3); } if (players.index == 18) {
		 * ImageIcon ferry = new ImageIcon(("ferry.jpg"));
		 * JOptionPane.showMessageDialog(frame, "You have landed on THE FERRY", null,
		 * JOptionPane.QUESTION_MESSAGE, ferry); MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 19) { ImageIcon tiana = new ImageIcon(("tiana.jpg"));
		 * JOptionPane.showMessageDialog(frame, "You have landed on TIANA'S PLACE",
		 * null, JOptionPane.QUESTION_MESSAGE, tiana); MonopolyBank.landOnProperty(); }
		 * if (players.index == 20) {
		 * 
		 * } if (players.index == 21) { ImageIcon jungle = new
		 * ImageIcon(("jungle.jpg")); JOptionPane.showMessageDialog(frame,
		 * "You have landed on THE JUNGLE", null, JOptionPane.QUESTION_MESSAGE, jungle);
		 * MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 22) { ImageIcon CommunityChest4 = new
		 * ImageIcon(("CommunityChest4.jpg")); JOptionPane.showMessageDialog(frame,
		 * "You have landed on a COMMUNITY CHEST TILE", null,
		 * JOptionPane.QUESTION_MESSAGE, CommunityChest4); } if (players.index == 23) {
		 * ImageIcon pacha = new ImageIcon(("pacha.jpg"));
		 * JOptionPane.showMessageDialog(frame, "You have landed on PACHA'S VILLAGE",
		 * null, JOptionPane.QUESTION_MESSAGE, pacha); MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 24) { ImageIcon kuzco = new ImageIcon(("kuzco.jpg"));
		 * JOptionPane.showMessageDialog(frame, "You have landed on KUZCO'S PALACE",
		 * null, JOptionPane.QUESTION_MESSAGE, kuzco); MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 25) { ImageIcon AristocatsRailroad = new
		 * ImageIcon(("AristocatsRailroad.gif")); JOptionPane.showMessageDialog(frame,
		 * "You have landed on the ARISTOCATS' RAILRAOD", null,
		 * JOptionPane.QUESTION_MESSAGE, AristocatsRailroad);
		 * MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 26) { ImageIcon belleVillage = new
		 * ImageIcon(("belleVillage.jpg")); JOptionPane.showMessageDialog(frame,
		 * "You have landed on BELLE'S VILLAGE", null, JOptionPane.QUESTION_MESSAGE,
		 * belleVillage); MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 27) { ImageIcon woods = new ImageIcon(("woods.jpg"));
		 * JOptionPane.showMessageDialog(frame, "You have landed on WOLVES' WOODS",
		 * null, JOptionPane.QUESTION_MESSAGE, woods); MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 28) { MonopolyBank.landOnUtility();
		 * 
		 * } if (players.index == 29) { ImageIcon beast = new ImageIcon(("beast.jpg"));
		 * JOptionPane.showMessageDialog(frame, "You have landed on THE BEAST'S CASTLE",
		 * null, JOptionPane.QUESTION_MESSAGE, beast); MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 30) { ImageIcon DungeonGif = new
		 * ImageIcon(("DungeonGif.gif")); JOptionPane.showMessageDialog(frame,
		 * "You have landed in the DUNGEON", null, JOptionPane.QUESTION_MESSAGE,
		 * DungeonGif);
		 * 
		 * ImageIcon dungeon = new ImageIcon(("dungeon.jpg"));
		 * JOptionPane.showMessageDialog(frame, "Welcome to the DUNGEON", null,
		 * JOptionPane.QUESTION_MESSAGE, dungeon);
		 * 
		 * MonopolyBank.inDungeon(); } if (players.index == 31) { ImageIcon lair = new
		 * ImageIcon(("lair.jpg")); JOptionPane.showMessageDialog(frame,
		 * "You have landed on URSULA'S LAIR", null, JOptionPane.QUESTION_MESSAGE,
		 * lair); MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 32) { ImageIcon ship = new ImageIcon(("ship.jpg"));
		 * JOptionPane.showMessageDialog(frame, "You have landed on ERIC'S SHIP", null,
		 * JOptionPane.QUESTION_MESSAGE, ship); MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 33) { ImageIcon CommunityChest5 = new
		 * ImageIcon(("CommunityChest5.jpg")); JOptionPane.showMessageDialog(frame,
		 * "You have landed on a COMMUNITY CHEST TILE", null,
		 * JOptionPane.QUESTION_MESSAGE, CommunityChest5); } if (players.index == 34) {
		 * ImageIcon tritonKingdom = new ImageIcon(("tritonKingdom.jpg"));
		 * JOptionPane.showMessageDialog(frame, "You have landed on TRITON'S KINGDOM",
		 * null, JOptionPane.QUESTION_MESSAGE, tritonKingdom);
		 * MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 35) { MonopolyBank.landOnUtility();
		 * 
		 * } if (players.index == 36) { ImageIcon CommunityChest6 = new
		 * ImageIcon(("CommunityChest6.jpg")); JOptionPane.showMessageDialog(frame,
		 * "You have landed on a COMMUNITY CHEST TILE", null,
		 * JOptionPane.QUESTION_MESSAGE, CommunityChest6);
		 * 
		 * } if (players.index == 37) { ImageIcon thebes = new
		 * ImageIcon(("thebes.jpg")); JOptionPane.showMessageDialog(frame,
		 * "You have landed on THEBES", null, JOptionPane.QUESTION_MESSAGE, thebes);
		 * MonopolyBank.landOnProperty();
		 * 
		 * } if (players.index == 38) { ImageIcon TaxPic2 = new
		 * ImageIcon(("TaxPic2.jpg")); JOptionPane.showMessageDialog(frame,
		 * "You have landed on a TAX TILE, hehe more money to the bank", null,
		 * JOptionPane.QUESTION_MESSAGE, TaxPic2); } if (players.index == 39) {
		 * ImageIcon olympus = new ImageIcon(("olympus.jpg"));
		 * JOptionPane.showMessageDialog(frame, "You have landed on OLYMUS", null,
		 * JOptionPane.QUESTION_MESSAGE, olympus); MonopolyBank.landOnProperty();
		 * 
		 * }
		 */

	}
}