package manejoArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var nombreArchivo = "mi_archivo.txt";
		var archivo = new File(nombreArchivo);
		try {
			System.out.println("Contenido del archivo: ");
			
			var entrada = new BufferedReader(new FileReader(archivo));
			//leer el archivo
			var linea = entrada.readLine();
			while(linea != null) {
				System.out.println(linea);
				linea = entrada.readLine();
			}
			//cerramos el archivo
			entrada.close();
		}catch (Exception e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
