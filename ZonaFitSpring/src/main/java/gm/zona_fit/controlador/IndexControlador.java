package gm.zona_fit.controlador;

import java.io.Serializable;
import java.util.List;

import org.primefaces.PrimeFaces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jakarta.inject.Inject;

@Named("indexControlador")
@ViewScoped
public class IndexControlador implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private IClienteServicio clienteServicio;
    private List<Cliente> clientes;
    private Cliente clienteSeleccionado;

    private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);

    @PostConstruct
    public void init() {
        this.clienteSeleccionado = new Cliente();
        cargarDatos();
    }

    public void cargarDatos() {
        this.clientes = this.clienteServicio.listarClientes();
        if (this.clientes != null) {
            this.clientes.forEach(cliente -> logger.info("Cliente: " + cliente.getNombre()));
        }
    }

    // Ajustado para coincidir con la llamada desde xhtml (sin parámetros)
    public void agregarCliente() {
        this.clienteSeleccionado = new Cliente();
    }
    // Cambiado a String para que action="#{indexControlador.guardarCliente}" funcione
    public String guardarCliente() {
		logger.info("Cliente a guardar: " + this.clienteSeleccionado);
		if(this.clienteSeleccionado.getId() == null) {
			this.clienteServicio.guardarCliente(this.clienteSeleccionado);
			this.clientes.add(this.clienteSeleccionado);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente agregado exitosamente"));
		}
		else {
			this.clienteServicio.guardarCliente(this.clienteSeleccionado);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente actualizado exitosamente"));
		}
		PrimeFaces.current().executeScript("PF('ventanaModalCliente').hide()");
		
		PrimeFaces.current().ajax().update("forma-clientes:mensajes",
				"forma-clientes:clientes-tabla");
		
		this.clienteSeleccionado = new Cliente();
		return null;
	}
    
    public String eliminarCliente() {
		logger.info("Cliente a eliminar: " + this.clienteSeleccionado);
		this.clienteServicio.eliminarCliente(this.clienteSeleccionado);
		
		this.clientes.remove(this.clienteSeleccionado);
		
		this.clienteSeleccionado = null;
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente eliminado exitosamente"));
		PrimeFaces.current().ajax().update("forma-clientes:mensajes",
				"forma-clientes:clientes-tabla");
		return null;
    }
    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente getClienteSeleccionado() {
        return clienteSeleccionado;
    }

    public void setClienteSeleccionado(Cliente clienteSeleccionado) {
        this.clienteSeleccionado = clienteSeleccionado;
    }
}