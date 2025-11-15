package var;

public class ejemploVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====USEMOS VAR EN JAVA====");
		//Sin var
		String $nombre1 = "Pepe";
		System.out.println("Nombre 1 => "+$nombre1);
		
		//Con var
		var $nombre2 = "Turn";
		System.out.println("Nombre 2 => "+$nombre2);
		
		//Otras variables usando var
		var edad = 12; //si usamos l sera tipo long y no entero
		System.out.println("Edad => "+edad);
		var sueldo = 5000.5f; //tipo float
		var esCasado = false ;
		//no podemos asignar null a una variable tipo var
	}

}
