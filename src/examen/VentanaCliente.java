package examen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class VentanaCliente {

	private JFrame frame;
	private JTextField jtfId;
	private JTextField jtfNombre;
	private JTextField jtfApellidos;
	private JTextField jtfLocalidad;
	private JTextField jtfDniNie;
	private JTextField jtfEmail;
	
	Cliente actual = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCliente window = new VentanaCliente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaCliente() {
		initialize();
		this.actual = ControladorCliente.getInstance().findPrimero();
		cargarActualEnPantalla();
		
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
			
		});
	}
	
	
	
	
	private void cargarActualEnPantalla() {
		if (this.actual != null) {
			this.jtfId.setText("" + this.actual.getId());
			this.jtfNombre.setText(this.actual.getNombre());
			this.jtfApellidos.setText(this.actual.getApellidos());
			this.jtfLocalidad.setText(this.actual.getLocalidad());
			this.jtfDniNie.setText(this.actual.getDniNie());
			this.jtfEmail.setText(this.actual.getEmail());
		}
	}
	
	
	/**
	 * 
	 */
	private void cargarActualDesdePantalla() {
		this.actual.setId(Integer.parseInt(jtfId.getText()));
		this.actual.setNombre(jtfNombre.getText());
		this.actual.setApellidos(jtfApellidos.getText());
		this.actual.setLocalidad(jtfLocalidad.getText());
		this.actual.setDniNie(jtfDniNie.getText());
		this.actual.setEmail(jtfEmail.getText());

	}
	
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 517, 352);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel jlbId = new JLabel("Id: ");
		GridBagConstraints gbc_jlbId = new GridBagConstraints();
		gbc_jlbId.anchor = GridBagConstraints.EAST;
		gbc_jlbId.insets = new Insets(0, 0, 5, 5);
		gbc_jlbId.gridx = 0;
		gbc_jlbId.gridy = 0;
		frame.getContentPane().add(jlbId, gbc_jlbId);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		jtfId.setEditable(false);
		GridBagConstraints gbc_jtxId = new GridBagConstraints();
		gbc_jtxId.insets = new Insets(0, 0, 5, 0);
		gbc_jtxId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtxId.gridx = 1;
		gbc_jtxId.gridy = 0;
		frame.getContentPane().add(jtfId, gbc_jtxId);
		jtfId.setColumns(10);
		
		JLabel jlbNombre = new JLabel("Nombre: ");
		GridBagConstraints gbc_jlbNombre = new GridBagConstraints();
		gbc_jlbNombre.anchor = GridBagConstraints.EAST;
		gbc_jlbNombre.insets = new Insets(0, 0, 5, 5);
		gbc_jlbNombre.gridx = 0;
		gbc_jlbNombre.gridy = 1;
		frame.getContentPane().add(jlbNombre, gbc_jlbNombre);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 1;
		frame.getContentPane().add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JLabel jlbApellidos = new JLabel("Apellidos: ");
		GridBagConstraints gbc_jlbApellidos = new GridBagConstraints();
		gbc_jlbApellidos.anchor = GridBagConstraints.EAST;
		gbc_jlbApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_jlbApellidos.gridx = 0;
		gbc_jlbApellidos.gridy = 2;
		frame.getContentPane().add(jlbApellidos, gbc_jlbApellidos);
		
		jtfApellidos = new JTextField();
		GridBagConstraints gbc_jtfApellidos = new GridBagConstraints();
		gbc_jtfApellidos.insets = new Insets(0, 0, 5, 0);
		gbc_jtfApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellidos.gridx = 1;
		gbc_jtfApellidos.gridy = 2;
		frame.getContentPane().add(jtfApellidos, gbc_jtfApellidos);
		jtfApellidos.setColumns(10);
		
		JLabel jlbLocalidad = new JLabel("Localidad: ");
		GridBagConstraints gbc_jlbLocalidad = new GridBagConstraints();
		gbc_jlbLocalidad.anchor = GridBagConstraints.EAST;
		gbc_jlbLocalidad.insets = new Insets(0, 0, 5, 5);
		gbc_jlbLocalidad.gridx = 0;
		gbc_jlbLocalidad.gridy = 3;
		frame.getContentPane().add(jlbLocalidad, gbc_jlbLocalidad);
		
		jtfLocalidad = new JTextField();
		GridBagConstraints gbc_jtfLocalidad = new GridBagConstraints();
		gbc_jtfLocalidad.insets = new Insets(0, 0, 5, 0);
		gbc_jtfLocalidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfLocalidad.gridx = 1;
		gbc_jtfLocalidad.gridy = 3;
		frame.getContentPane().add(jtfLocalidad, gbc_jtfLocalidad);
		jtfLocalidad.setColumns(10);
		
		JLabel jlbDniNie = new JLabel("dniNie: ");
		GridBagConstraints gbc_jlbDniNie = new GridBagConstraints();
		gbc_jlbDniNie.anchor = GridBagConstraints.EAST;
		gbc_jlbDniNie.insets = new Insets(0, 0, 5, 5);
		gbc_jlbDniNie.gridx = 0;
		gbc_jlbDniNie.gridy = 4;
		frame.getContentPane().add(jlbDniNie, gbc_jlbDniNie);
		
		jtfDniNie = new JTextField();
		GridBagConstraints gbc_jtfDniNie = new GridBagConstraints();
		gbc_jtfDniNie.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDniNie.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDniNie.gridx = 1;
		gbc_jtfDniNie.gridy = 4;
		frame.getContentPane().add(jtfDniNie, gbc_jtfDniNie);
		jtfDniNie.setColumns(10);
		
		JLabel jlbEmail = new JLabel("Email: ");
		GridBagConstraints gbc_jlbEmail = new GridBagConstraints();
		gbc_jlbEmail.anchor = GridBagConstraints.EAST;
		gbc_jlbEmail.insets = new Insets(0, 0, 5, 5);
		gbc_jlbEmail.gridx = 0;
		gbc_jlbEmail.gridy = 5;
		frame.getContentPane().add(jlbEmail, gbc_jlbEmail);
		
		jtfEmail = new JTextField();
		GridBagConstraints gbc_jtfEmail = new GridBagConstraints();
		gbc_jtfEmail.insets = new Insets(0, 0, 5, 0);
		gbc_jtfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEmail.gridx = 1;
		gbc_jtfEmail.gridy = 5;
		frame.getContentPane().add(jtfEmail, gbc_jtfEmail);
		jtfEmail.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 6;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnPrimero = new JButton("<<");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCliente.getInstance().findPrimero();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnPrimero);
		
		JButton btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCliente.getInstance().findAnterior(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnAnterior);
		
		JButton btnSiguiente = new JButton(">");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCliente.getInstance().findSiguiente(actual.getId());
				cargarActualEnPantalla();
			}
		});
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vaciarCampos();
			}
		});
		panel.add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		panel.add(btnGuardar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrar();
			}
		});
		panel.add(btnEliminar);
		panel.add(btnSiguiente);
		
		JButton btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCliente.getInstance().findUltimo();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnUltimo);
	}
	
	
	/**
	 * 
	 */
	private void guardar() {
		cargarActualDesdePantalla();
		if (emailValido()) {
			if (this.actual.getId() != 0) { // Modificación
				int regsAfec = ControladorCliente.getInstance().modificar(this.actual);
				if (regsAfec > 0) {
					JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
				}
			}
			else { // nuevo
				int idNuevoReg = ControladorCliente.getInstance().nuevo(this.actual);
				if (idNuevoReg > 0) {
					this.jtfId.setText("" + idNuevoReg);
					JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
				}
			}			
		}else {
			JOptionPane.showMessageDialog(null, "El email no es válido");
		}
		
	}
	
	/**
	 * 
	 */
	private void borrar() {
		String posiblesRespuestas[] = {"Sí","No"};
		// En esta opci�n se utiliza un showOptionDialog en el que personalizo el icono mostrado
		int opcionElegida = JOptionPane.showOptionDialog(null, "¿Desea eliminar?", "Gestión venta de coches", 
		        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, posiblesRespuestas, posiblesRespuestas[1]);
	    if(opcionElegida == 0) {
	    	int regsAfectados = ControladorCliente.getInstance().borrar(this.actual.getId());
	    	if (regsAfectados > 0) {
	    		vaciarCampos();
	    		JOptionPane.showMessageDialog(null, "Eliminado correctamente");
	    	}
	    }
	}
	
	
	private boolean emailValido() {
		String str = actual.getEmail();
		int x = 0;
		if (!str.contains(" ")) {
			if (str.contains("@")) {
				x = str.indexOf("@");
				if(x < str.indexOf(".")) {
					return true;
				}
	        }
        }
		
		return false;
		
	}
	
	/**
	 * 
	 */
	private void vaciarCampos() {
		this.jtfId.setText("0");
		this.jtfNombre.setText("");
		this.jtfApellidos.setText("");
		this.jtfLocalidad.setText("");
		this.jtfDniNie.setText("");
		this.jtfEmail.setText("");
		
	}

	
	
	/**
	 * 
	 */
	private void cerrarAplicacion() {
		String [] opciones ={"Aceptar","Cancelar"};
		int eleccion = JOptionPane.showOptionDialog(frame,"¿Desea cerrar la aplicación?","Salir de la aplicación",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}
