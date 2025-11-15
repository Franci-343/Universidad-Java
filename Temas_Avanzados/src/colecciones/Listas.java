package colecciones;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Lunes");
		lista.add("Martes");
		lista.add("Miercoles");
		lista.add("Jueves");
		lista.add("Viernes");
		lista.add("Sabado");
		lista.add("Domingo");
		for (Object dia : lista) {
			System.out.print(" "+dia);
		}
	}

}
