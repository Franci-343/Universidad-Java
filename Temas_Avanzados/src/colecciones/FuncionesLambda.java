package colecciones;

import java.util.ArrayList;
import java.util.List;

public class FuncionesLambda {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Lunes");
		lista.add("Martes");
		lista.add("Miercoles");
		lista.add("Jueves");
		lista.add("Viernes");
		lista.add("Sabado");
		lista.add("Domingo");
		for (String dia : lista) {
			System.out.print(" "+dia);
		}
		System.out.println();
		lista.forEach(dia -> System.out.print(" "+dia));
	}

}
