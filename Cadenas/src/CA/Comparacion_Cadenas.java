package CA;

public class Comparacion_Cadenas {

	public static void main(String[] args) {
		var texto = """
		Comparacion de cadenas (pool de cadenas)		
				""";
		var cadena1 = "java";
		var cadena2 = "java";
		
		//comparacion de cadenas ==
		System.out.println("Las variables son iguales ? ");
		System.out.println("=> "+(cadena1 == cadena2));
		var cadena3 = new String("java");
		System.out.println("=> "+(cadena1==cadena3));
		
		//comparar contenido
		System.out.println("=> "+(cadena1.equals(cadena3)));
	}

}
