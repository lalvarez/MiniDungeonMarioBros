
public class Tablero {
	public static int MAX_MAZMORRAS = 2;
	public static int MAX_CELDAS = 50;
	private static int MAX_SALAS = 5; 

	private Celda[][][] mazmorras;

	public Tablero() {
		this.mazmorras = new Celda[MAX_CELDAS][MAX_CELDAS][MAX_MAZMORRAS];
	}

	public void inicializaT() {
		for (int i = 0; i < MAX_CELDAS; i++) {
			for (int j = 0; j < MAX_CELDAS; j++) {
				for (int k = 0; k < MAX_MAZMORRAS; k++) {
					Celda c = new Celda();
					mazmorras[i][j][k] = c;
				}
			}
		}
		
	}
	
	private boolean comprobarPos(int x, int y, int k, int dir){
		boolean avanza = false;
		
		switch(dir){
		case 0:
			if(x == 0){
				if(this.mazmorras[x+1][y][k].getCelda() == ENUM_CELDA.CASILLA) avanza = false; 
				else avanza = true;
			}
			else if(x == MAX_CELDAS - 1){
				if(this.mazmorras[x-1][y][k].getCelda() == ENUM_CELDA.CASILLA) avanza = false; 
				else avanza = true;				
			}
			else {
				if(this.mazmorras[x-1][y][k].getCelda() == ENUM_CELDA.CASILLA || this.mazmorras[x+1][y][k].getCelda() == ENUM_CELDA.CASILLA) avanza = false;
				else avanza = true; 
			}
			break;			
		case 1:
			if(x == 0){
				if(this.mazmorras[x+1][y][k].getCelda() == ENUM_CELDA.CASILLA) avanza = false; 
				else avanza = true;
			}
			else if(x == MAX_CELDAS - 1){
				if(this.mazmorras[x-1][y][k].getCelda() == ENUM_CELDA.CASILLA) avanza = false; 
				else avanza = true;				
			}
			else {
				if(this.mazmorras[x-1][y][k].getCelda() == ENUM_CELDA.CASILLA || this.mazmorras[x+1][y][k].getCelda() == ENUM_CELDA.CASILLA) avanza = false;
				else avanza = true; 
			}			
			break;
		case 2:			
			if(y == 0){
				if(this.mazmorras[x][y+1][k].getCelda() == ENUM_CELDA.CASILLA) avanza = false; 
				else avanza = true; 
			}
			else if(y == MAX_CELDAS - 1){
				if(this.mazmorras[x][y-1][k].getCelda() == ENUM_CELDA.CASILLA) avanza = false; 
				else avanza = true; 
			}
			else{
				if(this.mazmorras[x][y-1][k].getCelda() == ENUM_CELDA.CASILLA || this.mazmorras[x][y+1][k].getCelda() == ENUM_CELDA.CASILLA) avanza = false;
				else avanza = true; 
			}				
			break;
		case 3:
			if(y == 0){
				if(this.mazmorras[x][y+1][k].getCelda() == ENUM_CELDA.CASILLA) avanza = false; 
				else avanza = true; 
			}
			else if(y == MAX_CELDAS - 1){
				if(this.mazmorras[x][y-1][k].getCelda() == ENUM_CELDA.CASILLA) avanza = false; 
				else avanza = true; 
			}
			else{
				if(this.mazmorras[x][y-1][k].getCelda() == ENUM_CELDA.CASILLA || this.mazmorras[x][y+1][k].getCelda() == ENUM_CELDA.CASILLA) avanza = false;
				else avanza = true; 
			}			
			break;
		}
		
		return avanza; 
	}

	public Celda[][][] getArray() {
		return mazmorras;
	}

	private int alAvanza(int n) {
		int cas;

		cas = (int) (Math.random() * n);

		return cas;
	}

	private int alDireccion() {
		int dir;
		dir = (int) (Math.random() * 4);
		return dir;
	}

	public void crearPasillos(int contm) {

		int x, y, cont = 0;
		x = (int) (Math.random() * MAX_CELDAS);
		y = (int) (Math.random() * MAX_CELDAS);
		
		while (contm < MAX_MAZMORRAS){

		this.mazmorras[x][y][contm].setCelda(ENUM_CELDA.CASILLA);

			while (cont < (MAX_CELDAS * 4)) {
				int dir = alDireccion();
				boolean fin = false; 
	
				switch (dir) {
				case 0: // Derecha
					int avanza = alAvanza(MAX_CELDAS - y);
					int cont0 = 0;
					int pos = y + 1;
					while (cont0 < avanza && !fin) {
						if(!comprobarPos(x, pos, contm, dir)){
							this.mazmorras[x][pos][contm].setCelda(ENUM_CELDA.CASILLA);
							fin = true; 						
						}
						else{
							this.mazmorras[x][pos][contm].setCelda(ENUM_CELDA.CASILLA);
							pos++;
							cont0++;
						}
					}
	
					y = avanza + y;
					break;
				case 1: // Izquierda
					int avanza1 = alAvanza(y);
					int cont1 = 0;
					int pos1 = y - 1;
					while (cont1 < avanza1 && !fin) {
						if(!comprobarPos(x, pos1, contm, dir)){
							this.mazmorras[x][pos1][contm].setCelda(ENUM_CELDA.CASILLA);
							fin = true; 
						}
						else{
							this.mazmorras[x][pos1][contm].setCelda(ENUM_CELDA.CASILLA);
							pos1--;
							cont1++;
						}
					}
					y = y - avanza1;
					break;
	
				case 2: // Arriba
					int avanza2 = alAvanza(x);
					int cont2 = 0;
					int pos2 = x - 1;
					while (cont2 < avanza2 && !fin) {
						if(!comprobarPos(pos2, y, contm, dir)){
							this.mazmorras[pos2][y][contm].setCelda(ENUM_CELDA.CASILLA);
							fin = true; 
						}
						else{
							this.mazmorras[pos2][y][contm].setCelda(ENUM_CELDA.CASILLA);
							pos2--;
							cont2++;
						}
					}
					x = x - avanza2;
					break;
				case 3: // Abajo
					int avanza3 = alAvanza(MAX_CELDAS - x);
					int cont3 = 0;
					int pos3 = x + 1;
					while (cont3 < avanza3 && !fin) {	
						if(!comprobarPos(pos3, y, contm, dir)){
							this.mazmorras[pos3][y][contm].setCelda(ENUM_CELDA.CASILLA);
							fin = true; 
						}
						else{
						this.mazmorras[pos3][y][contm].setCelda(ENUM_CELDA.CASILLA);
						pos3++;
						cont3++;
						}
					}
					x = avanza3 + x;
					break;
				}
	
				cont++;
			}
			
		contm++; 
		}

	}
	
	public void crearSalas(int contm){
		int cont = 0; 
			
			while(cont < MAX_SALAS){
				int N = (int) (Math.random() * 6 + 2); //Aleatorio de 2 a 6(inclusive)
				int M = (int) (Math.random() * 8 + 2); //Aleatorio de 2 a 8(inclusive)
				
				int x = (int) (Math.random()*(MAX_CELDAS - N));
				int y = (int) (Math.random()*(MAX_CELDAS - M));
				
				for(int i = x; i < x + N; i++){
					for(int j = y; j < y + M; j++){
						this.mazmorras[i][j][contm].setCelda(ENUM_CELDA.CASILLA);
					}
				}
							
				cont++; 
			}
			
	}
		


}
