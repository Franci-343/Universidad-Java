package senteciasD;

import java.util.Scanner;

public class SentenciaIF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu edad => ");
		var edad = sc.nextInt();
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
		

	}

}
