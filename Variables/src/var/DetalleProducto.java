package var;

import java.util.Scanner;

public class DetalleProducto {

	public static void main(String[] args) {
		String nombreProducto = "Laptop";
		double precioProducto = 214.10;
		int cantidadDisponible = 12;
		boolean $disponible = true;
		
		System.out.println("=====Detalle producto=====");
		System.out.println("Nombre producto => "+nombreProducto);
		System.out.println("Precio producto => "+precioProducto);
		System.out.println("Cantidad disponible => "+cantidadDisponible);
		System.out.println("Esta disponible ? => "+$disponible);
		Scanner sc = new Scanner(System.in);
		System.out.print("Cambiar datos(y/n) ? => ");
		String n = sc.next();
		
		if(n.equals("y")) {
			System.out.println("CAMBIANDO DATOS");
			System.out.print("Intro nombreProducto => "); nombreProducto = sc.next();
			System.out.print("Intro precioProducto => "); precioProducto = sc.nextDouble();
			System.out.print("Intro cantidadDisponible => "); cantidadDisponible = sc.nextInt();
			System.out.print("Intro $disponibe => "); $disponible = sc.nextBoolean();	
			System.out.println("Volver a mostrar ? => ");
			n=sc.next();
			if(n.equals("y")) {
				System.out.println("=====Detalle producto=====");
				System.out.println("Nombre producto => "+nombreProducto);
				System.out.println("Precio producto => "+precioProducto);
				System.out.println("Cantidad disponible => "+cantidadDisponible);
				System.out.println("Esta disponible ? => "+$disponible);
			}
		} else {
			System.out.println("OK");
		}
	}

}
