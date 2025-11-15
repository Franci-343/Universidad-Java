package operadores;

import java.util.Scanner;

public class ValorDentroRango {

	public static void main(String[] args) {
		int n; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número dentro el rango 2 - 5: ");
		n = sc.nextInt();
		if(n >= 2 && n <= 5) {
			System.out.println("El número " + n + " está dentro del rango.");
		} else {
			System.out.println("El número " + n + " está fuera del rango.");
		}
		

	}

}
