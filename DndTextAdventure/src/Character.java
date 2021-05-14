
public class Character {

	
	protected String name;
	protected int health, ac;
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
		strength = 17;
		dexterity = 13;
		intelligence = 8;
		constitution = 16;
		wisdom = 8;
		charisma = 11;
		health = 14;
		ac = 10;
		gold = 50;

	}

	public void setArcher() {
		strength = 13;
		dexterity = 19;
		intelligence = 16;
		constitution = 8;
		wisdom = 12;
		charisma = 11;
		health = 8;
		ac = 8;
		gold = 75;
	}

	public void setWizard() {
		strength = 12;
		dexterity = 9;
		intelligence = 17;
		constitution = 16;
		wisdom = 12;
		charisma = 6;
		health = 9;
		ac = 7;
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
