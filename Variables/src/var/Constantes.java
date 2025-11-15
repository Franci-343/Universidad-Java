package var;

public class Constantes {

	public static void main(String[] args) {
		/*
		 * es una variable cuyo valor no puede modificarse una vez 
		 * se ha inicializado
		 * */
		
		//final tipo nombreConstante = valor;
		
		//Ejemplos de constantes
		final int Dias_en_semana = 7 ; 
		final double PI = 3.14159;
		final String mensaje = "Bienvenido a la universidad java";
		
		//Tambien podemos usar var para definir una constante
		
		/*
		 * EJEMPLO DE USO DE CONSTANTES
		 * */
		System.out.println("-------constantes-------");
		System.out.println("Dias de la semana => "+Dias_en_semana);
		System.out.println("PI => "+PI);
		System.out.println(mensaje);
		//ya hay constantes predefinidas en java
		System.out.println("Math.PI => "+Math.PI);
		
	}

}
