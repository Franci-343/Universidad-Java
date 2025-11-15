package operadores;

import java.util.Scanner;

public class TiendaEnLinea {

	public static void main(String[] args) {
		double montoCompra;
		boolean esMiembro;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el monto de la compra: ");
		montoCompra = sc.nextDouble();
		System.out.print("¿Es miembro? (s/n): ");
		var r = sc.next().charAt(0);
		if(r == 's') {
			esMiembro = true;
		} else {
			esMiembro = false;
		}
		double descuento = 0,porcentajeDescuento;
		if(montoCompra > 1000 && esMiembro) {
			porcentajeDescuento = 0.10;
			descuento = montoCompra * porcentajeDescuento;
		} else if(esMiembro == true) {
			porcentajeDescuento = 0.05;
			descuento = montoCompra * porcentajeDescuento;
		} else if(esMiembro == false && montoCompra < 1000) {
			porcentajeDescuento = 0;
			descuento = montoCompra * porcentajeDescuento;
		}
		System.out.println("-----Ticket de compra-----");
		System.out.println("Monto de compra : $"+montoCompra);
		System.out.println("Monto de descuento : $"+descuento);
		System.out.println("Monto Final : $"+(montoCompra - descuento));
		System.out.println("Gracias por su compra");
	}

}
