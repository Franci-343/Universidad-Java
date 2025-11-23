package gm.empleados.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import gm.empleados.modelo.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer>{
	
}
