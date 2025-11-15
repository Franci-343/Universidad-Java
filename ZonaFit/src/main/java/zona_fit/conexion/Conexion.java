package zona_fit.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConexion() {
		Connection conexion = null;
		var BaseDatos = "zona_fit_db";
		var url = "jdbc:mysql://localhost:3306/" + BaseDatos;
		var usuario = "root";
		var password = "Nadloraya1";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, usuario, password);
			
		}catch (Exception e) {
			System.out.println("Error al conectar a la base de datos: " + e.getMessage());
		}
		return conexion;
	}
    public static void main(String[] args) {
    	var conexion = Conexion.getConexion();
    	if (conexion != null) {
    		System.out.println("Conexión exitosa a la base de datos " +conexion);
    	}else {
			System.out.println("Error al conectar a la base de datos");
		}
    }
}