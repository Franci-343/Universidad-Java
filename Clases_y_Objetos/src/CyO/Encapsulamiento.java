package CyO;

public class Encapsulamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var texto = """
					El encapsulamiento es un principio fundamental de la programación orientada a objetos que consiste en restringir el acceso directo a los datos y métodos de un objeto desde fuera de su propia clase. Esto se logra mediante el uso de modificadores de acceso, como private, protected y public, que controlan la visibilidad de los miembros de una clase.
					en java se utiliza el encapsulamiento para proteger los datos sensibles y garantizar la integridad del estado de un objeto. Al encapsular los datos, se evita que otros objetos puedan modificarlos directamente, lo que ayuda a prevenir errores y mantener la coherencia del sistema.
					ejemplo en java:
					class Persona {
					    private String nombre; // atributo privado
					    private int edad; // atributo privado
					
					    // constructor
					    public Persona(String nombre, int edad) {
					        this.nombre = nombre;
					        this.edad = edad;
					    }
					
					    // método público para acceder al nombre
					    public String getNombre() {
					        return nombre;
					    }
					
					    // método público para modificar el nombre
					    public void setNombre(String nombre) {
					        this.nombre = nombre;
					    }
					
					    // método público para acceder a la edad
					    public int getEdad() {
					        return edad;
					    }
					
					    // método público para modificar la edad
					    public void setEdad(int edad) {
					        if (edad >= 0) { // validación simple
					            this.edad = edad;
					        }
					    }
					 """;
	}

}
