package zona_fit.presentacion;

import java.util.Scanner;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

public class ZonaFitApp {

	public static void main(String[] args) {
		zonaFitApp();
	}
	private static void zonaFitApp() {
		var salir = false;
		var consola = new Scanner(System.in);
		IClienteDAO clienteDao = new ClienteDAO();
		while(!salir) {
			try {
				var opcion = mostrarMenu(consola);
				salir = ejecutarOpcion(consola, opcion,clienteDao);
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
			System.out.println();
		}
		consola.close();
	}
	private static boolean ejecutarOpcion(Scanner consola,int opcion ,IClienteDAO clienteDao) {
		var salir = false;
		switch(opcion) {
			case 1 -> {
				System.out.println("------- Listar clientes -------");
				var clientes = clienteDao.listarClientes();
				clientes.forEach(System.out::println);
			}
			case 2 -> {
				System.out.println("------- Buscar Cliente -------");
				System.out.println("Ingrese el ID del cliente a buscar: ");
				var id = consola.nextInt();
				var cliente = new Cliente(id);
				var encontrado = clienteDao.bucarClientePorId(cliente);
				if(encontrado) {
					System.out.println("Cliente encontrado: " + cliente);
				}else {
					System.out.println("Cliente no encontrado");
				}
			}
			case 3 -> {
				System.out.println("------- Agregar Cliente -------");
				System.out.print("Ingrese el nombre: ");
				var nombre = consola.next();
				System.out.print("Ingrese el apellido: ");
				var apellido = consola.next();
				System.out.print("Mebresia: ");
				var membresia = consola.nextInt();
				
				var cliente = new Cliente(nombre, apellido, membresia);
				var agregado = clienteDao.agregarCliente(cliente);
				if(agregado) {
					System.out.println("Cliente agregado: " + cliente);
				}else {
					System.out.println("No se pudo agregar el cliente");
				}
			}
			
			case 4 -> {
				System.out.println("------- Modificar Cliente -------");
				System.out.print("Ingrese el ID del cliente a modificar: ");
				var id = consola.nextInt();
				System.out.print("Ingrese el nuevo nombre: ");
				var nombre = consola.next();
				System.out.print("Ingrese el nuevo apellido: ");
				var apellido = consola.next();
				System.out.print("Membresia: ");
				var membresia = consola.nextInt();
				
				var cliente = new Cliente(id, nombre, apellido, membresia);
				var modificado = clienteDao.modificarCliente(cliente);
				if(modificado) {
					System.out.println("Cliente modificado: " + cliente);
				}else {
					System.out.println("No se pudo modificar el cliente");
				}
			}
			case 5 -> {
				System.out.println("------- Eliminar Cliente -------");
				System.out.print("Ingrese el ID del cliente a eliminar: ");
				var id = consola.nextInt();
				var cliente = new Cliente(id);
				var eliminado = clienteDao.eliminarCliente(cliente);
				if(eliminado) {
					System.out.println("Cliente eliminado: " + cliente);
				}else {
					System.out.println("No se pudo eliminar el cliente");
				}
			}
			case 6 -> {
				System.out.println("Saliendo...");
				salir = true;
			}
			default -> System.out.println("Opcion no valida");
		}
		return salir;
	}
	private static int mostrarMenu(Scanner consola) {
		System.out.println("----- Zona Fit -----");
		System.out.println("1. Listar clientes");
		System.out.println("2. Buscar cliente");
		System.out.println("3. Agregar cliente");
		System.out.println("4. Modificar cliente");
		System.out.println("5. Eliminar cliente");
		System.out.println("6. Salir");
		System.out.print("Seleccione una opcion: ");
		var opcion = consola.nextInt();
		return opcion;
	}
}
