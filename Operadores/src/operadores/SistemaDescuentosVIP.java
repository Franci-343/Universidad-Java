package operadores;

import java.util.Scanner;

public class SistemaDescuentosVIP {

	public static void main(String[] args) {
		int nroArticulos,requisitoVip = 10;
		
		boolean esMiembroVIP,descuentoVIP;
		Scanner sc = new Scanner(System.in);
		System.out.print("¿Cuantos articulos compro ? :");
		nroArticulos = sc.nextInt();
		System.out.print("¿Es miembro VIP ? (s/n) :");
		var n = sc.next();
		if (n.equals("s")) {
			esMiembroVIP = true;
		}else {
			esMiembroVIP = false;
		}
		if(nroArticulos>=requisitoVip && esMiembroVIP) {
			descuentoVIP = true;
			System.out.println("Usted tiene descuento VIP");
		}else {
			descuentoVIP = false;
			System.out.println("Usted no tiene descuento VIP");
		}
			
	}

}
