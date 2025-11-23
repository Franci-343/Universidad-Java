package gm.empleados.servicio;

import java.util.List;

import gm.empleados.modelo.Empleado;

public interface IEmpleadoServicio {
	public List<Empleado> listarEmpleados();
	
	public Empleado buscarEmpleadoPorId(Integer idEmpleado);
	
	public void guardarEmpleado(Empleado empleado);
	
	public void eliminarEmpleado(Empleado empleado);
}
