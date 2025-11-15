package operadores;

import java.util.Scanner;

public class SistemaBancario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continuaSistema ;
		System.out.print("Estimado usuario desea salir del sistema bancario? (s/n) => ");
		char respuesta = sc.next().charAt(0);
		if(respuesta == 's') {
			continuaSistema = true;
		}else {
			continuaSistema = false;
		}
		
		if(!continuaSistema) {
			System.out.println("Continuando en el sistema bancario");
			
		}else {
			System.out.println("Saliendo del sistema bancario");
		}

	}

}
