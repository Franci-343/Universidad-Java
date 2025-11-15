package edd;

import java.util.Scanner;

public class Recetas_cocina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce receta => ");
		var nombreR = sc.next();
		System.out.print("Introduce ingredientes => ");
		var ingredientes = sc.next();
		System.out.print("Introduce tiempo de preparacion => ");
		var tiempo = sc.nextDouble();
		System.out.print("Introduce dificultad => ");
		var dificultad = sc.next();
		
		
		var receta = "---RECETA DE COCINA---\n"+nombreR+"\n"+ingredientes+"\n"+tiempo+"\n"+dificultad;
		System.out.println(receta);
	}

}
