
	
	import Clases.ENUM_CELDA;

	public class Celda {
		private ENUM_CELDA name; 
		
		public Celda(){
			this.name = ENUM_CELDA.MURO; 
		}
		
		public void celdaAleatoria() {
			int celda;
			
			celda = (int) (Math.random()*2);
			if (celda == 1) this.name = ENUM_CELDA.CASILLA;
			else this.name = ENUM_CELDA.MURO;
			
		}
		
		public ENUM_CELDA getCelda(){
			return this.name;
		}
		
		public void setCelda(ENUM_CELDA enu){
			this.name = enu;
		}
}
