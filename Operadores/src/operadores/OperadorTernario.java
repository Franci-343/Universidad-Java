package operadores;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		var texto = """
				Operador Ternario en java
				+ sintaxis:
				condicion ? expresion1 : expresion2
				""";
		System.out.println(texto);
		
		System.out.println("Es par o impar");
		Scanner sc = new Scanner(System.in);
		int n1;
		System.out.print("Ingrese un numero: ");
		n1 = sc.nextInt();
		var resultado = (n1 % 2 == 0) ? "Es par" : "Es impar";
		System.out.println(resultado);
	}

}
