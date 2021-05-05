import java.util.*;

public class Shop {
	
	protected int gold = 500;
	
	public void greeting() {
		System.out.println("Welcome to my shop stranger!");
	}
	
	public void actionChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to see my wares?");
		String answer = sc.nextLine();
		
		if (answer.equals("yes")) {
			displayShop();
		}
	}
	
	public void displayShop() {
		
	}
	
	

}
