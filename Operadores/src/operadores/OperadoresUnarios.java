package operadores;

public class OperadoresUnarios {

	public static void main(String[] args) {
		System.out.println("Operadores Unarios");
		int a = 3,b=2,resultado;
		var c = true;	
		System.out.println("Operador unario +");
		resultado = +a;
		System.out.println("Resultado => "+resultado);
		
		System.out.println("Operador unario -");
		resultado = -a;
		System.out.println("Resultado => "+resultado);
		
		System.out.println("Pre incremento");
		a = 3; resultado = ++a;
		System.out.println("Resultado => "+resultado);
		a = 3;
		resultado = a++;
		System.out.println("Post incremento");
		System.out.println("Resultado => "+resultado);
		System.out.println("a incrementado => "+a);
		
		System.out.println("Pre decremento");
		b = -2;
		resultado = --b;
		System.out.println("Resultado => "+resultado);
		b = -2;
		resultado = b--;
		System.out.println("Post decremento");
		System.out.println("Resultado => "+resultado);
		System.out.println("b decrementado => "+b);
	}
}
