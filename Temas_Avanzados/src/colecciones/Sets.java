package colecciones;

import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> conjunto = new TreeSet<>();
		conjunto.add("Elemento 1");
		conjunto.add("Elemento 2");
		conjunto.add("Elemento 3");
		conjunto.add("Elemento 1"); // No se añade porque ya existe
		System.out.println("Elementos del set:");
		conjunto.forEach(System.out::println);
		
		conjunto.remove("Elemento 2");
		System.out.println("Elementos del set después de eliminar 'Elemento 2':");
		conjunto.forEach(System.out::println);
	}

}
