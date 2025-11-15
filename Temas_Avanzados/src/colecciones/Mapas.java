package colecciones;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> persona = new HashMap<>();
		persona.put("Nombre", "Pepe");
		persona.put("Apellido", "Pérez");
		persona.put("Edad", "30");
		
		System.out.println("Valores del mapa:");
		persona.entrySet().forEach(System.out::println);
		
		persona.put("Edad", "31"); // Actualiza el valor asociado a la clave "Edad"
		System.out.println("Edad actualizada: " + persona.get("Edad"));
		persona.remove("Apellido"); // Elimina la entrada con la clave "Apellido"
		System.out.println("Mapa después de eliminar Apellido:");
		persona.entrySet().forEach(System.out::println);
	}

}
