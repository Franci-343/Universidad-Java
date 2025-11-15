package CA;

public class Metodo_Cadenas {

	public static void main(String[] args) {
		var texto = """
				Metodos de cadenas
				""";
		System.out.println(texto);
		
		var cadena1 = "Hola Mundo";
		var longitud = cadena1.length();
		System.out.println("Longitud => "+longitud);
		//Reemplazar caracteres
		var nuevaCadena = cadena1.replace("o","a");
		System.out.println("Nueva cadena => "+nuevaCadena);
		
		//Convertir a mayusculas
		var mayusculas = cadena1.toUpperCase();
		System.out.println("A mayusculas => "+mayusculas);
		
		//Convertir a minusculas
		var minusculas = cadena1.toLowerCase();
		System.out.println("A minusculas => "+minusculas);
		
		//Eliminar espacios al inicio y al final
		var cadena2 = " Franco Mario   ";
		System.out.println("Cadena con espacios => "+cadena2);
		cadena2=cadena2.trim();
		System.out.println("Cadena sin espacios => "+cadena2);
	}

}
