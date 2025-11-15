package paquete2;
import paquete.Paquetes_en_Java;
public class Principal {

	public static void main(String[] args) {
		// Llamada al método estático
		Paquetes_en_Java.metodo();
		// Llamada al método público no estático
		Paquetes_en_Java obj = new Paquetes_en_Java();
		obj.metodo2();
		// No se puede llamar a metodo3() porque es default (package-private)
	}

}