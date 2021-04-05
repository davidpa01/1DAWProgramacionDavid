package capitulo08Build.paneles;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;

import capitulo08Build.clases.Coche;
import capitulo08Build.clases.Fabricante;
import capitulo08Build.controladores.ControladorCoche;
import capitulo08Build.controladores.ControladorFabricante;
import capitulo08Build.controladores.ControladorVenta;

import java.awt.Insets;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class PanelCoches extends JPanel {
	
	
	Coche actual = new Coche();
	
	private JTextField jtfId;
	private JTextField jtfBastidor;
	private JTextField jtfModelo;
	private JTextField jtfColor;
	private JComboBox<Fabricante> comboBox;
	
	
	
	
	

	/**
	 * Create the panel.
	 */
	public PanelCoches() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel jlbId = new JLabel("Id: ");
		GridBagConstraints gbc_jlbId = new GridBagConstraints();
		gbc_jlbId.insets = new Insets(0, 0, 5, 5);
		gbc_jlbId.anchor = GridBagConstraints.EAST;
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
		
		JLabel jlbIdFabricante = new JLabel("Id Fabricante: ");
		GridBagConstraints gbc_jlbIdFabricante = new GridBagConstraints();
		gbc_jlbIdFabricante.anchor = GridBagConstraints.EAST;
		gbc_jlbIdFabricante.insets = new Insets(0, 0, 5, 5);
		gbc_jlbIdFabricante.gridx = 0;
		gbc_jlbIdFabricante.gridy = 1;
		add(jlbIdFabricante, gbc_jlbIdFabricante);
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 1;
		add(comboBox, gbc_comboBox);
		
		JLabel jlbBastidor = new JLabel("Bastidor");
		GridBagConstraints gbc_jlbBastidor = new GridBagConstraints();
		gbc_jlbBastidor.anchor = GridBagConstraints.EAST;
		gbc_jlbBastidor.insets = new Insets(0, 0, 5, 5);
		gbc_jlbBastidor.gridx = 0;
		gbc_jlbBastidor.gridy = 2;
		add(jlbBastidor, gbc_jlbBastidor);
		
		jtfBastidor = new JTextField();
		GridBagConstraints gbc_jtfBastidor = new GridBagConstraints();
		gbc_jtfBastidor.insets = new Insets(0, 0, 5, 0);
		gbc_jtfBastidor.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfBastidor.gridx = 1;
		gbc_jtfBastidor.gridy = 2;
		add(jtfBastidor, gbc_jtfBastidor);
		jtfBastidor.setColumns(10);
		
		JLabel jlbModelo = new JLabel("Modelo");
		GridBagConstraints gbc_jlbModelo = new GridBagConstraints();
		gbc_jlbModelo.anchor = GridBagConstraints.EAST;
		gbc_jlbModelo.insets = new Insets(0, 0, 5, 5);
		gbc_jlbModelo.gridx = 0;
		gbc_jlbModelo.gridy = 3;
		add(jlbModelo, gbc_jlbModelo);
		
		jtfModelo = new JTextField();
		GridBagConstraints gbc_jtfModelo = new GridBagConstraints();
		gbc_jtfModelo.insets = new Insets(0, 0, 5, 0);
		gbc_jtfModelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfModelo.gridx = 1;
		gbc_jtfModelo.gridy = 3;
		add(jtfModelo, gbc_jtfModelo);
		jtfModelo.setColumns(10);
		
		JLabel jlbColor = new JLabel("Color");
		GridBagConstraints gbc_jlbColor = new GridBagConstraints();
		gbc_jlbColor.insets = new Insets(0, 0, 5, 5);
		gbc_jlbColor.anchor = GridBagConstraints.EAST;
		gbc_jlbColor.gridx = 0;
		gbc_jlbColor.gridy = 4;
		add(jlbColor, gbc_jlbColor);
		
		jtfColor = new JTextField();
		GridBagConstraints gbc_jtfColor = new GridBagConstraints();
		gbc_jtfColor.insets = new Insets(0, 0, 5, 0);
		gbc_jtfColor.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfColor.gridx = 1;
		gbc_jtfColor.gridy = 4;
		add(jtfColor, gbc_jtfColor);
		jtfColor.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 5;
		add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnPrimero = new JButton("<<");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCoche.getInstance().findPrimero();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnPrimero);
		
		JButton btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCoche.getInstance().findAnterior(actual.getId());
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
				actual = ControladorCoche.getInstance().findSiguiente(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnSiguiente);
		
		JButton btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCoche.getInstance().findUltimo();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnUltimo);
		
		
		
		cargarDatosFabricantes();
		this.actual = ControladorCoche.getInstance().findPrimero();
		cargarActualEnPantalla();


	}
	
	/**
	 * 
	 */
	private void cargarDatosFabricantes() {
		List<Fabricante> fabricantes = ControladorFabricante.getInstance().findAll();
		
		for(Fabricante f : fabricantes) {
			this.comboBox.addItem(f);
		}
		
	}

	
	/**
	 * 
	 */
	private void cargarActualEnPantalla() {
		if (this.actual != null) {
			this.jtfId.setText("" + this.actual.getId());
			this.jtfBastidor.setText(this.actual.getBastidor());
			this.jtfModelo.setText(this.actual.getModelo());
			this.jtfColor.setText(this.actual.getColor());

			//Carga del fabricante
			for (int i = 0; i < this.comboBox.getItemCount(); i++) {
				if (this.actual.getIdFabricante() == this.comboBox.getItemAt(i).getId()) {
					this.comboBox.setSelectedIndex(i);
				}
			}
			
		}
	}
	
	
	/**
	 * 
	 */
	private void cargarActualDesdePantalla() {
		this.actual.setId(Integer.parseInt(jtfId.getText()));
		this.actual.setIdFabricante(comboBox.getSelectedIndex());
		this.actual.setBastidor(jtfBastidor.getText());
		this.actual.setModelo(jtfModelo.getText());
		this.actual.setColor(jtfColor.getText());

	}
	
	
	
	/**
	 * 
	 */
	private void guardar() {
		cargarActualDesdePantalla();
		
		if (this.actual.getId() != 0) { // Modificacion
			int regsAfectados = ControladorCoche.getInstance().modificar(this.actual);
			if (regsAfectados > 0) {
				JOptionPane.showMessageDialog(this, "Registro modificado correctamente");
			}
		} else { // Nuevo alta
			int idNuevoReg = ControladorCoche.getInstance().nuevo(this.actual);
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
		this.comboBox.setSelectedIndex(0);
		this.jtfBastidor.setText("");
		this.jtfModelo.setText("");
		this.jtfColor.setText("");
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
			int regsAfectados = ControladorCoche.getInstance().eliminar(this.actual.getId());
			if (regsAfectados > 0) {
				vaciarCampos();
				JOptionPane.showMessageDialog(this, "Eliminado correctamente");
			}
		}
	}

	
}
