package operadores;

import java.util.Scanner;

public class SistemaReservaHotel {

	public static void main(String[] args) {
		String nombre;
		int dias;
		
		Scanner sc = new Scanner(System.in);
		double costoEstadia;
		System.out.print("Ingrese su nombre:");
		nombre = sc.nextLine();
		System.out.print("Ingrese la cantidad de dias que se va a quedar:");
		dias = sc.nextInt();
		System.out.print("Desea una habitacion con vista al mar? (s/n)");
		char respuesta = sc.next().charAt(0);
		if(respuesta =='s') {
			costoEstadia = dias * 190.50;
		} else {
			costoEstadia = dias * 150.50;
		}
		
		System.out.println("-----Factura-----");
		System.out.println("Cliente: " + nombre);
		System.out.println("Costo total de la estadia: $" + costoEstadia);
		System.out.println("Vista al mar: " + (respuesta == 's' ? "Si" : "No"));
		sc.close();
	}

}
