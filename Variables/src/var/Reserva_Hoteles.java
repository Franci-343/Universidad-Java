package var;

import java.util.Scanner;

public class Reserva_Hoteles {

	public static void main(String[] args) {
		System.out.println("*** SISTEMA RESERVACION HOTELES ***");
		
		var nombreCliente = "Franco Mario";
		var diasEstancia = 7 ; 
		var tarifaDiaria = 1300.00; 
		var vistaMar = true ; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println(nombreCliente);
		System.out.println(diasEstancia);
		System.out.println(tarifaDiaria);
		System.out.println(vistaMar);
		System.out.println("Modificar valores(y/n) ? ");
		var n = sc.next();
		
		
		if(n.equals("y")) {
			System.out.print("Nombre cliente => "); nombreCliente = sc.next();
			System.out.print("Dias estancia => "); diasEstancia = sc.nextInt();
			System.out.print("Tarifa diaria => "); tarifaDiaria = sc.nextDouble();
			System.out.print("Vista mar => "); vistaMar = sc.nextBoolean();
			System.out.print("Mostrar (y/n) ? => ");
			if(n.equals("y")) {
				System.out.println(nombreCliente);
				System.out.println(diasEstancia);
				System.out.println(tarifaDiaria);
				System.out.println(vistaMar);
			}
		}else {
			System.out.println("Muy bien ...");
		}

	}

}
