package var;

public class tipoVar {

	public static void main(String[] args) {
		/*Las variables de tipo var nos permiten definir una variable sin 
		 * especificar explicitamente su tipo de dato
		 * haciendo que el codigo sea mas consciso y legible
		 * */
		
		//Sin var
		String nombre  = "pepe";
		int edad = 18; 
		boolean esCasado = true ; 
		
		//Con var
		var $nombre = "juan";
		var $edad = 20;
		var $esCasado = false; 
		
		/*
		 * El uso de var es exclusivo para definir variables locales dentro
		 * de metodos
		 * las variables var deben ser inicializadas al declararse
		 * el tipo debe de ser inferible != null
		 * 
		 * */
	}

}
