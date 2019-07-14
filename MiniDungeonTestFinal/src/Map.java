import minidungeon.MiniDungeonGUI;

public class Map {
	


	//General map array for each floor
	//static Box floor1Map[][] = new Box[50][50];
	
	//static Map map = new Map(0, 0, 0, 0, 0, 0, 0);
	//Main objects
	private int numberOfEnemies;
	private int numberOfSword;
	private int numberOfHearts;
	private int numberOfEyes;
	private int numberOfPotions;
	private int gold; 
	private int numberOfApples;
	//Maze atributes
	private static int numberOfHallways = (int) Math.random ()*(57-40)+40;
	private int numberOfRooms = (int) Math.random ()*(7-4)+4;
	
	//Map constructor
	public Map (int numberOfEnemies, int numberOfSword,int numberOfHearts, int  numberOfEyes, int numberOfPotions,int gold ,int numberOfApples){
		this.numberOfEnemies = numberOfEnemies;
		this.numberOfSword = numberOfSword;
		this.numberOfHearts = numberOfHearts;
		this.numberOfEyes = numberOfEyes;
		this.numberOfPotions = numberOfPotions;
		this.gold = gold ; 
		this.numberOfApples = numberOfApples;
		
	}
	
	//Objects methods
    public void generateEnemies(MiniDungeonGUI gui, Box[][] floor1Map) throws InterruptedException {
    	//Sprites 1-10 enemies
    	int aux = (int) ( Math.random()*(10-7)+7);
    	this.setNumberOfEnemies(aux);
    	int id =1;
    	for(int i =0; i< this.getNumberOfEnemies(); i++){
    	int a = (int) (Math.random()*(50));
		int b = (int) (Math.random()*(50));
		if(floor1Map[a][b].getWalk() == true){
		floor1Map[a][b].setEnemies(true);
		floor1Map[a][b].setFree(false);
		floor1Map[a][b].setId(id);
		gui.md_addSprite(id, "black-rook.png", true);
		gui.md_moveSprite(id, a, b);
		gui.md_setSpriteVisible(id,true);
		id++;
		
	
    		}
    	}
	}
    
  

	public void generateGold(MiniDungeonGUI gui, Box[][] floor1Map ) {
    	int aux = (int) ( Math.random()*(15-8)+8) ; 
    	this.setGold(aux);
    	int id =20;
    	for(int i =0; i<this.getGold(); i++){
    			int a = (int) (Math.random()*(50));
    			int b = (int) (Math.random()*(50));
    			if (floor1Map[a][b].getFree() == true){
    			if(floor1Map[a][b].getWalk() == true){
    			floor1Map[a][b].setGold(true);
    			floor1Map[a][b].setFree(false);
    			floor1Map[a][b].setId(id);
    			gui.md_addSprite(id,  "gold.png", true);
    			gui.md_moveSprite(id, a, b);
    			gui.md_setSpriteVisible(id,true);

    			id++;
    	    		}
    			
    		}
    	}
	}
	
public void generateEyes(MiniDungeonGUI gui, Box[][] floor1Map) {
    	int aux = 1;
    	this.setNumberOfEyes(aux);
    	int id = 40;
    	for(int i =0; i<this.getNumberOfEyes(); i++){
    			int a = (int) (Math.random()*(50));
    			int b = (int) (Math.random()*(50));
    			if (floor1Map[a][b].getFree() == true){
    			if(floor1Map[a][b].getWalk() == true){
    			floor1Map[a][b].setEyes(true);
    			floor1Map[a][b].setFree(false);
    			floor1Map[a][b].setId(id);
    			gui.md_addSprite(id,  "eye.png", true);
    			gui.md_moveSprite(id, a, b);
    			gui.md_setSpriteVisible(id,true);
    			id++;
    	    		}
    			
    		}
    			}
	}
    
    public void generateHearts(MiniDungeonGUI gui, Box[][] floor1Map) {
    	int aux = (int) ( Math.random()*(6-3)+3);
    	this.setNumberOfHearts(aux);
    	int id =50;
    	for(int i =0; i< this.getNumberOfHearts(); i++){
    			int a = (int) (Math.random()*(50));
    			int b = (int) (Math.random()*(50));
    			if (floor1Map[a][b].getFree() == true){
    			if(floor1Map[a][b].getWalk() == true){
    			floor1Map[a][b].setHearts(true);
    			floor1Map[a][b].setFree(false);
    			floor1Map[a][b].setId(id);
    			gui.md_addSprite(id,  "heart.png", true);
    			gui.md_moveSprite(id, a, b);
    			gui.md_setSpriteVisible(id,true);
    			id++;
    	    		}
    			
    		}
    	}
	}
    
    public void generateSwords(MiniDungeonGUI gui, Box[][] floor1Map) {
    	int aux = 1;
    	this.setNumberOfSword(aux);
    	int id =60;
    	for(int i =0; i< this.getNumberOfSword(); i++){
    			int a = (int) (Math.random()*(50));
    			int b = (int) (Math.random()*(50));
    			if (floor1Map[a][b].getFree() == true){
    			if(floor1Map[a][b].getWalk() == true){
    			floor1Map[a][b].setSword(true);
    			floor1Map[a][b].setFree(false);
    			floor1Map[a][b].setId(id);
    			gui.md_addSprite(id,  "sword.png", true);
    			gui.md_moveSprite(id, a, b);
    			gui.md_setSpriteVisible(id,true);
    			id++;
    	    		}
    			
    		}
    	}
	}
    
