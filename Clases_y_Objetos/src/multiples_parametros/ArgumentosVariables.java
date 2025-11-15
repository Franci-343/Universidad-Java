package multiples_parametros;

public class ArgumentosVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimirNumeros(1,2,3,4,5,6,7,8,9,10);
		//varios parametros
		variosParametros("Hola",1,2,3,4,5,6,7,8,9,10);
	}
	static void imprimirNumeros(int... numeros) {
		for(int i = 0;i<numeros.length;i++) {
			System.out.print(" "+numeros[i]);
		}
	}
	static void variosParametros(String mensaje,int... numeros) {
		System.out.print("\n"+mensaje+" ");
		for(int i = 0;i<numeros.length;i++) {
			System.out.print(" "+numeros[i]);
		}
	}
}
