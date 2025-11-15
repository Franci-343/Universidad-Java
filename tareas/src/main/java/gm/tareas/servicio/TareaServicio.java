package gm.tareas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gm.tareas.modelo.Tarea;
import gm.tareas.repositorio.TareaRepositorio;

@Service
public class TareaServicio implements ITareaServicio {
	@Autowired
	private TareaRepositorio tareaRepositorio;
	
	@Override
	public List<Tarea> ListarTareas() {
		// TODO Auto-generated method stub
		return tareaRepositorio.findAll();
	}

	@Override
	public Tarea buscarTareaPorId(Integer idTarea) {
		// TODO Auto-generated method stub
		Tarea tarea = tareaRepositorio.findById(idTarea).orElse(null);
		return tarea;
	}

	@Override
	public void guardarTarea(Tarea tarea) {
		// TODO Auto-generated method stub
		tareaRepositorio.save(tarea);
	}

	@Override
	public void eliminarTarea(Integer idTarea) {
		// TODO Auto-generated method stub
		tareaRepositorio.deleteById(idTarea);
	}
	
}
