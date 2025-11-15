package matrices;

import java.util.Scanner;

public class EjemploMatriz {

	public static void main(String[] args) {
		int matriz[][];
		int i, j;
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número de filas : ");
		i = sc.nextInt();
		System.out.print("Introduce el número de columnas : ");
		j = sc.nextInt();
		matriz = new int[i][j];
		
		System.out.println("Llena la matriz : ");
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				System.out.print("Elemento [" + i + "][" + j + "] : ");
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matriz : ");
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				if(i == j) {
					suma += matriz[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.println("La suma de la diagonal principal es : " + suma);
	}

}
