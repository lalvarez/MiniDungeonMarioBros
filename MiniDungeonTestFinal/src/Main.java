import minidungeon.MiniDungeonGUI;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		MiniDungeonGUI gui = new MiniDungeonGUI(50, 50);
		gui.md_println("Hello World!");

		
//Game 
		//Floor floor1 = new Floor();
		//Floor floor2 = new Floor();
		//Floor floor3 = new Floor();
		//Floor floor4 = new Floor();
		
		Box floor1Map[][] = new Box[50][50];
		
//Personajes
		gui.md_addSprite(0, "super mario.jpg", true);
		gui.md_addSprite(1, "tubo.jpeg", true);
		gui.md_addSprite(2, "nube.jpg", true);
		
	/*	
		
		
		
//Floor 1		
		//floor1.map = floor1Map;
		//floor1.Iniciar();
		
	    //Constructor por defecto de las casillas del mapa
		for (int i = 0; i < 50; i++) {
		    for (int j = 0; j < 50; j++) {
		        
		        //floor1Map[i][j]= new Box(i, j, false, false, false, false, false, false, false, false, false, false); 
		        floor1Map[i][j].tipo = "bordes";
		        gui.md_setSquareColor(i, j, 135, 206, 255);
		        
		    }    
		}
		
		//Pasillos
		for (int i = 0; i < 50; i++) {
		    for (int j = 0; j < 50; j++) {
		       // FILA 1 
		       if (j == 1 && i < 7) {
		                floor1Map[i][j].tipo = "pasillo";
		                gui.md_setSquareColor(i, j, 255, 255, 255); 
		                floor1Map[i][j].setWalk(true);
		                
		            }
		        
		       //FILA 2
               if (j >= 2 && j <7) {
		            if (i == 25 ) {
		                floor1Map[i][j].tipo = "pasillo";
		                gui.md_setSquareColor(i, j, 255, 255, 255); 
		                floor1Map[i][j].setWalk(true);
		            }
                 }
               //fila 6
		            if (j == 6) {
		            	if (i > 6 && i <25) {
			                floor1Map[i][j].tipo = "pasillo";
			                gui.md_setSquareColor(i, j, 255, 255, 255); 
			                floor1Map[i][j].setWalk(true);
		            	}
		        }
		            if (j >= 6 && j <= 16) {
			            if (i == 15) {
			                floor1Map[i][j].tipo = "pasillo";
			                gui.md_setSquareColor(i, j, 255, 255, 255); 
			                floor1Map[i][j].setWalk(true);
			            }
		        }
		            
		         //fila 12
		            if (j == 12) {
			            if (i > 15 && i <20) {
			              
			                floor1Map[i][j].tipo = "pasillo";
			                gui.md_setSquareColor(i, j, 255, 255, 255); 
			                floor1Map[i][j].setWalk(true);

		            
		             
			            }
		        }
		            
		         //fila 46
		            
		            if (j == 46) {
			            if (i > 8 && i <20) {
			              
			                floor1Map[i][j].tipo = "pasillo";
			                gui.md_setSquareColor(i, j, 255, 255, 255); 
			                floor1Map[i][j].setWalk(true);

			            }
		        }
		            
		             
		         //union habitacion 2 y 4
		            if (j >= 17 && j <= 34) {
			            
			            if (i == 27) {
			                floor1Map[i][j].tipo = "pasillo";
			                gui.md_setSquareColor(i, j, 255, 255, 255);
			                floor1Map[i][j].setWalk(true);
			               

		
		    }
		}
		          //Union habitacion 5 y 4
		            if (j == 36) {
			            
			            if (i > 27 && i <46) {
			              
			                floor1Map[i][j].tipo = "pasillo";
			                gui.md_setSquareColor(i, j, 255, 255, 255); 
			                floor1Map[i][j].setWalk(true);

		            
		             
			            }
		        }
		
		            //union habitacion 1 y 6
		            if (j >= 4 && j <= 43) {
			            
			            if (i == 4) {
			                floor1Map[i][j].tipo = "pasillo";
			                gui.md_setSquareColor(i, j, 255, 255, 255);
			                floor1Map[i][j].setWalk(true);

		
		    }
		}
		 
		    
		    
		    }
		}
		
		
			//Habitaciones
					//Habitacion 1
		            for (int i = 4; i < 7; i++) {
		    		    for (int j = 2; j <9; j++) {
		    		    	gui.md_setSquareColor(i, j, 255, 255, 255); 
		    		    	floor1Map[i][j].tipo = "habitacion";
		    		    	floor1Map[i][j].setWalk(true);

		    		    }
		                
		            }
		            
		        	//Habitacion 2
		            for (int i = 20; i < 30; i++) {
		    		    for (int j = 12; j <17; j++) {
		    		    	gui.md_setSquareColor(i, j, 255, 255, 255); 
		    		    	floor1Map[i][j].tipo = "habitacion";
		    		    	floor1Map[i][j].setWalk(true);

		    		    }
		                
		            }
		            
		          //Habitacion 3
		            for (int i = 15; i < 19; i++) {
		    		    for (int j = 18; j <21; j++) {
		    		    	gui.md_setSquareColor(i, j, 255, 255, 255); 
		    		    	floor1Map[i][j].tipo = "habitacion";
		    		    	floor1Map[i][j].setWalk(true);

		    		    }
		                
		            }
		         
		          //Habitacion 4
		            for (int i = 24; i < 28; i++) {
		    		    for (int j = 34; j <39; j++) {
		    		    	gui.md_setSquareColor(i, j, 255, 255, 255); 
		    		    	floor1Map[i][j].tipo = "habitacion";
		    		    	floor1Map[i][j].setWalk(true);

		    		    }
		                
		            }
		            
		            //Habitacion 5
		            for (int i = 46; i < 49; i++) {
		    		    for (int j = 35; j <39; j++) {
		    		    	gui.md_setSquareColor(i, j, 255, 255, 255); 
		    		    	floor1Map[i][j].tipo = "habitacion";
		    		    	floor1Map[i][j].setWalk(true);

		    		    }
		                
		            }
		         
		          //Habitacion 6
		            for (int i = 4; i <9; i++) {
		    		    for (int j = 43; j <47; j++) {
		    		    	gui.md_setSquareColor(i, j, 255, 255, 255); 
		    		    	floor1Map[i][j].tipo = "habitacion";
		    		    	floor1Map[i][j].setWalk(true);

		    		    }
		                
		            }
		         
		            
		            
		            
		            
		            
		            
		            
            //Generador de puertas de habitaciones
		            for (int i = 0; i < 50; i++) {
		    		    for (int j = 0; j <50; j++){
                         if (j == 1 && i == 3 ||j == 6 && i == 7 ||j == 12 && i == 19 || j == 17 && i == 15 || j == 17 && i == 27 ||j == 33 && i == 27 ||j == 36 && i == 45 ||j == 9 && i == 4||j == 42 && i == 4) {
		               
		                floor1Map[i][j].tipo = "puerta de habitacion";
		                floor1Map[i][j].puerta = true;
		                floor1Map[i][j].setWalk(true);
		                
		                gui.md_setSquareImage(i, j, "tubo.jpeg") ;
		               
	
		            }
		    		    }
		    		    	}
		            
		            
		            //decorado
		            
		            
		           for ( int i = 0; i <20 ; i++){
		            	int numeroRandomX =(int)( Math.random()*50);
			            int numeroRandomY =(int) (Math.random()*50);
		            	if (floor1Map[numeroRandomX][numeroRandomY].tipo == "bordes"){
			            gui.md_setSquareImage(numeroRandomX, numeroRandomY, "nube.jpg");
		            	}
		            		}
		           
		         
		           */
		        
		           while(true){ 	
		           
		       		gui.md_moveSprite(0,0,1);
		       	
		       		
		   		gui.md_setSpriteVisible(0, true);
		           
		           
		   		
		   		
		   		int x1 =0;
            	int y1 = 1;
		   		
		   			//while(x1<50 && y1 <50){
		   				//while(floor1Map[x1][y1].tipo == "habitacion" || floor1Map[x1][y1].tipo == "pasillo" ){
            	while(true){
        	    	String lastAction = gui.md_getLastAction().trim();
        	    	if (lastAction.length() > 0){
        	    	   gui.md_println(lastAction);
        	    	   if (lastAction.equals("right")){
        	    		   gui.md_moveSprite(0, ++x1, y1);
        	    	   }
        	    	   else if (lastAction.equals("down")){
        	    		   gui.md_moveSprite(0, x1, ++y1);
        	    	   }
        	    	}
        	    	Thread.sleep(300L); // IMPORTANT THREAD METHOD
        	    
            	gui.setVisible(true);
		           
	}
		           }
}
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
