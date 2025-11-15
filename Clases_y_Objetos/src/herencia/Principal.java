package herencia;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Animal a1 = new Animal();
		System.out.println("Contador de animales: " + Animal.getContadorAnimales());
		a1.leerDatosAnimal(sc);
		a1.mostrarDatosAnimal();
		a1.hacerSonido();
		a1.mostrarId();
		System.out.println();
		Perro p1 = new Perro();
		p1.LeerDatosPerro(sc);
		p1.MostrarDatosPerro();
		p1.hacerSonido();
		p1.mostrarId();
		// Verificar el contador de animales
		System.out.println("Contador de animales: " + Perro.getContadorAnimales());
		sc.close();
	}

}