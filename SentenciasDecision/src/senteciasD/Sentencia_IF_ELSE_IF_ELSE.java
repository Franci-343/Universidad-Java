package senteciasD;

import java.util.Scanner;

public class Sentencia_IF_ELSE_IF_ELSE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean esMiembroVip = false ,tarjetaVip = false;
		System.out.print("¿Es ?miembro VIP? (s/n): ");
		var r1 = sc.next();
		System.out.print("¿Tiene tarjeta VIP? (s/n): ");
		var r2 = sc.next();
		
		if (r1.equals("s")) {
			esMiembroVip = true;
		} else if (r2.equals('s')) {
			tarjetaVip = true;
		} else {
			esMiembroVip = false;
			tarjetaVip = false;
		}
		System.out.println("Es miembro VIP: " + esMiembroVip);
		System.out.println("Tiene tarjeta VIP: " + tarjetaVip);
	}

}
