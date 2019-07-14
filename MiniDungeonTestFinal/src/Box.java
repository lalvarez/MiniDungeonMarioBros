import minidungeon.MiniDungeonGUI;

public class Box {


    
	//Atributes of Box
	public boolean puerta;
	
	private int positionX;
	private int positionY;

	private boolean trap;
	private boolean scape;
	
	private boolean walk;
	
	private boolean apples;
	private boolean gold;
	private boolean potion;
	private boolean hearts;
	private boolean eyes;
	private boolean sword;
	
	private boolean free;//Casilla ocupada por objeto
	
	String tipo;
	
	private boolean enemies;
	
	private int id;

	// Constructor for a box
	public Box(int positionX, int positionY,boolean walk, boolean trap, boolean scape,
			boolean food, boolean gold, boolean potion, boolean hearts, boolean eyes, boolean sword, boolean enemies, boolean free, int id) {
		this.positionX = positionX;
		this.positionY = positionY;
		this.walk = walk;
		this.trap = trap;
		this.scape = scape;
		this.apples = food;
		this.gold = gold;
		this.potion = potion;
		this.hearts = hearts;
		this.eyes = eyes;
		this.sword = sword;
		this.enemies = enemies;
		this.free = free;
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean getWalk() {
		return walk;
	}

	public void setWalk(boolean walk) {
		this.walk = walk;
	}
	
	public void setEnemies(boolean enemies) {
		this.enemies = enemies;
	}

	public boolean getEnemies() {
		
		return enemies;
	}

	public void setGold(boolean gold) {
		this.gold =gold;
		
	}

	public boolean getGold() {
		return gold;
	}

	public void setEyes(boolean eyes) {
		this.eyes = eyes;
		
	}

	public boolean getEyes() {
		return eyes;
	}

	public void setHearts(boolean hearts) {
		this.hearts =hearts;
		
		
		
	}

	public boolean getHearts() {
		return hearts;
	}

	public void setSword(boolean sword) {
		this.sword = sword;
		
	}

	public void setPotion(boolean potion) {
		this.potion = potion;
		
	}

	public void setApples(boolean apples) {
		this.apples = apples;
		
	}

	public void setFree(boolean free) {
		this.free = free;
		
	}

	public boolean getFree() {
		return free;
	}

	public void setId(int id) {
		this.id = id;
		
	}

	public int getId() {
		return id;
		
	}

	public boolean getPotion() {
		return potion;
	}
	
	public boolean getApples() {
		return apples;
	}
	
	public boolean getSword() {
		return sword;
	}
	
	

}
