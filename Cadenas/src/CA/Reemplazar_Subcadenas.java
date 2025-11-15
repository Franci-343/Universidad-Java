package CA;

public class Reemplazar_Subcadenas {

	public static void main(String[] args) {
		var cadena = "Hola Mundo";
		System.out.println("Cadena original => "+cadena);
		
		var nuevaCadena = cadena.replace("Mundo","a todos");
		System.out.println("Nueva cadena => "+nuevaCadena );
		
		nuevaCadena = cadena.replace("Hola", "Saludos");
		System.out.println("Otra cadena => "+nuevaCadena);
	}	

}
