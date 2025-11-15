package herencia;

import java.util.Scanner;

public class Perro extends Animal {
	private String raza;
	public Perro() {
		super();
	}
	public Perro(String nombre, int edad, String raza) {
		super(nombre, edad);
		this.raza = raza;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public void LeerDatosPerro(Scanner sc) {
		System.out.println("------ Datos del Perro ------");
	 	System.out.print("Nombre: " ); super.setNombre(sc.next());
		System.out.print("Edad: " ); super.setEdad(sc.nextInt());
		System.out.print("Raza: "); this.raza = sc.next();
	}
	public void MostrarDatosPerro() {
		System.out.println("------ Datos del Perro ------");
		System.out.println("Nombre: " + super.getNombre());
		System.out.println("Edad: " + super.getEdad());
		System.out.println("Raza: " + this.raza);
	}
}