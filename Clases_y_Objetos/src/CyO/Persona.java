package CyO;

import java.util.Scanner;

public class Persona {
	private String nombre, apellido;
	//constructor vacio
	Persona() {
	}
	//constructor con parametros o argumentos
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void mostrar() {
		String texto = String.format("""
				---- Datos de la persona ----
				Nombre: %s
				Apellido: %s
				""", getNombre(), getApellido());
		System.out.println(texto);
	}

	public void leer(Scanner sc) {
		System.out.print("Introduce el nombre: ");
		setNombre(sc.next());
		System.out.print("Introduce el apellido: ");
		setApellido(sc.next());
	}
}