    public void generatePotions(MiniDungeonGUI gui,Box[][] floor1Map) {
    	int aux = (int) ( Math.random()*(10-4)+4);
    	this.setNumberOfPotions(aux);
    	int id =70;
    	for(int i =0; i< this.getNumberOfPotions(); i++){
    			int a = (int) (Math.random()*(50));
    			int b = (int) (Math.random()*(50));
    			if (floor1Map[a][b].getFree() == true){
    			if(floor1Map[a][b].getWalk() == true){
    			floor1Map[a][b].setPotion(true);
    			floor1Map[a][b].setFree(false);
    			floor1Map[a][b].setId(id);
    			gui.md_addSprite(id,  "potion.png", true);
    			gui.md_moveSprite(id, a, b);
    			gui.md_setSpriteVisible(id,true);
    			id++;
    	    		}
    			
    		}
    	}
	}
    
    
    public void generateApples(MiniDungeonGUI gui,Box[][] floor1Map) {
    	int aux = (int) ( Math.random()*(13-8)+8);
    	this.setNumberOfApples(aux);
    	int id =90;
    	for(int i =0; i< this.getNumberOfApples(); i++){
    			int a = (int) (Math.random()*(50));
    			int b = (int) (Math.random()*(50));
    			if (floor1Map[a][b].getFree() == true){
    			if(floor1Map[a][b].getWalk() == true){
    			floor1Map[a][b].setApples(true);
    			floor1Map[a][b].setFree(false);
    			floor1Map[a][b].setId(id);
    			gui.md_addSprite(id,  "apple.png", true);
    			gui.md_moveSprite(id, a, b);
    			gui.md_setSpriteVisible(id,true);
    			id++;
    	    		}
    			
    		}
    	}
    			
    	
    			
    			
    }
	
    

    public void enemiesMovement(Box floor1Map[][], MiniDungeonGUI gui ) {
    	for ( int i =0; i<40; i ++){
    		for(int j =0; j<40; j++ ){
    			
    			if(floor1Map[i][j].getEnemies() == true){
    				int id = floor1Map[i][j].getId();
    				gui.md_moveSprite(id, i++, j);
    			    gui.md_setSpriteVisible(id,true);
    				
    				
    				
    			}
    			
    		}
    	}
    	for ( int i =0; i<40; i ++){
    		for(int j =0; j<40; j++ ){
    			
    			if(floor1Map[i][j].getEnemies() == true){
    				int id = floor1Map[i][j].getId();
    				gui.md_moveSprite(id, i--, j);
    			    gui.md_setSpriteVisible(id,true);
    				
    			
    				
    			}
    			
    		}
    	}
    		
    		
    	}
	
/*
	
		x = (int) (Math.random()*(40));
		y = (int) (Math.random()*(40));
		int dimHallway = (int) (Math.random()*(10));
		for(int i=0;i<27;i++){
		int aux = (int) (Math.random()*(4));
		if (aux == 1){
			for(int j=0;j<dimHallway;j++){
				x++;
			floor1Map [x][y].setWalk(true);
			gui.md_setSquareColor(x, y, 1, 1, 1);
			
			
			}
		}
		if (aux == 2){
			for(int j=0;j<dimHallway;j++){
				x--;
			floor1Map [x][y].setWalk(true);
			gui.md_setSquareColor(x, y, 1, 1, 1);
			
			}
		}
		if (aux == 3){
			for(int j=0;j<dimHallway;j++){
				y++;
			floor1Map [x][y].setWalk(true);
			gui.md_setSquareColor(x, y, 1, 1, 1);
			
			}
		}
		if (aux == 1){
			for(int j=0;j<dimHallway;j++){
				y--;
			floor1Map [x][y].setWalk(true);
			gui.md_setSquareColor(x, y, 1, 1, 1);
			
			}
		}
	}
		
	}
	
	*/
	public void positionThePlayer(MiniDungeonGUI gui, Box[][] floor1Map, Player player){
		//The programme put the main player in a random position
		
		int aux=0;
		while(aux==0){
			
			int a =(int) (Math.random()*50);
			int b =(int) (Math.random()*50);
			if (floor1Map[a][b].getWalk()== true){
				gui.md_addSprite(0, "super mario.jpg", true);
				gui.md_moveSprite(0, a, b);
				player.setActualPositionX(a);
				player.setActualPositionY(b);
				
				aux=1;
			}
		}
		//The main player get visible
		gui.md_setSpriteVisible(0, true);
		
	}
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  //Aux get and set methods
	public int getNumberOfEnemies() {
		return numberOfEnemies;
	}
	public int getNumberOfSword() {
			return numberOfSword;
			
		}
	 
	 public int getNumberOfHearts() {
			return numberOfHearts;
			
		}
	 public int getNumberOfEyes() {
			return numberOfEyes;
			
		}
	 public int getNumberOfPotions() {
			return numberOfPotions;
			
		}
	 public int getGold() {
			return gold;
			
		}
	 public int getNumberOfApples() {
			return numberOfApples;
			
		}
		public void setNumberOfEnemies(int numberOfEnemies) {
			this.numberOfEnemies = numberOfEnemies;
		}
		
		public void setNumberOfSword(int numberOfSword) {
				this.numberOfSword = numberOfSword;
				
			}
		 
		 public void setNumberOfHearts(int numberOfHearts) {
				this.numberOfHearts = numberOfHearts;
				
			}
		 public void setNumberOfEyes( int numberOfEyes) {
				this.numberOfEyes = numberOfEyes;
				
			}
		 public void setNumberOfPotions(int numberOfPotions) {
				this.numberOfPotions = numberOfPotions;
				
			}
		 public void setGold(int gold) {
				this.gold = gold;
				
			}
		 public void setNumberOfApples( int numberOfApples) {
			    this.numberOfApples = numberOfApples;
				
			}

}
