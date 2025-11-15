package edd;

import java.util.Scanner;

public class ClaseScanner {

	public static void main(String[] args) {
		var texto = """
				Podemos introducir datos a travez de la consola y 
				para ello podemos usar la clase scanner que pertenece
				al paquete java.util
				""";
		System.out.println(texto);
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce texto => ");
		var txt = sc.nextLine();
		System.out.println("=> "+txt);
		
		var consola = new Scanner(System.in);
		System.out.println("Escribe tu nombre => ");
		var nombre = consola.nextLine();
		System.out.println("=> "+nombre);
		sc.close();
		consola.close();
		
	}

}
