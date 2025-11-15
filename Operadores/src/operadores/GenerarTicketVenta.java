package operadores;

import java.util.Scanner;

public class GenerarTicketVenta {

	public static void main(String[] args) {
		double precioLeche, precioPan, precioHuevos;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese precio de la leche: ");
		precioLeche = sc.nextDouble();
		System.out.print("Ingrese precio del pan: ");
		precioPan = sc.nextDouble();
		System.out.print("Ingrese precio de los huevos: ");
		precioHuevos = sc.nextDouble();
		double total = precioLeche + precioPan + precioHuevos;
		double impuesto = total * 0.16;
		System.out.println("Aplicar descuento (%): ");
		double porcentajeDescuento = sc.nextDouble();
		
		var descuento = total * (porcentajeDescuento / 100.0);
		var totalConDescuento = total - descuento;
		
		
		System.out.println("----- TICKET DE VENTA -----");
		System.out.println("Total: " + total);
		System.out.println("Impuesto (16%): " + impuesto);
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("Total a pagar: " + (total + impuesto));
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("Gracias por su compra!");
	}

}
