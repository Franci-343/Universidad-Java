package paquete;
import java.util.Scanner;

import encapsulamiento.Persona;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	sc = new Scanner(System.in);
		Persona p1 = new Persona();
		p1.leerDatos(sc);
		p1.mostrarInformacion();
		sc.close();
	}

}
