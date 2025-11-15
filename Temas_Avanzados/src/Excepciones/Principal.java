package Excepciones;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1 = 10,valor2 = 0;
		try {
			var resultado = valor1/valor2;
			System.out.println("El resultado es: " + resultado);
		} catch (Exception e) {
			System.out.println("Division por cero no permitida "+e);
		}
		
		try {
			System.out.println(Aritmetica.division(valor1, valor2));
		} catch (Exception e) {
			System.out.println("Error en la division: "+e);
		}
		finally {
			System.out.println("Se reviso la division entre 0");
		}
		
	}

}
