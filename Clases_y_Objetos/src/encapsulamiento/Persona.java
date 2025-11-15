package encapsulamiento;

import java.util.Scanner;

public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	
	public Persona(){
		
	}
	public Persona(String nombre, int edad, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void mostrarInformacion() {
		System.out.println("----DATOS DE LA PERSONA----");
		System.out.println("Nombre:"+this.getNombre());
		System.out.println("Edad:"+this.getEdad());
		System.out.println("DNI:"+this.getDni());
	}
	public void leerDatos(Scanner sc) {
		System.out.println("----INGRESO DE DATOS DE LA PERSONA----");
		System.out.print("Nombre:"); this.setNombre(sc.next());
		System.out.print("Edad:"); this.setEdad(sc.nextInt());
		System.out.print("DNI:"); this.setDni(sc.next());
	}
}
