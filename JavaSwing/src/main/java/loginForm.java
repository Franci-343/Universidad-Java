import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class loginForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel PanelPrincipal;
	private JTextField usuarioText;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		FlatDarculaLaf.setup();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginForm frame = new loginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void validar() {
		var usuario = this.usuarioText.getText();
		var password = new String(this.password.getPassword());
		System.out.println(usuario);
		System.out.println(password);
		if("root".equals(usuario) && "admin".equals(password)) {
			mostrarMensaje("Login correcto, Bienvenido");
		}else if("root".equals(usuario)) {
			mostrarMensaje("Contraseña incorrecta");
		}else {
			mostrarMensaje("Usuario incorrecto");
		}
	}

	private void mostrarMensaje(String string) {
		JOptionPane.showMessageDialog(this, string);
		
	}
	/**
	 * Create the frame.
	 */
	public loginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		setLocationRelativeTo(null);
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		PanelPrincipal.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		panel.add(lblNewLabel);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		PanelPrincipal.add(horizontalStrut, BorderLayout.WEST);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		PanelPrincipal.add(horizontalStrut_1, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		PanelPrincipal.add(panel_1, BorderLayout.CENTER);
		
		JLabel Usuario = new JLabel("USUARIO");
		
		usuarioText = new JTextField();
		usuarioText.setColumns(10);
		
		JLabel contraseña = new JLabel("CONTRASEÑA");
		
		JButton enviar = new JButton("ENVIAR");
		enviar.setForeground(new Color(255, 255, 255));
		enviar.setBackground(new Color(255, 0, 0));
		enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validar();
			}
		});
		
		password = new JPasswordField();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(180)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(usuarioText, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
								.addComponent(password)
								.addComponent(Usuario, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
								.addComponent(contraseña, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(211)
							.addComponent(enviar, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(190, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(45)
					.addComponent(Usuario)
					.addGap(16)
					.addComponent(usuarioText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(contraseña)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(password, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(enviar)
					.addContainerGap(99, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		Component verticalStrut = Box.createVerticalStrut(32);
		PanelPrincipal.add(verticalStrut, BorderLayout.SOUTH);

	}

	
}
