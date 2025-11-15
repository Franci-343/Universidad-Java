package senteciasD;

import java.util.Scanner;

public class Sentencia_IF_ELSE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un numero en el rango de -1 a 1 => ");
		var num = sc.nextDouble();
		if (num >= -1 && num <= 1) {
			System.out.println("El numero " + num + " si esta en el rango de -1 a 1");
		} else {
			System.out.println("El numero " + num + " no esta en el rango de -1 a 1");
		}

	}

}
