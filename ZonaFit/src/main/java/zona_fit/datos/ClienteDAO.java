package zona_fit.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import zona_fit.conexion.Conexion;
import zona_fit.dominio.Cliente;

public class ClienteDAO implements IClienteDAO {

	@Override
	public List<Cliente> listarClientes() {
		List<Cliente> clientes = new ArrayList<>();
		PreparedStatement ps;
		ResultSet rs;
		Connection con = Conexion.getConexion();
		var sql = "SELECT * FROM cliente ORDER BY id";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				var cliente = new Cliente();
				cliente.setId(rs.getInt("id"));
				cliente.setNombre(rs.getString("nombre"));
				cliente.setApellido(rs.getString("apellido"));
				cliente.setMembresia(rs.getInt("membresia"));
				//añadimos al cliente a la lista
				//que creamos al inicio del metodo
				clientes.add(cliente);
			}
			
		}catch (Exception e) {
			System.out.println("Error al listar clientes: " + e.getMessage());
		}
		finally {
			try {
				con.close();
			}catch (Exception e) {
				System.out.println("Error al cerrar la conexion: " + e.getMessage());
			}
		}
		return clientes;
	}

	@Override
	public boolean bucarClientePorId(Cliente cliente) {
		PreparedStatement ps;
		ResultSet rs;
		Connection con = Conexion.getConexion();
		String sql = "SELECT * FROM cliente WHERE id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, cliente.getId());
			rs = ps.executeQuery();
			if(rs.next()) {
				cliente.setNombre(rs.getString("nombre"));
				cliente.setApellido(rs.getString("apellido"));
				cliente.setMembresia(rs.getInt("membresia"));
				return true;
			}
		}catch (Exception e) {
			System.out.println("Error al buscar cliente por ID: " + e.getMessage());
		}
		finally {
			try {
				con.close();
			}catch (Exception e) {
				System.out.println("Error al cerrar la conexion: " + e.getMessage());
			}
		}
		return false;
	}

	@Override
	public boolean agregarCliente(Cliente cliente) {
		PreparedStatement ps;
		Connection con = Conexion.getConexion();
		String sql = "INSERT INTO cliente (nombre, apellido, membresia) VALUES (?, ?, ?)";
		try {
			ps = con.prepareCall(sql);
			ps.setString(1, cliente.getNombre());
			ps.setString(2, cliente.getApellido());
			ps.setInt(3, cliente.getMembresia());
			ps.execute();
			return true;
		}catch (Exception e) {
			System.out.println("Error al agregar cliente: " + e.getMessage());
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				System.out.println("Error al cerrar la conexion: " + e.getMessage());
			}
		}
		return false;
	}

	@Override
	public boolean modificarCliente(Cliente cliente) {
		PreparedStatement ps;
		Connection con = Conexion.getConexion();
		var sql = "UPDATE cliente SET nombre = ?, apellido = ?, membresia = ? WHERE id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, cliente.getNombre());
			ps.setString(2, cliente.getApellido());
			ps.setInt(3, cliente.getMembresia());
			ps.setInt(4, cliente.getId());
			ps.execute();
			return true;
		} catch (Exception e) {
			System.out.println("Error al modificar cliente: " + e.getMessage());
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				System.out.println("Error al cerrar la conexion: " + e.getMessage());
			}
		}
		return false;
	}

	@Override
	public boolean eliminarCliente(Cliente cliente) {
		PreparedStatement ps;
		Connection con = Conexion.getConexion();
		String sql = "DELETE FROM cliente WHERE id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, cliente.getId());
			ps.execute();
			return true;
		} catch (Exception e) {
			System.out.println("Error al eliminar cliente: " + e.getMessage());
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error al cerrar la conexion: " + e.getMessage());
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("------ Listar Clientes ------");
		IClienteDAO clienteDAO = new ClienteDAO();
		var clientes = clienteDAO.listarClientes();
		clientes.forEach(System.out::println);
		//--------------------------------------------------------------------------
		System.out.println("------ Buscar Cliente por ID ------");
		Cliente cliente1 = new Cliente(2); //poner id que se quiera buscar
		System.out.println("Cliente antes de la busqueda: " + cliente1);
		
		var encontrado = clienteDAO.bucarClientePorId(cliente1);
		if(encontrado) {
			System.out.println("Cliente encontrado: " + cliente1);
		}else {
			System.out.println("Cliente no encontrado");
		}
		//--------------------------------------------------------------------------
		/*
		System.out.println("------ Agregar Cliente ------");
		var nuevoCliente = new Cliente("Daniel","Ortiz",500);
		var agregado = clienteDAO.agregarCliente(nuevoCliente);
		if(agregado) {
			System.out.println("Cliente agregado: " + nuevoCliente);
		}else {
			System.out.println("No se pudo agregar el cliente");
		}	
		System.out.println("Lista de clientes despues de agregar: ");
		clienteDAO.listarClientes().forEach(System.out::println);
		*/
		//--------------------------------------------------------------------------
		//modificar cliente
		/*
		System.out.println("------ Modificar Cliente ------");
		var modificarCliente = new Cliente(5,"Carlos Daniel","Ortiz",300);
		var modificado = clienteDAO.modificarCliente(modificarCliente);
		if(modificado) {
			System.out.println("Cliente modificado: " + modificarCliente);
		}else {
			System.out.println("No se pudo modificar el cliente");
		}
		System.out.println("Lista de clientes despues de modificar: ");
		clienteDAO.listarClientes().forEach(System.out::println);
		*/
		//--------------------------------------------------------------------------
		System.out.println("------ Eliminar Cliente ------");
		var clienteEliminar = new Cliente(5); 
		var eliminado = clienteDAO.eliminarCliente(clienteEliminar);
		if(eliminado) {
			System.out.println("Cliente eliminado: " + clienteEliminar);
		}else {
			System.out.println("No se pudo eliminar el cliente");
		}
		System.out.println("Lista de clientes despues de eliminar: ");
		clienteDAO.listarClientes().forEach(System.out::println);
	}
}
