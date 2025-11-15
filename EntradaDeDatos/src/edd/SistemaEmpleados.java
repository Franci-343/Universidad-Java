package edd;

import java.util.Scanner;

public class SistemaEmpleados {

	public static void main(String[] args) {
		/*
		 * Nombre Empleado
		 * edad => int
		 * salario => double
		 * es jefe de departamento => boolean
		 * */
		var sc = new Scanner(System.in);
		System.out.println("================================");
		System.out.print("Intro nombre => ");
		var nombre = sc.nextLine();
		System.out.print("Intro edad => ");
		var edad = Integer.parseInt(sc.nextLine());
		System.out.print("Intro salario => ");
		var salario = Double.parseDouble(sc.nextLine());
		System.out.print("Intro esJefe => ");
		var esJefe = Boolean.parseBoolean(sc.nextLine());
		System.out.println("================================");
		
		
		System.out.println("\t"+nombre);
		System.out.println("\t"+edad);
		System.out.println("\t"+salario);
		System.out.println("\t"+esJefe);
	}

}
