package manejoArchivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenidoArchivo {
	public static void main(String[] args) {
		boolean anexar = true;
		var nombreArchivo = "mi_archivo.txt";
		var archivo = new File(nombreArchivo);
		
		try {
			anexar = archivo.exists();
			var salida = new PrintWriter(new FileWriter(archivo, anexar));
			
			var nuevoContenido = "Hola desde Java";
			
			salida.println(nuevoContenido);
			salida.close();
			System.out.println("Se ha escrito en el archivo: " + nuevoContenido);
			
		}catch (Exception e) {
			System.out.println("Error al escribir en el archivo: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
