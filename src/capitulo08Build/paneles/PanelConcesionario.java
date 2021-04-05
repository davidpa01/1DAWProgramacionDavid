package capitulo08Build.paneles;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import capitulo08Build.clases.Concesionario;
import capitulo08Build.controladores.ControladorCliente;
import capitulo08Build.controladores.ControladorConcesionario;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelConcesionario extends JPanel {
	

	Concesionario actual = new Concesionario();
	
	private JTextField jtfId;
	private JTextField jtfCif;
	private JTextField jtfNombre;
	private JTextField jtfLocalidad;

	
	

	/**
	 * Initialize the contents of the frame.
	 */
	public PanelConcesionario() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		this.setLayout(gridBagLayout);
		
		JLabel jlbId = new JLabel("Id: ");
		GridBagConstraints gbc_jlbId = new GridBagConstraints();
		gbc_jlbId.anchor = GridBagConstraints.EAST;
		gbc_jlbId.insets = new Insets(0, 0, 5, 5);
		gbc_jlbId.gridx = 0;
		gbc_jlbId.gridy = 0;
		this.add(jlbId, gbc_jlbId);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		jtfId.setEditable(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 0;
		this.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel jlbCif = new JLabel("Cif: ");
		GridBagConstraints gbc_jlbCif = new GridBagConstraints();
		gbc_jlbCif.anchor = GridBagConstraints.EAST;
		gbc_jlbCif.insets = new Insets(0, 0, 5, 5);
		gbc_jlbCif.gridx = 0;
		gbc_jlbCif.gridy = 1;
		this.add(jlbCif, gbc_jlbCif);
		
		jtfCif = new JTextField();
		GridBagConstraints gbc_jtfCif = new GridBagConstraints();
		gbc_jtfCif.insets = new Insets(0, 0, 5, 0);
		gbc_jtfCif.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfCif.gridx = 1;
		gbc_jtfCif.gridy = 1;
		this.add(jtfCif, gbc_jtfCif);
		jtfCif.setColumns(10);
		
		JLabel jlbNombre = new JLabel("Nombre: ");
		GridBagConstraints gbc_jlbNombre = new GridBagConstraints();
		gbc_jlbNombre.anchor = GridBagConstraints.EAST;
		gbc_jlbNombre.insets = new Insets(0, 0, 5, 5);
		gbc_jlbNombre.gridx = 0;
		gbc_jlbNombre.gridy = 2;
		this.add(jlbNombre, gbc_jlbNombre);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 2;
		this.add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JLabel jlbLocalidad = new JLabel("Localidad");
		GridBagConstraints gbc_jlbLocalidad = new GridBagConstraints();
		gbc_jlbLocalidad.anchor = GridBagConstraints.EAST;
		gbc_jlbLocalidad.insets = new Insets(0, 0, 5, 5);
		gbc_jlbLocalidad.gridx = 0;
		gbc_jlbLocalidad.gridy = 3;
		this.add(jlbLocalidad, gbc_jlbLocalidad);
		
		jtfLocalidad = new JTextField();
		GridBagConstraints gbc_jtfLocalidad = new GridBagConstraints();
		gbc_jtfLocalidad.insets = new Insets(0, 0, 5, 0);
		gbc_jtfLocalidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfLocalidad.gridx = 1;
		gbc_jtfLocalidad.gridy = 3;
		this.add(jtfLocalidad, gbc_jtfLocalidad);
		jtfLocalidad.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 4;
		this.add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnPrimero = new JButton("<<");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorConcesionario.getInstance().findPrimero();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnPrimero);
		
		JButton btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorConcesionario.getInstance().findAnterior(actual.getId());
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
				actual = ControladorConcesionario.getInstance().findSiguiente(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnSiguiente);
		
		JButton btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorConcesionario.getInstance().findUltimo();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnUltimo);
		
		
		this.actual = ControladorConcesionario.getInstance().findPrimero();
		cargarActualEnPantalla();
	}

	
	
	
	private void cargarActualEnPantalla() {
		if (this.actual != null) {
			this.jtfId.setText("" + this.actual.getId());
			this.jtfCif.setText(this.actual.getCif());
			this.jtfNombre.setText(this.actual.getNombre());
			this.jtfLocalidad.setText(this.actual.getLocalidad());

			
		}
	}

	
	
	private void cargarActualDesdePantalla() {
		this.actual.setId(Integer.parseInt(jtfId.getText()));
		this.actual.setNombre(jtfNombre.getText());
		this.actual.setLocalidad(jtfLocalidad.getText());
	}
	
	/**
	 * 
	 */
	private void guardar() {
		cargarActualDesdePantalla();
		
		if (this.actual.getId() != 0) { // Modificacion
			int regsAfectados = ControladorConcesionario.getInstance().modificar(this.actual);
			if (regsAfectados > 0) {
				JOptionPane.showMessageDialog(this, "Registro modificado correctamente");
			}
		} else { // Nuevo alta
			int idNuevoReg = ControladorConcesionario.getInstance().nuevo(this.actual);
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
		this.jtfCif.setText("");
		this.jtfNombre.setText("");
		this.jtfLocalidad.setText("");
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
			int regsAfectados = ControladorConcesionario.getInstance().eliminar(this.actual.getId());
			if (regsAfectados > 0) {
				vaciarCampos();
				JOptionPane.showMessageDialog(this, "Eliminado correctamente");
			}
		}
	}
}
