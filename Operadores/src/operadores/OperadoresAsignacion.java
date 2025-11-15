package operadores;

public class OperadoresAsignacion {

	public static void main(String[] args) {
		System.out.println("Operadores de asignacion");
		var miNumero = 10;
		int miNumero2 ;
		miNumero2 = 15;
		System.out.println("Asigancion compuesto");
		miNumero += 5;
		System.out.println("Mi numero => "+miNumero);
		miNumero *= 2;
		System.out.println("Mi numero => "+miNumero);
		//asignacion de variables multiples
		int a = 10, b = 20, c = 30;
		System.out.println("a => "+a);
		System.out.println("b => "+b);
		System.out.println("c => "+c);
		
	}

}
