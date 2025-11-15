package paquete;

public class Paquetes_en_Java {

	public static void main(String[] args) {
		var texto = """
				Paquetes en Java
				Los paquetes en Java son una forma de organizar y agrupar clases relacionadas. Un paquete es un contenedor que permite evitar conflictos de nombres y facilita la gestión del código.
				En eclipse, puedes crear un paquete haciendo clic derecho en la carpeta "src", seleccionando "New" y luego "Package". Luego, puedes agregar clases a ese paquete.
				Para importar una clase de un paquete, puedes usar la palabra clave "import" seguida del nombre completo de la clase o del paquete. Por ejemplo:
				import java.util.ArrayList;
				""";
		System.out.println(texto);
	}
	public static void metodo() {
		System.out.println("Metodo estatico");
		// que hace un metodo estatico ? 
		// Un metodo estatico es un metodo que pertenece a la clase y no a una instancia de la clase.
		// se puede importar un metodo estatico ?
		// si, se puede importar un metodo estatico usando la palabra clave "import static"
	}
	public void metodo2() {
		System.out.println("Metodo no estatico");
	}
	void metodo3() {
		System.out.println("Metodo default");
	}

}
