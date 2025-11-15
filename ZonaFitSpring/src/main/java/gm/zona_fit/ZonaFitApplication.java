package gm.zona_fit;

import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;

//@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {
	
	@Autowired
	private IClienteServicio clienteServicio;
	
	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);
	
	public static void main(String[] args) {
		logger.info("Iniciando la aplicacion ZonaFit");
		
		SpringApplication.run(ZonaFitApplication.class, args);
		
		logger.info("Aplicacion finalizada");
	}
	@Override
	public void run(String... args) throws Exception {
		
		zonaFitApp();
		
	}
	private void zonaFitApp() {
		logger.info("------ Aplicacion zona fit ------");
		var salir = false;
		var sc = new Scanner(System.in);
		while(!salir) {
			var opcion = mostrarMenu(sc);
			salir = ejecutarOpcion(opcion, sc);
			logger.info("");
		}
		sc.close();
		
	}
	private boolean ejecutarOpcion(int opcion, Scanner sc) {
		var salir = false;
		switch (opcion) {
			case 1 -> {
				logger.info("Listado de clientes:\n");
				List<Cliente> clientes = clienteServicio.listarClientes();
				clientes.forEach(cliente -> logger.info(cliente.toString()));
			}
			case 2 -> {
				logger.info("Ingrese el ID del cliente a buscar: \n");
				var idBuscar = sc.nextInt();
				Cliente clienteBuscado = clienteServicio.buscarClientePorId(idBuscar);
				if (clienteBuscado != null) {
					logger.info("Cliente encontrado: " + clienteBuscado);
				} else {
					logger.info("Cliente con ID " + idBuscar + " no encontrado.");
				}
			}
			case 3 -> {
				logger.info("Agregar nuevo cliente:\n");
				logger.info("Ingrese el nombre: ");
				var nombre = sc.next();
				logger.info("Ingrese el apellido: ");
				var apellido = sc.next();
				logger.info("Membresia: ");
				var membresia = sc.nextInt();
				var clienteNuevo = new Cliente();
				clienteNuevo.setNombre(nombre);
				clienteNuevo.setApellido(apellido);
				clienteNuevo.setMembresia(membresia);
				clienteServicio.guardarCliente(clienteNuevo);
				logger.info("Cliente agregado: " + clienteNuevo+"\n");
			}
			case 4 -> {
				logger.info("Modificar cliente:\n");
				logger.info("Ingrese el ID: ");
				var id = sc.nextInt();
				Cliente clientee = clienteServicio.buscarClientePorId(id);
				if (clientee != null) {
					logger.info("Nombre : ");
					var nombre = sc.next();
					logger.info("Apellido: ");
					var apellido = sc.next();
					logger.info("Membresia: ");
					var membresia = sc.nextInt();
					clientee.setNombre(nombre);
					clientee.setApellido(apellido);
					clientee.setMembresia(membresia);
					clienteServicio.guardarCliente(clientee);
					logger.info("Cliente modificado: " + clientee+"\n");
				}else {
					logger.info("Cliente con ID " + id + " no encontrado.\n");
				}
			}
			case 5 -> {
				logger.info("Eliminar cliente:\n");
				logger.info("Ingrese el ID del cliente a eliminar: ");
				var idEliminar = sc.nextInt();
				Cliente clienteAEliminar = clienteServicio.buscarClientePorId(idEliminar);
				if (clienteAEliminar != null) {
					clienteServicio.eliminarCliente(clienteAEliminar);
					logger.info("Cliente eliminado: " + clienteAEliminar+"\n");
				} else {
					logger.info("Cliente con ID " + idEliminar + " no encontrado.\n");
				}
			}
			case 6 -> {
				logger.info("Saliendo de la aplicacion...");
				salir = true;
			}
			default -> logger.info("Opcion no valida. Intente de nuevo.\n");
			
		}
		
		return salir;
	}
	private int mostrarMenu(Scanner sc) {
		logger.info("""
				\n------ Menu Principal ------\n
				1. Listar clientes
				2. Buscar cliente por ID
				3. Agregar cliente
				4. modificar cliente
				5. Eliminar cliente
				6. Salir
				Seleccione una opcion:
				""");
		var opcion = sc.nextInt();
		return opcion;
	}
}