package edd;

import java.util.Scanner;

public class LeerTiposDatos {

	public static void main(String[] args) {
		var consola = new Scanner(System.in);
		System.out.print("Ingresa tu edad => ");
		var edad = consola.nextInt();
		System.out.println("=> "+edad);
		System.out.print("Ingresa altura => ");
		var altura = consola.nextDouble();
		System.out.println("=> "+altura);
		
		consola.nextLine();
		
		System.out.print("Ingresa nombre => ");
		var nombre = consola.nextLine();
		System.out.println("=> "+nombre);
		
		// conversion de datos
		System.out.println("Valor entero");
		var enteroString = consola.nextLine();
		var entero = Integer.parseInt(enteroString);
		System.out.println("Valor convertido => "+entero);
		// tipo flotante
		System.out.println("Valor flotante");
		var flotante = Float.parseFloat(consola.nextLine());
		System.out.println("Valor convertido => "+flotante);
	}

}
