package CA;

public class Subcadenas {

	public static void main(String[] args) {
		String texto = "subcadenas";
		System.out.println(texto);
		
		var cadena1 = "Hola Mundo";
		System.out.println("Cadena original => "+cadena1);
		
		//Subcadena
		var subcadena1 = cadena1.substring(0,4);//indices de inicio y fin
		System.out.println("Primera subcadena => "+subcadena1);
		var subcadena2 = cadena1.substring(5);//solo indice de partida
		System.out.println("Segunda subcadena => "+subcadena2);
	}

}
