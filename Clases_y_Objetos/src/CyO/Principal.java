package CyO;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Persona p1 = new Persona();
		p1.leer(leer);
		p1.mostrar();
		System.out.println("Ahora usemos la calculadora");
		Calculadora calc = new Calculadora();
		int n1, n2;
		System.out.print("Introduce el primer numero: ");
		n1 = leer.nextInt();
		System.out.print("Introduce el segundo numero: ");
		n2 = leer.nextInt();
		calc.leer(n1, n2);
		System.out.println("Resultados:");
		calc.sumar();
		calc.restar();
		calc.multiplicar();
		calc.dividir();
		leer.close();
	}

}