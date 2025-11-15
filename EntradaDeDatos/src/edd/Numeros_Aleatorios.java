package edd;

import java.util.Random;

public class Numeros_Aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var texto = """
				La clase Random nos permite generar numeros
				aleatorios y esta en el paquete java.util
				
				podemos generar valores aleatorios de tipo int
				,float, double, e incluso de tipo boolean
				""";
		Random random = new Random();
		
		//generar un numero aleatorio entre 0 y 9
		var numAleatorio = random.nextInt(10);
		System.out.println("Numero aleatorio => "+numAleatorio);
		
		//numero aleatorio entre 1 y 10
		var numAleatorio2 = random.nextInt(10)+1;
		System.out.println("Numero aleatorio => "+numAleatorio2);
		
		//numero flotante entre 0.0 y 1.0
		var flotanteAleatorio = random.nextFloat(); 
		System.out.println("Flotante aleatorio => "+flotanteAleatorio);
		
		//lanzamiento de un dado
		var dado = random.nextInt(6)+1;
		System.out.println("Cara del dado "+dado);
	}

}
