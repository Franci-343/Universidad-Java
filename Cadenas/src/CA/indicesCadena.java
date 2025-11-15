package CA;

public class indicesCadena {

	public static void main(String[] args) {
		
		  var texto = """
		  los indices de una cadena estan indexados de manera secuencial
		  comensando desde 0 hasta la longitud de la cadena menos uno
		  el primer caracter de la cadena es 0 y el ultimo es n-1
		  """;
		  System.out.println(texto);
		  
		  var cadena1 = "Hola Mundo";
		  
		  var primerCaracter = cadena1.charAt(0);
		  System.out.println(cadena1);
		  System.out.println("Primer caracter => "+primerCaracter);
		  
		  //tamaño
		  int n = cadena1.length();
		  var ultimoCaracter = cadena1.charAt(n-1);
		  System.out.println("Ultimo caracter => "+ultimoCaracter);
		  //letra m
		  System.out.println("M de mundo => "+cadena1.charAt(n/2));
		 
	}

}
