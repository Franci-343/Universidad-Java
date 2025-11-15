package ciclos;

import java.util.Scanner;

public class CajeroAutomatico {

	public static void main(String[] args) {
		int saldo = 1000;
		boolean salir = false;
		Scanner sc = new Scanner(System.in);
		while(!salir) {
			int opcion,deposito, retiro;
			System.out.println("Bienvenido al cajero automático");
			System.out.println("1. Consultar saldo");
			System.out.println("2. Depositar dinero");
			System.out.println("3. Retirar dinero");
			System.out.println("4. Salir");
			System.out.print("Seleccione una opción: "); opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Su saldo es: $" + saldo);
				break;
			case 2:
				System.out.print("Ingrese la cantidad a depositar: "); deposito = sc.nextInt();
				saldo += deposito;
				System.out.println("Depósito exitoso.");
				break;
			case 3:
				System.out.println("Ingrese la cantidad a retirar: "); retiro = sc.nextInt();
				if(retiro > saldo) {
					System.out.println("Saldo insuficiente.");
					break;
				} else {
					saldo -= retiro;
					System.out.println("Retiro exitoso.");
					break;
				}
			case 4:
				salir = true;
				System.out.println("Gracias por usar el cajero automático...");
				break;
			default:
				System.out.println("Opción inválida.");
				break;
			}
		}
		

	}

}
