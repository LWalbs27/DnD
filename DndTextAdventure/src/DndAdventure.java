import java.util.Scanner;

public class DndAdventure {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean keepGoing = true;

		System.out.print("Please name your character: ");
		Character hero = new Character();

		String charName = scan.nextLine();
		hero.setCharName(charName);

		System.out.println("Welcome to the mystical world of Reynar, " + hero.getCharName() + ".");

		System.out.println("Please choose your class from the options below.");
		chooseAClass(hero);

		System.out.println("Would you like to see your stats?");
		String seeStats = scan.nextLine();
		if (seeStats.contains("yes")) {
			hero.seeStats();
		} else {
			System.out.println("Alright then... Dick");
		}
	}

	public static Character chooseAClass(Character hero) {
		Scanner scan = new Scanner(System.in);
		boolean keepGoing = true;

		while (keepGoing) {
			System.out.println("Type 1 for barbarian, 2 for archer, or 3 for wizard");
			int startingClass = scan.nextInt();
			scan.nextLine();
			if (startingClass == 1) {
				hero.setBarbarian();
				keepGoing = false;
				return hero;
			} else if (startingClass == 2) {
				hero.setArcher();
				keepGoing = false;
				return hero;
			} else if (startingClass == 3) {
				hero.setWizard();
				keepGoing = false;
				return hero;
			} else {

			}

		}
		return hero;
	}

	public static void bar(int[] restat) {

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
