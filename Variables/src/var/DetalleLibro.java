package var;

public class DetalleLibro {

	public static void main(String[] args) {
		// detalle de un libro
		String tituloL = "El señor de los ladrillos" ; 
		int añoPublicacion = 1954 ;
		boolean ldisponible = true ; 
		double precio = 500.50 ; 
		System.out.println("Titulo => "+tituloL);
		System.out.println("Año publicacion => "+añoPublicacion);
		System.out.println("Libro disponible => "+ldisponible);
		System.out.println("Precio => "+precio);
		//modificamos el titulo del libro
		tituloL = "La biblia de java"; 
		System.out.println(tituloL);
	}

}
