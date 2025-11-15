package funciones;

import java.util.Scanner;

public class funcion {
	// esta es la funcion main, que es el punto de entrada del programa java
	public static void main(String[] args) {
		String texto = """
				Las funciones son bloques de codigo que se pueden reutilizar
				tienen un nombre y pueden recibir parametros y devolver valores
				""";
		System.out.println(texto);
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese su nombre: ");
		var nombre = sc.nextLine();
		saludar(nombre);
		sc.close();
	}
	
	static void saludar(String r) {
		System.out.println("Hola " + r + " esta es una funcion");
	}

}
