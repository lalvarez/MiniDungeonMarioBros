import minidungeon.MiniDungeonGUI;

public class Player {
	
	
	
	private int strength;
	private int foodOfThePlayer;
	private int health;
	private int perception;
	private int maxHealth;
	private boolean alive;
	private int actualPositionX;
	private int actualPositionY;
	private int goldOfThePlayer;
	
	//PLayer constructor
	public Player(int strength, int foodOfThePlayer ,int health, int perception, int maxHealth, boolean alive, int actualPositioX, int actualPositionY, int goldOfThePlayer) {
		this.strength = strength;
		this.foodOfThePlayer = foodOfThePlayer;
		this.health = health;
		this.perception = perception;
		this.maxHealth = maxHealth;
		this.alive = alive;
		this.actualPositionX = actualPositionX;
		this.actualPositionY = actualPositionY;
		this.goldOfThePlayer =goldOfThePlayer;
		
		
	}

	public int getActualPositionX() {
		return actualPositionX;
	}
	
	
	
	public int getActualPositionY() {
		return actualPositionY;
	}
	
	
	
	public void setActualPositionY( int actualPositionY) {
		this.actualPositionY = actualPositionY;
	}
	
	
	public void setActualPositionX( int actualPositionX) {
		this.actualPositionX = actualPositionX;
	}
	
	
	public boolean checkLife(){
	return this.getAlive();
	}
	

	public boolean getAlive() {
		return alive;
	}
	
	
	
	
	
	
//Methods about the food 
public int getFoodOfThePlayer() {
	return foodOfThePlayer;
}

public void setFoodOfThePlayer(int foodOfThePlayer) {
	this.foodOfThePlayer = foodOfThePlayer;
}
public int foodOfthePlayer() {
	int food = this.getFoodOfThePlayer();
	food--;
	this.setFoodOfThePlayer(food);
	return food;
}



public void testBox(MiniDungeonGUI gui, Box floor1Map[][], int x1, int y1, Player player){
	if(floor1Map[x1][y1].getGold() == true){
		   int id = floor1Map[x1][y1].getId();
		   player.goldOfThePlayer++;
		   gui.md_setTextGold(player.goldOfThePlayer);
		   gui.md_setSpriteVisible(id, false);
		   floor1Map[x1][y1].setGold(false);
	}
	if(floor1Map[x1][y1].getPotion() == true){
		   int id = floor1Map[x1][y1].getId();
		   player.health++;
		   gui.md_setTextHealthCurrent(player.health);
		   gui.md_setSpriteVisible(id, false);
		   floor1Map[x1][y1].setPotion(false);
	}
	
	if(floor1Map[x1][y1].getApples() == true){
		   int id = floor1Map[x1][y1].getId();
		   int aux = (int) (Math.random()*(10-5)+5);
		   player.foodOfThePlayer = player.foodOfThePlayer + aux;
		   gui.md_setTextFood(player.foodOfThePlayer);
		   gui.md_setSpriteVisible(id, false);
		   floor1Map[x1][y1].setApples(false);
	}
	
	if(floor1Map[x1][y1].getHearts() == true){
		   int id = floor1Map[x1][y1].getId();
		   player.maxHealth = player.maxHealth + 10;
		   gui.md_setTextHealthMax(player.maxHealth);
		   gui.md_setSpriteVisible(id, false);
		   floor1Map[x1][y1].setHearts(false);
	}
	
	if(floor1Map[x1][y1].getSword() == true){
		   int id = floor1Map[x1][y1].getId();
		   player.strength ++;
		   gui.md_setTextStrength(player.strength);
		   gui.md_setSpriteVisible(id, false);
		   floor1Map[x1][y1].setSword(false);
	}
	
	if(floor1Map[x1][y1].getEyes() == true){
		   int id = floor1Map[x1][y1].getId();
		   player.perception ++;
		   gui.md_setTextPerception(player.perception);
		   gui.md_setSpriteVisible(id, false);
		   floor1Map[x1][y1].setEyes(false);
	}
	
}
}

