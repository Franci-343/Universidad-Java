package CA;

public class CaracteresEspeciales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var texto = "Caracteres especiales";
		
		var cadena1 = "Hola Mundo";
		System.out.println(cadena1);
		System.out.println("------------------------------");
		//salto de linea
		var cadena2 = "Hola\nMundo";
		System.out.println(cadena2);
		System.out.println("------------------------------");
		//tabulador
		var cadena3 = "\tHola\tMundo";
		System.out.println(cadena3);
		System.out.println("------------------------------");
		//comilla simple
		var cadena4 = "Hola \' Mundo";
		System.out.println(cadena4);
		System.out.println("------------------------------");
		//comilla doble
		var cadena5 = "Hola \" Mundo";
		System.out.println(cadena5);
		System.out.println("------------------------------");
		//diagonal invertida
		var cadena6 = "Hola \\ Mundo";
		System.out.println(cadena6);
		System.out.println("------------------------------");
	}

}
