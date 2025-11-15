package gm.tareas.servicio;

import java.util.List;

import gm.tareas.modelo.Tarea;

public interface ITareaServicio {
	public List<Tarea> ListarTareas();
	
	public Tarea buscarTareaPorId(Integer idTarea);
	
	public void guardarTarea(Tarea tarea);
	
	public void eliminarTarea(Integer idTarea);
}
