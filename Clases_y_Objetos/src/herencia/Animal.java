package herencia;

import java.util.Scanner;

public class Animal {
	private String nombre;
	private int edad;
	private int idAnimal;
	private static int contadorAnimales = 0;
	public Animal() {
		Animal.contadorAnimales++;
		this.idAnimal = Animal.contadorAnimales;
	}
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public static int getContadorAnimales() {
		return contadorAnimales;
	}
	public static void setContadorAnimales(int contadorAnimales) {
		Animal.contadorAnimales = contadorAnimales;
	}
	public int getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void leerDatosAnimal(Scanner sc) {
		System.out.println("------ Datos del Animal ------");
		System.out.print("Nombre: "); this.nombre = sc.next();
		System.out.print("Edad: "); this.edad = sc.nextInt();
	}
	public void mostrarDatosAnimal() {
		System.out.println("------ Introduce Datos ------");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
	}
	protected void hacerSonido() {
		System.out.println("El animal hace un sonido");
	}
	protected void mostrarId() {
		System.out.println("ID del animal: " + this.getIdAnimal());
	}
}
