package funciones;

public class FuncionesRecursivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var texto = """
				Las funciones recursivas son funciones que se llaman a si mismas
				para resolver un problema.
				""";
		var texto2 = """
				Un ejemplo clasico es el calculo del factorial de un numero
				en java se puede implementar de la siguiente manera:
				public static int factorial(int n) {
				    if (n == 0) {
				        return 1;
				    } else {
				        return n * factorial(n - 1);
				    }
				}
				""";
		
		var texto3 = """
				Recordemos que las funciones recursivas tienen un caso base,
				por ejemplo en el caso del factorial, el caso base es cuando n es 0,
				ya que el factorial de 0 es 1.
				expresado en una formula matematica:
				n! = n * (n - 1)!
				""";
		System.out.println(texto);
		System.out.println();
		System.out.println(texto2);
		System.out.println();
		System.out.println(texto3);
	}

}
