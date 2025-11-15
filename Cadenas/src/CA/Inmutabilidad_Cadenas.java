package CA;

public class Inmutabilidad_Cadenas {

	public static void main(String[] args) {
		var texto = """
		Cuando creamos una cadena los caracteres dentro de esta no
		pueden ser modificados.
		Si deseamos modificar una cadena,teneos que crear un nuevo
		objeto tipo String y asignarlo a nuestra variable
		""";
		System.out.println(texto);
		//en conclusion las cadenas son inmutables
		
		
	}

}
