import minidungeon.MiniDungeonGUI;
public class Main1 {
	
	public static Celda[][][] main(String[] args) throws InterruptedException {
			MiniDungeonGUI gui = new MiniDungeonGUI(50, 50);
			gui.md_println("Hello World!");
			
			Map map = new Map(0, 0, 0, 0, 0, 0, 0);
			Box floor1Map[][] = new Box[50][50];
			Celda[][][] maz = generarTablero(gui);
			
				for(int i=0;i<50;i++){
					for(int j=0;j<50;j++){
				floor1Map[i][j] = new Box (i, j, true, false, false, false, false, false, false, false, false, false, true,-1);
				}}
			Player player = new Player(1, 50, 0, 1, 0, true, 0, 0,0);
		
			map.generateEnemies(gui, floor1Map);
			map.generateGold(gui, floor1Map);
			map.generateEyes(gui, floor1Map);
			map.generateHearts(gui, floor1Map);
			map.generateSwords(gui, floor1Map);
			map.generatePotions(gui,floor1Map);
			map.generateApples(gui,floor1Map);
			
			map.positionThePlayer(gui,floor1Map, player);
			
			gui.md_addSprite(0, "super mario.jpg", true);
			gui.md_setSpriteVisible(0, true);
			int x1= player.getActualPositionX();
			int y1= player.getActualPositionY();
			gui.md_moveSprite(0,x1,y1);
		    
			private static Celda[][][] generarTablero(MiniDungeonGUI gui){
				Tablero t = new Tablero();
				Celda[][][] maz = new Celda[t.MAX_CELDAS][t.MAX_CELDAS][t.MAX_MAZMORRAS];
				
				//Inicializamos la mazmorra entera a muros
				t.inicializaT();
				
				//Creamos pasillos y salas en cada planta
				for(int k = 1; k < t.MAX_MAZMORRAS; k++){
					t.crearPasillos(k);
					t.crearSalas(k);
				}
				
				maz = t.getArray();
				
				for (int i = 0; i < t.MAX_CELDAS; i++){
				    	for (int j = 0; j < t.MAX_CELDAS; j++){
				    		for(int k = 0; k < t.MAX_MAZMORRAS; k++){
				    			if (maz[i][j][k].getCelda() == ENUM_CELDA.CASILLA){
				    			gui.md_setSquareColor(i,j, 160, 052, 114);
				    			
				    			}
				    			
				    			else{
				    				gui.md_setSquareColor(i,j, 100, 0, 0);
				    			}
				    		}		    
				
				    	}		
				}
				
				return maz; 
			}
			while (player.checkLife()==true){
			while(true){
				
				
				
			
    	    	String lastAction = gui.md_getLastAction().trim();
    	    	if (lastAction.length() > 0){
    	    	   gui.md_println(lastAction);
    	    	   if (lastAction.equals("right")){
    	    		   gui.md_moveSprite(0, ++x1, y1);
    	    		   gui.md_setTextFood(player.foodOfthePlayer());
    	    		   player.testBox(gui, floor1Map, x1, y1, player);
    	    	   }
    	    	   else if (lastAction.equals("down")){
    	    		   gui.md_moveSprite(0, x1, ++y1);
    	    		   gui.md_setTextFood(player.foodOfthePlayer());
    	    		   player.testBox(gui, floor1Map, x1, y1, player);
    	    		   
    	    	   }
    	    	   else if (lastAction.equals("left")){
    	    		   gui.md_moveSprite(0, --x1, y1);
    	    		   gui.md_setTextFood(player.foodOfthePlayer());
    	    		   player.testBox(gui, floor1Map, x1, y1, player);
  	    		     
    	    	   }
    	    	   else if (lastAction.equals("up")){
    	    		   gui.md_moveSprite(0, x1, --y1);
    	    		   gui.md_setTextFood(player.foodOfthePlayer());
    	    		   player.testBox(gui, floor1Map, x1, y1, player);
    	    	   }}
    	    	
    	    	Thread.sleep(300L); 
    	    	
        	gui.setVisible(true);
        	
	           
}
			}     }
}


//gui.md_addSprite(id, spriteFileName, top);	//Add new sprite to the board
		//gui.md_animateDamage();  //Performs the damage animation over the player's portrait
		//gui.md_clearCommandBar();  //Clears the command bar.
		//gui.md_clearConsole();   //
		//gui.md_clearSprites(); //Removes all sprites of the board.
		//gui.md_getLastAction(); //Obtains the last action performed in the GUI. For instance: a player's movement, a command, a new game button click
		//gui.md_moveSprite(id, x, y); //Moves a certain sprite to a square.
		//gui.md_println(text);  //Prints a text in the console of the GUI.
		//gui.md_repaintBoard();  //Forces the board to be repainted.
		//gui.md_setPortraitPlayer(portraitFileName); //Sets the player's portrait.
		//gui.md_setSpriteVisible(id, visible);  //Sets the visibility of a sprite.
	    //gui.md_setSquareColor(x, y, red, green, blue);  //Sets the background color of a square.
		//gui.md_setSquareImage(x, y, fileName); //Sets a background image for a square.
		//gui.md_setTextFloor(floor); //Sets the floor number in the GUI.
		//gui.md_setTextFood(food); //Sets the player's food value in the GUI
		//gui.md_setTextGold(gold); //Sets the player's gold value in the GUI.
		//gui.md_setTextHealthCurrent(health); //Sets the player's current health value in the GUI
		//gui.md_setTextHealthMax(health);  //Sets the player's maximum health value in the GUI.
		//gui.md_setTextPerception(perception); 
		//gui.md_setTextPlayerName(name);
		//gui.md_setTextStrength(strength);
		//gui.md_showMessageDialog(text); //Opens a new message dialog.
