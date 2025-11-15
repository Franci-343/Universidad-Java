package java_beans;

public class Principal {

	public static void main(String[] args) {
		Persona p = new Persona();
		p.setNombre("Juan");
		p.setApellido("Perez");
		System.out.println(p);
		
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Apellido: " + p.getApellido());
	}

}
