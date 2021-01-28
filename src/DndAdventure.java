import java.util.Scanner;

public class DndAdventure {

	public static void main(String[] args) {

		int[] stats = new int[6];

		int strength = 0, dexterity = 0, intelligence = 0, constitution = 0, wisdom = 0, charisma = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Please name your character: ");
		String charName = scan.nextLine();

		System.out.println("Welcome to the mystical world of Reynar, " + charName + ".");

		System.out.println("Please choose your class from the options below.");

		System.out.println("Type 1 for barbarian, 2 for archer, or 3 for wizard");
		int startingClass = scan.nextInt();

		if (startingClass == 1) {
			strength = 15;
			dexterity = 9;
			intelligence = 5;
			constitution = 8;
			wisdom = 5;
			charisma = 12;
			
		} else if (startingClass == 2) {
			strength = 8;
			dexterity = 18;
			intelligence = 10;
			constitution = 5;
			wisdom = 7;
			charisma = 6;	
		}

		else if (startingClass == 3) {
			strength = 5;
			dexterity = 6;
			intelligence = 17;
			constitution = 5;
			wisdom = 7;
			charisma = 6;
			
		}

		else {
			System.out.println("Error");

		}
		
		
		

		
		
		stats[0] = strength;
		stats[1] = dexterity;
		stats[2] = intelligence;
		stats[3] = constitution;
		stats[4] = wisdom;
		stats[5] = charisma;
		
		
		bar(stats);

	}

	public static void bar(int [] restat) {
		

		Scanner scan2 = new Scanner(System.in);

		System.out.println("Would you like to see your stats?");
		String seeStats = scan2.nextLine();

		if (seeStats.contains("yes")) {
			for (int i = 0; i < restat.length; i++) {
				System.out.println(restat[i]);
				
			}
			
			System.out.println("The order is str, dex, int, const, wisdom, charisma.");

		}
		
		else {
			System.out.println("ok");
		}

	}

}
