package arreglos;

import java.util.Scanner;

public class arreglo {

	public static void main(String[] args) {
		//arreglos en java
		
		//declarar el arreglo
		int[] enteros;
		//inicializar el arreglo
		enteros = new int[5]; // reservamos 5 celdas de memoria
		Scanner sc = new Scanner(System.in);
		//llenar el arreglo
		for(int i=1; i<=enteros.length;i++) {
			int num;
			System.out.print("Introduce un numero: ");
			num = sc.nextInt();
			enteros[i-1] = num;
		}
		System.out.println("Los numeros introducidos son: ");
		for(int i=1;i <= enteros.length;i++) {
			System.out.println(enteros[i-1]);
		}
	}

}
