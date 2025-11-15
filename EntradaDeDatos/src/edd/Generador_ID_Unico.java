package edd;

import java.util.Random;
import java.util.Scanner;

public class Generador_ID_Unico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu nombre => ");
		var nombre = sc.next();
		System.out.print("Introduce tu apellido => ");
		var apellido = sc.next();
		System.out.print("Introduce año de nacimiento => ");
		var añoNac = sc.next();
		
		Random ran = new Random();
		var aleatorio = ran.nextInt(9999)+1;
		
		nombre = nombre.substring(0, 2).toUpperCase();
		apellido = apellido.substring(0,2).toUpperCase();
		añoNac = añoNac.substring(2, 4);
		
		var idUnico = nombre+apellido+añoNac+aleatorio;
		System.out.println(idUnico);
	}

}
