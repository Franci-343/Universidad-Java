package operadores;

public class OperadoresComparacion {

	public static void main(String[] args) {
		System.out.println("Operadores de comparacion");
		var a = 10;
		var b = 20;
		var c = 10;
		var d = 10;
		// igualdad
		var resultado = a == b;
		System.out.println("a == b => " + resultado);
		
		// diferente
		resultado = a != b;
		System.out.println("a != b => " + resultado);
		// mayor que
		resultado = a > b;
		System.out.println("a > b => " + resultado);
		// menor que
		resultado = a < b;
		System.out.println("a < b => " + resultado);
		// mayor o igual que
		resultado = a >= c;
		System.out.println("a >= c => " + resultado);
		// menor o igual que
		resultado = a <= c;
		System.out.println("a <= c => " + resultado);
		

	}

}
