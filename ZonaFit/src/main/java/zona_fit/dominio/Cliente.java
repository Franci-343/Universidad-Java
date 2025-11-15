package zona_fit.dominio;

import java.util.Objects;

public class Cliente {
	private int id;
	private String nombre;
	private String apellido;
	private int membresia;
	
	public Cliente() {
		
	}
	public Cliente(int id, String nombre, String apellido, int membresia) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.membresia = membresia;
	}
	public Cliente(int id) {
		this.id = id;
	}
	public Cliente(String nombre, String apellido, int membresia) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.membresia = membresia;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getMembresia() {
		return membresia;
	}
	public void setMembresia(int membresia) {
		this.membresia = membresia;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", membresia=" + membresia + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellido, id, membresia, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(apellido, other.apellido) && id == other.id && membresia == other.membresia
				&& Objects.equals(nombre, other.nombre);
	}
	
	
}
