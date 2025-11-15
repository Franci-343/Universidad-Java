package operadores;

import java.util.Scanner;

public class SistemaPrestamoLibros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean credencialEst, viveCerca;
		
		System.out.print("Tiene credencial de estudiante? (s/n) ");
		char r = sc.next().charAt(0);
		System.out.print("A que distancia vive de la biblioteca? (en km) ");
		int r2 = sc.nextInt();
		if(r == 's') {
			credencialEst = true;
		} else {
			credencialEst = false;
		}
		if(r2 <= 3) {
			viveCerca = true;
		} else {
			viveCerca = false;
		}
		if(credencialEst || viveCerca) {
			System.out.println("Esta habilitado para pedir prestado un libro");
		}else {
			System.out.println("No esta habilitado para pedir prestado un libro");
		}
	}

}
