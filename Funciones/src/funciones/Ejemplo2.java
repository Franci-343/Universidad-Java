package funciones;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		var numero = sc.nextInt();
		sc.close();
		recursiva(numero);
	}
	static void recursiva(int n) {
		if (n == 1) {
			System.out.print(n + " ");
		}else {
			
			recursiva(n - 1);
			System.out.print(n + " ");
		}
	}
}
