package edd;

public class Formateo_Cadenas {

	public static void main(String[] args) {
		System.out.println("+++ Formateo Cadenas +++");
		var nombre = "Matias";
		var edad = 35;
		var salario = 21000.50;
		
		// String.format
		var mensaje = String.format("Nombre : %s", nombre);
		System.out.println(mensaje);
		
		var mensaje2 = String.format("Nombre : %s , Edad : %d , Salario : $%.2f", nombre,edad,salario);
		System.out.println(mensaje2);
		
		//metodo printf
		System.out.printf("Nombre: %s, Edad : %d , Salario : $%.2f%n",nombre,edad,salario);
		
		var numEmpleado = 12 ; 
		// text block
		mensaje = """
				%nDetalle Persona: \s
				--------------------------
				\tNombre : %s
				\tNo. Empleado : %04d
				\tedad : %d años
				\tsalario : $%.2f 
				""".formatted(nombre,numEmpleado,edad,salario);
		System.out.println(mensaje);
	}

}
