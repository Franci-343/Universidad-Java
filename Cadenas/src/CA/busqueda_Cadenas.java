package CA;

public class busqueda_Cadenas {

	public static void main(String[] args) {
		String texto = "Buscar subcadenas";
		System.out.println(texto);
		
		var cadena1="Hola Mundo";
		
		var indice1 = cadena1.indexOf("Hola");//buscamos la cadena
		System.out.println("Indice 1 => "+indice1);
		
		var indice2 = cadena1.lastIndexOf("Mundo");//buscamos la ultima cadena
		System.out.println("Indice 2 => "+indice2);
		//En cualquiera de las 2 funciones si la cadena no es encontrada
		//la funcion devolvera un -1
		
		
	}

}
