package ciclos;

import java.util.Scanner;

public class MenuIterativo {

	public static void main(String[] args) {
		boolean salir = false;
		Scanner sc = new Scanner(System.in);
		while(!salir) {
			System.out.println("1. Opcion 1");
			System.out.println("2. Opcion 2");
			System.out.println("3. Opcion 3");
			System.out.println("4. Salir");
			System.out.print("Elige una opcion: ");
			int opcion = sc.nextInt();
			switch(opcion) {
				case 1:
					System.out.println("Has elegido la opcion 1");
					break;
				case 2:
					System.out.println("Has elegido la opcion 2");
					break;
				case 3:
					System.out.println("Has elegido la opcion 3");
					break;
				case 4:
					salir = true;
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opcion no valida");
			}
		}
	}

}
