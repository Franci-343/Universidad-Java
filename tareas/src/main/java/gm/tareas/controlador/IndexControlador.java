package gm.tareas.controlador;
import java.net.URL;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gm.tareas.modelo.Tarea;
import gm.tareas.servicio.TareaServicio;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.*;

@Component
public class IndexControlador implements Initializable {
	private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);
	@Autowired
	private TareaServicio tareaServicio;
	
	@FXML 
	private TableView<Tarea> tareaTabla;
	
	@FXML
	private TableColumn<Tarea, Integer> idTareaColumna;
	
	@FXML
	private TableColumn<Tarea, String> nombreTareaColumna;
	
	@FXML
	private TableColumn<Tarea, String> responsableColumna;
	
	@FXML
	private TableColumn<Tarea, String> estatusColumna;
	
	private final ObservableList<Tarea> tareaLista = FXCollections.observableArrayList();
	
	@FXML
	private TextField nombreTareaTexto;
	@FXML
	private TextField responsableTexto;
	@FXML
	private TextField estatusTexto;
	
	private Integer idTareaInterno;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		tareaTabla.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		configurarColumnas();
		listarTareas();
	}

	private void listarTareas() {
		// TODO Auto-generated method stub
		logger.info("Listando tareas...");
		tareaLista.clear();
		tareaLista.addAll(tareaServicio.ListarTareas());
		tareaTabla.setItems(tareaLista);
		
	}

	private void configurarColumnas() {
		// TODO Auto-generated method stub
		idTareaColumna.setCellValueFactory(new PropertyValueFactory<>("idTarea"));
		nombreTareaColumna.setCellValueFactory(new PropertyValueFactory<>("nombreTarea"));
		responsableColumna.setCellValueFactory(new PropertyValueFactory<>("responsable"));
		estatusColumna.setCellValueFactory(new PropertyValueFactory<>("estatus"));
	}
	
	public void agregarTarea() {
		if(nombreTareaTexto.getText().isEmpty()) {
			mostrarMensaje("Eror Validación", "El nombre de la tarea es obligatorio.");
			nombreTareaTexto.requestFocus();
			return;
		}else{
			var tarea = new Tarea();
			recolectarDatosFormulario(tarea);
			tarea.setIdTarea(null);
			tareaServicio.guardarTarea(tarea);
			mostrarMensaje("Éxito", "Tarea agregada correctamente.");
			limpiarFormulario();
			listarTareas();
		}
	}
	
	public void cargarTareaFormulario() {
		var tareaSeleccionada = tareaTabla.getSelectionModel().getSelectedItem();
		if(tareaSeleccionada != null) {
			idTareaInterno = tareaSeleccionada.getIdTarea();
			nombreTareaTexto.setText(tareaSeleccionada.getNombreTarea());
			responsableTexto.setText(tareaSeleccionada.getResponsable());
			estatusTexto.setText(tareaSeleccionada.getEstatus());
		}
		
	}

	public void limpiarFormulario() {
		idTareaInterno = null;
		nombreTareaTexto.clear();
		responsableTexto.clear();
		estatusTexto.clear();
		
	}

	private void recolectarDatosFormulario(Tarea tarea) {
		tarea.setNombreTarea(nombreTareaTexto.getText());
		tarea.setResponsable(responsableTexto.getText());
		tarea.setEstatus(estatusTexto.getText());
		if (idTareaInterno != null) {
			tarea.setIdTarea(idTareaInterno);
		}
	}
	
	@FXML
	private void modificarTarea() {
		if(idTareaInterno == null) {
			mostrarMensaje("Error", "Seleccione una tarea para modificar.");
			return;
		}
		if(nombreTareaTexto.getText().isEmpty()) {
			mostrarMensaje("Eror Validación", "El nombre de la tarea es obligatorio.");
			nombreTareaTexto.requestFocus();
			return;
		}
		var tarea = new Tarea();
		recolectarDatosFormulario(tarea);
		tareaServicio.guardarTarea(tarea);
		mostrarMensaje("Éxito", "Tarea modificada correctamente.");
		limpiarFormulario();
		listarTareas();
	}
	
	private void mostrarMensaje(String titulo, String mensaje) {
		Alert alerta = new Alert(Alert.AlertType.INFORMATION);
		alerta.setTitle(titulo);
		alerta.setHeaderText(null);
		alerta.setContentText(mensaje);
		alerta.showAndWait();
	}
	
	public void eliminarTarea() {
		var tareaSeleccionada = tareaTabla.getSelectionModel().getSelectedItem();
		if(tareaSeleccionada != null) {
			logger.info("Registro a eliminar "+ tareaSeleccionada.getIdTarea());
			tareaServicio.eliminarTarea(tareaSeleccionada.getIdTarea());
			mostrarMensaje("Éxito", "Tarea eliminada correctamente.");
			limpiarFormulario();
			listarTareas();
			
		}else {
			mostrarMensaje("Error", "Seleccione una tarea para eliminar.");
		}
	}
	
}