package gm.zona_fit.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.ClienteServicio;
import gm.zona_fit.servicio.IClienteServicio;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//@Component
public class ZonaFitForma extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
	
	IClienteServicio clienteServicio;
	private JTable clientesTabla;
	private DefaultTableModel modeloClientes;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtMembresia;
	private Integer idCliente;
	@Autowired
	public ZonaFitForma(ClienteServicio clienteServicio) {
		this.clienteServicio = clienteServicio;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		setLocationRelativeTo(null); 
		inicializarComponentes();

	}
	private void inicializarComponentes() {
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JLabel LabelTitulo = new JLabel("Sistema Zona Fit");
		LabelTitulo.setForeground(new Color(128, 255, 128));
		LabelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		LabelTitulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panelPrincipal.add(LabelTitulo, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panelPrincipal.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JPanel panelFormulario = new JPanel();
		panel.add(panelFormulario);
		GridBagLayout gbl_panelFormulario = new GridBagLayout();
		gbl_panelFormulario.columnWidths = new int[]{0, 0, 0};
		gbl_panelFormulario.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelFormulario.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panelFormulario.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelFormulario.setLayout(gbl_panelFormulario);
		
		JLabel LabelNombre = new JLabel("Nombre : ");
		GridBagConstraints gbc_LabelNombre = new GridBagConstraints();
		gbc_LabelNombre.anchor = GridBagConstraints.WEST;
		gbc_LabelNombre.insets = new Insets(0, 0, 5, 5);
		gbc_LabelNombre.gridx = 0;
		gbc_LabelNombre.gridy = 3;
		panelFormulario.add(LabelNombre, gbc_LabelNombre);
		
		txtNombre = new JTextField();
		txtNombre.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 0;
		gbc_txtNombre.gridy = 4;
		panelFormulario.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel LabelApellido = new JLabel("Apellido : ");
		GridBagConstraints gbc_LabelApellido = new GridBagConstraints();
		gbc_LabelApellido.anchor = GridBagConstraints.WEST;
		gbc_LabelApellido.insets = new Insets(0, 0, 5, 5);
		gbc_LabelApellido.gridx = 0;
		gbc_LabelApellido.gridy = 6;
		panelFormulario.add(LabelApellido, gbc_LabelApellido);
		
		txtApellido = new JTextField();
		GridBagConstraints gbc_txtApellido = new GridBagConstraints();
		gbc_txtApellido.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellido.gridx = 0;
		gbc_txtApellido.gridy = 7;
		panelFormulario.add(txtApellido, gbc_txtApellido);
		txtApellido.setColumns(10);
		
		JLabel LabelMembresia = new JLabel("Membresia : ");
		GridBagConstraints gbc_LabelMembresia = new GridBagConstraints();
		gbc_LabelMembresia.anchor = GridBagConstraints.WEST;
		gbc_LabelMembresia.insets = new Insets(0, 0, 5, 5);
		gbc_LabelMembresia.gridx = 0;
		gbc_LabelMembresia.gridy = 9;
		panelFormulario.add(LabelMembresia, gbc_LabelMembresia);
		
		txtMembresia = new JTextField();
		GridBagConstraints gbc_txtMembresia = new GridBagConstraints();
		gbc_txtMembresia.insets = new Insets(0, 0, 0, 5);
		gbc_txtMembresia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMembresia.gridx = 0;
		gbc_txtMembresia.gridy = 10;
		panelFormulario.add(txtMembresia, gbc_txtMembresia);
		txtMembresia.setColumns(10);
		
		JPanel panelTabla = new JPanel();
		panel.add(panelTabla);
		
		JScrollPane scrollPane = new JScrollPane();
		panelTabla.add(scrollPane);
		
		clientesTabla = new JTable();
		clientesTabla.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				cargarClienteSeleccionado();
			}

			private void cargarClienteSeleccionado() {
				var renglon = clientesTabla.getSelectedRow();
				if(renglon != -1) {
					var id = clientesTabla.getModel().getValueAt(renglon, 0).toString();
					idCliente = Integer.parseInt(id);
					var nombre = clientesTabla.getModel().getValueAt(renglon, 1).toString();
					txtNombre.setText(nombre);
					var apellido = clientesTabla.getModel().getValueAt(renglon, 2).toString();
					txtApellido.setText(apellido);
					var membresia = clientesTabla.getModel().getValueAt(renglon, 3).toString();
					txtMembresia.setText(membresia);
				}
			}
		});
		scrollPane.setViewportView(clientesTabla);
		
        listarClientesEnTabla();
		java.awt.Component horizontalStrut = Box.createHorizontalStrut(50);
		panelPrincipal.add(horizontalStrut, BorderLayout.WEST);
		
		java.awt.Component horizontalStrut_1 = Box.createHorizontalStrut(50);
		panelPrincipal.add(horizontalStrut_1, BorderLayout.EAST);
		
		JPanel panelBotones = new JPanel();
		panelPrincipal.add(panelBotones, BorderLayout.SOUTH);
		panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.X_AXIS));
		
		java.awt.Component verticalStrut = Box.createVerticalStrut(80);
		panelBotones.add(verticalStrut);
		
		java.awt.Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		panelBotones.add(horizontalStrut_4);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarCliente();
			}

			private void guardarCliente() {
				if(txtNombre.getText().equals("")) {
					mostrarMensaje("El nombre es obligatorio");
					txtNombre.requestFocusInWindow();
					return;
				}
				if(txtApellido.getText().equals("")) {
					mostrarMensaje("El apellido es obligatorio");
					txtApellido.requestFocusInWindow();
					return;
				}
				if(txtMembresia.getText().equals("")) {
					mostrarMensaje("La membresia es obligatoria");
					txtMembresia.requestFocusInWindow();
					return;
				}
				var nombre = txtNombre.getText();
				var apellido = txtApellido.getText();
				var membresia = Integer.parseInt(txtMembresia.getText());
				var cliente = new Cliente();
				cliente.setId(idCliente);
				cliente.setNombre(nombre);
				cliente.setApellido(apellido);
				cliente.setMembresia(membresia);
				clienteServicio.guardarCliente(cliente);
				if(idCliente == null) {
					mostrarMensaje("Cliente guardado con exito");
				}else {
					mostrarMensaje("Cliente modificado con exito");
					idCliente = null;
				}
				limpiarFormulario();
				listarClientesEnTabla();
			}



			
		});
		btnGuardar.setForeground(new Color(0, 0, 0));
		btnGuardar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnGuardar.setBackground(new Color(128, 255, 128));
		panelBotones.add(btnGuardar);
		
		java.awt.Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panelBotones.add(horizontalStrut_2);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarCliente();
			}

			private void eliminarCliente() {
				
				var renglon = clientesTabla.getSelectedRow();
				if(renglon != -1) {
					var id = clientesTabla.getModel().getValueAt(renglon, 0).toString();
					idCliente = Integer.parseInt(id);
					var cliente = new Cliente();
					cliente.setId(idCliente);
					clienteServicio.eliminarCliente(cliente);
					mostrarMensaje("Cliente "+id+" eliminado con exito");
					limpiarFormulario();
					listarClientesEnTabla();
				}else {
					mostrarMensaje("Debe seleccionar un cliente");
				}
			}
		});
		btnEliminar.setForeground(new Color(0, 0, 0));
		btnEliminar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnEliminar.setBackground(new Color(128, 255, 128));
		panelBotones.add(btnEliminar);
		
		java.awt.Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		panelBotones.add(horizontalStrut_3);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarFormulario();
			}

		
		});
		btnLimpiar.setForeground(new Color(0, 0, 0));
		btnLimpiar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnLimpiar.setBackground(new Color(128, 255, 128));
		panelBotones.add(btnLimpiar);
		
		java.awt.Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		panelBotones.add(horizontalStrut_5);
		
		java.awt.Component verticalStrut_1 = Box.createVerticalStrut(80);
		panelBotones.add(verticalStrut_1);
		
	}
	private void listarClientesEnTabla() {
	    this.modeloClientes = new DefaultTableModel(0, 4) {
	    	@Override
	    	public boolean isCellEditable(int row, int column) {
	    		return false; // Deshabilitar la edición de celdas
	    	}
	    };
	    String[] cabecera = new String[] {"ID", "Nombre", "Apellido", "Membresia"};
	    this.modeloClientes.setColumnIdentifiers(cabecera);
	    this.clientesTabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    // Asignar el modelo directamente a la tabla existente
	    this.clientesTabla.setModel(this.modeloClientes);
	    
	    // Llenar la tabla con los datos de los clientes
	    listarClientes();
	}
	private void listarClientes() {
		this.modeloClientes.setRowCount(0);
		var clientes = this.clienteServicio.listarClientes();   
		clientes.forEach(cliente -> {
			Object[] renglonCliente = {
					cliente.getId(),
					cliente.getNombre(),
					cliente.getApellido(),
					cliente.getMembresia()
			};
			this.modeloClientes.addRow(renglonCliente);
		});
	}
	private void limpiarFormulario() {
		txtNombre.setText("");
		txtApellido.setText("");
		txtMembresia.setText("");
		idCliente = null;
		clientesTabla.getSelectionModel().clearSelection();
	}
	private void mostrarMensaje(String string) {
		JOptionPane.showMessageDialog(ZonaFitForma.this, string);
	}
	
}