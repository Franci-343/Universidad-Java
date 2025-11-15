package gm.tareas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import gm.tareas.modelo.Tarea;

public interface TareaRepositorio extends JpaRepository<Tarea, Integer> {
	
 
}
