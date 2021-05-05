
public class Character {

	
	protected String name;
	protected int health;
	protected int gold;
	protected int strength, dexterity, intelligence, constitution, wisdom, charisma;
	

	public String getCharName() {
		return this.name;
	}
	
	public void setCharName(String charName) {
		this.name = charName;
	}

	public int getStrength() {
		return strength;
	}

	public int getDex() {
		return dexterity;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getConst() {
		return constitution;
	}

	public void setBarbarian() {
		strength = 15;
		dexterity = 9;
		intelligence = 5;
		constitution = 8;
		wisdom = 5;
		charisma = 12;
		health = 20;
		gold = 50;

	}

	public void setArcher() {
		strength = 8;
		dexterity = 18;
		intelligence = 10;
		constitution = 5;
		wisdom = 7;
		charisma = 6;
		health = 16;
		gold = 75;
	}

	public void setWizard() {
		strength = 5;
		dexterity = 6;
		intelligence = 17;
		constitution = 5;
		wisdom = 7;
		charisma = 6;
		health = 12;
		gold = 100;
	}
	public void seeStats() {
	
	System.out.println("Here's how you stack up!");
	System.out.println("Strength: " + this.strength);
	System.out.println("Dexterity: " + this.dexterity);
	System.out.println("Intelligence: " + this.intelligence);
	System.out.println("Constitution: " + this.constitution);
	System.out.println("Wisdom: " + this.wisdom);
	System.out.println("Charisma: " + this.charisma);
	System.out.println("Hit Points: " + this.health + "hp");
	System.out.println("Gold: " + this.gold + " pieces");
	}	

}
