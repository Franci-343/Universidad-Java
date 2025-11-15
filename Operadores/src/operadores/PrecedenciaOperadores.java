package operadores;

public class PrecedenciaOperadores {

	public static void main(String[] args) {
		//Precedencia o orden de operadores en java
		// 1. parentesis y corchetes () []
		// 2. operadores unarios ++ -- + - ! ~
		// 3. operadores aritmeticos * / %
		// 4. operadores aritmeticos + -
		// 5. operadores relacionales < > <= >= 
		// 6. operadores de igualdad == !=
		// 7. operadores logicos && ||
		// 8. operador asignacion = += -= *= /= %=
		
		int x = 12/3 + 5 * 2 - 1;
		System.out.println("El valor de x es: " + x);
	}

}