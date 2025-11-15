package funciones;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		var n1 = sc.nextDouble();
		System.out.print("Ingrese otro numero: ");
		var n2 = sc.nextDouble();
		System.out.println("Resultado: " + sumar(n1, n2));
		sc.close();
		
	}
	static double sumar (double a, double b) {
		return a + b;
	}

}
