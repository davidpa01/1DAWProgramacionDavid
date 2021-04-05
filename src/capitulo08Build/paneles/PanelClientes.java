package capitulo08Build.paneles;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import capitulo08Build.clases.Cliente;
import capitulo08Build.clases.Coche;
import capitulo08Build.controladores.ControladorCliente;
import capitulo08Build.controladores.ControladorCoche;

import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class PanelClientes extends JPanel {
	
	
	
	Cliente actual = new Cliente();

	
	
	private JTextField jtfId;
	private JTextField jtfNombre;
	private JTextField jtfApellido;
	private JTextField jtfLocalidad;
	private JTextField jtfDniNie;
	private JTextField jtfFecha;
	private JCheckBox jchbActivo;
	
	private SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");




	/**
	 * Create the application.
	 */
	public PanelClientes() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 71, 110, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel jlbId = new JLabel("Id: ");
		GridBagConstraints gbc_jlbId = new GridBagConstraints();
		gbc_jlbId.anchor = GridBagConstraints.EAST;
		gbc_jlbId.insets = new Insets(0, 0, 5, 5);
		gbc_jlbId.gridx = 0;
		gbc_jlbId.gridy = 0;
		add(jlbId, gbc_jlbId);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		jtfId.setEditable(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 0;
		add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel jlbNombre = new JLabel("Nombre");
		GridBagConstraints gbc_jlbNombre = new GridBagConstraints();
		gbc_jlbNombre.anchor = GridBagConstraints.EAST;
		gbc_jlbNombre.insets = new Insets(0, 0, 5, 5);
		gbc_jlbNombre.gridx = 0;
		gbc_jlbNombre.gridy = 1;
		add(jlbNombre, gbc_jlbNombre);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 1;
		add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JLabel jlbApellido = new JLabel("Apellido: ");
		GridBagConstraints gbc_jlbApellido = new GridBagConstraints();
		gbc_jlbApellido.anchor = GridBagConstraints.EAST;
		gbc_jlbApellido.insets = new Insets(0, 0, 5, 5);
		gbc_jlbApellido.gridx = 0;
		gbc_jlbApellido.gridy = 2;
		add(jlbApellido, gbc_jlbApellido);
		
		jtfApellido = new JTextField();
		GridBagConstraints gbc_jtfApellido = new GridBagConstraints();
		gbc_jtfApellido.insets = new Insets(0, 0, 5, 0);
		gbc_jtfApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellido.gridx = 1;
		gbc_jtfApellido.gridy = 2;
		add(jtfApellido, gbc_jtfApellido);
		jtfApellido.setColumns(10);
		
		JLabel jlbLocalidad = new JLabel("Localidad: ");
		GridBagConstraints gbc_jlbLocalidad = new GridBagConstraints();
		gbc_jlbLocalidad.anchor = GridBagConstraints.EAST;
		gbc_jlbLocalidad.insets = new Insets(0, 0, 5, 5);
		gbc_jlbLocalidad.gridx = 0;
		gbc_jlbLocalidad.gridy = 3;
		add(jlbLocalidad, gbc_jlbLocalidad);
		
		jtfLocalidad = new JTextField();
		GridBagConstraints gbc_jtfLocalidad = new GridBagConstraints();
		gbc_jtfLocalidad.insets = new Insets(0, 0, 5, 0);
		gbc_jtfLocalidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfLocalidad.gridx = 1;
		gbc_jtfLocalidad.gridy = 3;
		add(jtfLocalidad, gbc_jtfLocalidad);
		jtfLocalidad.setColumns(10);
		
		JLabel jlbDniNie = new JLabel("DniNie");
		GridBagConstraints gbc_jlbDniNie = new GridBagConstraints();
		gbc_jlbDniNie.anchor = GridBagConstraints.EAST;
		gbc_jlbDniNie.insets = new Insets(0, 0, 5, 5);
		gbc_jlbDniNie.gridx = 0;
		gbc_jlbDniNie.gridy = 4;
		add(jlbDniNie, gbc_jlbDniNie);
		
		jtfDniNie = new JTextField();
		GridBagConstraints gbc_jtfDniNie = new GridBagConstraints();
		gbc_jtfDniNie.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDniNie.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDniNie.gridx = 1;
		gbc_jtfDniNie.gridy = 4;
		add(jtfDniNie, gbc_jtfDniNie);
		jtfDniNie.setColumns(10);
		
		JLabel jlbFecha = new JLabel("Fecha_nac: ");
		GridBagConstraints gbc_jlbFecha = new GridBagConstraints();
		gbc_jlbFecha.anchor = GridBagConstraints.EAST;
		gbc_jlbFecha.insets = new Insets(0, 0, 5, 5);
		gbc_jlbFecha.gridx = 0;
		gbc_jlbFecha.gridy = 5;
		add(jlbFecha, gbc_jlbFecha);
		
		jtfFecha = new JTextField();
		GridBagConstraints gbc_jtfFecha = new GridBagConstraints();
		gbc_jtfFecha.insets = new Insets(0, 0, 5, 0);
		gbc_jtfFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFecha.gridx = 1;
		gbc_jtfFecha.gridy = 5;
		add(jtfFecha, gbc_jtfFecha);
		jtfFecha.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 6;
		add(panel_1, gbc_panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		jchbActivo = new JCheckBox("Activo");
		panel_1.add(jchbActivo);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 7;
		add(panel, gbc_panel);
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
				eliminar();
			}
		});
		panel.add(btnEliminar);
		
		JButton btnSiguiente = new JButton(">");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCliente.getInstance().findSiguiente(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnSiguiente);
		
		JButton btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCliente.getInstance().findUltimo();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnUltimo);
		
		
		this.actual = ControladorCliente.getInstance().findPrimero();
		cargarActualEnPantalla();
		
	}
	
	
	
	
	private void cargarActualEnPantalla() {
		if (this.actual != null) {
			this.jtfId.setText("" + this.actual.getId());
			this.jtfNombre.setText(this.actual.getNombre());
			this.jtfApellido.setText(this.actual.getApellido());
			this.jtfLocalidad.setText(this.actual.getLocalidad());
			this.jtfDniNie.setText(this.actual.getDniNIe());
			this.jtfFecha.setText(this.formatoFecha.format(this.actual.getFecha()));
			this.jchbActivo.setSelected(this.actual.isActivo());


			
		}
	}
	
	
	
	private void cargarActualDesdePantalla() {
		this.actual.setId(Integer.parseInt(jtfId.getText()));
		this.actual.setNombre(jtfNombre.getText());
		this.actual.setApellido(jtfApellido.getText());
		this.actual.setLocalidad(jtfLocalidad.getText());
		this.actual.setDniNIe(jtfDniNie.getText());
		try {
			
			this.actual.setFecha(this.formatoFecha.parse(this.jtfFecha.getText()));
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.actual.setActivo(jchbActivo.isSelected());
		
	}
	
	/**
	 * 
	 */
	private void guardar() {
		cargarActualDesdePantalla();
		
		if (this.actual.getId() != 0) { // Modificacion
			int regsAfectados = ControladorCliente.getInstance().modificar(this.actual);
			if (regsAfectados > 0) {
				JOptionPane.showMessageDialog(this, "Registro modificado correctamente");
			}
		} else { // Nuevo alta
			int idNuevoReg = ControladorCliente.getInstance().nuevo(this.actual);
			if (idNuevoReg > 0) {
				this.actual.setId(idNuevoReg);
				JOptionPane.showMessageDialog(this, "Registro insertado correctamente");
			}
		}
	}
	
	/**
	 * 
	 */
	private void vaciarCampos() {
		this.jtfId.setText("0");
		this.jtfNombre.setText("");
		this.jtfApellido.setText("");
		this.jtfLocalidad.setText("");
		this.jtfDniNie.setText("");
		this.jtfFecha.setText("");
		this.jchbActivo.setSelected(false);
	}
	
	/**
	 * 
	 */
	private void eliminar() {
		String posiblesRespuestas[] = {"S�","No"};
		// En esta opci�n se utiliza un showOptionDialog en el que personalizo el icono mostrado
		int opcionElegida = JOptionPane.showOptionDialog(this, "�Desea eliminar?", "Gesti�n venta de fabricantes", 
		        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, posiblesRespuestas, posiblesRespuestas[1]);
		if (opcionElegida == 0) {
			int regsAfectados = ControladorCliente.getInstance().eliminar(this.actual.getId());
			if (regsAfectados > 0) {
				vaciarCampos();
				JOptionPane.showMessageDialog(this, "Eliminado correctamente");
			}
		}
	}

	

}
