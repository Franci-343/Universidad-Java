package operadores;

import java.util.Scanner;

public class SistemaAutenticacion {

	public static void main(String[] args) {
		String usuario;
		String contraseña;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un usuario:"); usuario = sc.next();
		System.out.print("Ingrese una contraseña:"); contraseña = sc.next();
		
		final String usuarioAlmacenado = usuario;
		final String contraseñaAlmacenada = contraseña;
		boolean accesoConcedido;
		
		System.out.println("Bienvenido al sistema de autenticación");
		System.out.print("Ingrese su usuario:"); usuario = sc.next();
		System.out.print("Ingrese su contraseña:"); contraseña = sc.next();
		
		if (usuario.equals(usuarioAlmacenado) && contraseña.equalsIgnoreCase(contraseñaAlmacenada)) {
			accesoConcedido = true;
			System.out.println("Acceso concedido => "+accesoConcedido);
		} else {
			accesoConcedido = false;
			System.out.println("Acceso denegado => "+accesoConcedido);
		}
	}

}
