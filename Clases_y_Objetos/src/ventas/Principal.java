package ventas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de productos a comprar: ");
		int cantidad = sc.nextInt();
		Orden o1 = new Orden(cantidad);
		for(int i = 0; i< cantidad; i++) {
			System.out.println("Producto nro: "+(i+1));
			System.out.print("Ingrese el id del producto : ");
			int id = sc.nextInt();
			System.out.print("Ingrese el nombre del producto: ");
			String nombre = sc.next();
			System.out.print("Ingrese el precio del producto: ");
			double precio = sc.nextDouble();
			Producto p = new Producto(id, nombre, precio);
			o1.agregarProducto(p);
		}
		o1.calcularTotal();
		System.out.println(".......");
		o1.mostrarOrden();
		sc.close();
	}

}
