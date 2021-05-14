import java.util.*;
public class DiceRolls {

	public int d4Roll() {
		Random rand = new Random();
		int d4Roll = rand.nextInt(4);
		d4Roll++;
		return d4Roll;
	}
	
	public int d6Roll() {
		Random rand = new Random();
		int d6Roll = rand.nextInt(6);
		d6Roll++;
		return d6Roll;
	}
	
	public int d8Roll() {
		Random rand = new Random();
		int d8Roll = rand.nextInt(8);
		d8Roll++;
		return d8Roll;
	}
	
	public int d10Roll() {
		Random rand = new Random();
		int d10Roll = rand.nextInt(10);
		d10Roll++;
		return d10Roll;
	}
	
	public int d12Roll() {
		Random rand = new Random();
		int d12Roll = rand.nextInt(12);
		d12Roll++;
		return d12Roll;
	}
	
	public int d20Roll() {
		Random rand = new Random();
		int d20Roll = rand.nextInt(20);
		d20Roll++;
		return d20Roll;
	}
	
}
