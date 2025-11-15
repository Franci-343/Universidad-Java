package CA;

public class MasConcatenacionCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var cadena1 = "Hola";
		var cadena2 = "Mundo";
		var cadena3 = cadena1+" "+cadena2;
		System.out.println(cadena3);
		
		//metodo concat
		var cadena4 = cadena1.concat(" ").concat(cadena2);
		System.out.println(cadena4);
		
		//StringBuilder
		var constructorCadenas = new StringBuffer();
		constructorCadenas.append(cadena1);
		constructorCadenas.append(" ");
		constructorCadenas.append(cadena2);
		
		var resultado = constructorCadenas.toString();
		System.out.println(constructorCadenas);
		
		//StringBuffer
		var stringBuffer = new StringBuffer();
		stringBuffer.append(cadena1).append(" ").append(cadena2);
		System.out.println(stringBuffer);
		
		//join
		resultado = String.join(" ", cadena1,cadena2);
		System.out.println(resultado);
	}

}
