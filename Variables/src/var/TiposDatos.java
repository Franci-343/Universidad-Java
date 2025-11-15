package var;

public class TiposDatos {

	public static void main(String[] args) {
		/* 
		 Tipos de datos en java
		 Enteros => valor por defecto 0
		 Punto flotante => valor por defecto 0.0
		 Caracter => valor por defecto \u0000
		 Booleano => false
		*/
		
		//enteros
		byte tipoByte = 127; 
		//la variable tipo byte trabaja en rango de : -128 a 127.
		System.out.println("Tipo byte => "+tipoByte);
		short tipoShort = 32767;
		//la variable short trabaja en rango de : -32768 a 32767.
		System.out.println("Tipo short => "+tipoShort);
		int tipoInt = 2147483647;
		//la variable int trabaja en rango de :-2147483648 a 2147483647
		System.out.println("Tipo int => "+tipoInt);
		long tipoLong = 987654321;
		System.out.println("Tipo long => "+tipoLong);
		
		long tipoLong1 = 987654321098765432L;//L para mas digitos
		System.out.println("Tipo long => "+tipoLong1);
		
		
		//Punto flotante
		float tipoFloat = 3.14f; //f para indicar tipo float
		System.out.println("Tipo float => "+tipoFloat);
		
		double tipoDouble = 3.1315D; //D para indicar tipo double
		System.out.println("Tipo double => "+tipoDouble);
		
		
		//Caracter
		char tipoChar = 'A'; //Caracteres del juego unicode
		System.out.println("Tipo char => "+tipoChar);
		tipoChar = 65 ; 
		System.out.println("Tipo char => "+tipoChar);
		tipoChar = '@';
		System.out.println("Tipo char => "+tipoChar);
		
		//Booleano
		boolean tipoBoolean = true;
		System.out.println("Tipo boolean => "+tipoBoolean);
		
		tipoBoolean = false;
		System.out.println("Tipo boolean => "+tipoBoolean);
		//Tipos Object (Referencia)
		String nombre = null; 
		//null indica que no apunta a ningun objeto
		//ausencia de referencia
		System.out.println("Nombre => "+nombre);
		nombre = "Nadia flores";
		System.out.println("Nombre => "+nombre);
	}

}
