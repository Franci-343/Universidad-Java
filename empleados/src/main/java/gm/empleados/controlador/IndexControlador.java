package gm.empleados.controlador;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gm.empleados.modelo.Empleado;
import gm.empleados.servicio.EmpleadoServicio;


@Controller
public class IndexControlador {
	private static final Logger logger =
			LoggerFactory.getLogger(IndexControlador.class); 
	
	@Autowired
	EmpleadoServicio empleadoServicio;
	
	@RequestMapping(value = "/",method =  RequestMethod.GET)
	public String iniciar(ModelMap modelo) {
		List<Empleado> empleados = empleadoServicio.listarEmpleados();
		empleados.forEach(empleado -> logger.info(empleado.toString()));
		//Compartimos el modelo con la vista
		modelo.put("empleados", empleados);
		return "index";  //index.jsp
	}
	
	@RequestMapping(value = "/agregar", method = RequestMethod.GET)
	public String mostrarAgregar(ModelMap modelo) {
		// Inicializamos el objeto para el binding del formulario
		modelo.put("empleadoForma", new Empleado());
		return "agregar"; // agregar.jsp
	}
	
	@RequestMapping(value = "/agregar", method = RequestMethod.POST)
	public String agregar(@ModelAttribute("empleadoForma") Empleado empleado) {
		logger.info("Empleado a agregar: " + empleado);
		empleadoServicio.guardarEmpleado(empleado);
		return "redirect:/";
	}
	@RequestMapping(value = "/editar", method = RequestMethod.GET)
	public String mostrarEditar(@RequestParam int idEmpleado, ModelMap modelo) {
		Empleado empleado = empleadoServicio.buscarEmpleadoPorId(idEmpleado);
		logger.info("Empleado a editar: " + empleado);
		modelo.put("empleadoForma", empleado);
		return "editar"; // editar.jsp
	}
	
	@RequestMapping(value = "/editar", method = RequestMethod.POST)
	public String editar(@ModelAttribute("empleadoForma") Empleado empleado) {
		logger.info("Empleado editado: " + empleado);
		empleadoServicio.guardarEmpleado(empleado);
		return "redirect:/";
	}
	@RequestMapping(value = "/eliminar", method = RequestMethod.GET)
	public String eliminar(@RequestParam int idEmpleado) {
		Empleado empleado = empleadoServicio.buscarEmpleadoPorId(idEmpleado);
		logger.info("Empleado a eliminar: " + empleado);
		empleadoServicio.eliminarEmpleado(empleado);
		return "redirect:/";
	}
}