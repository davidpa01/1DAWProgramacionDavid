package capitulo08Build.paneles;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import capitulo08Build.clases.Cliente;
import capitulo08Build.clases.Coche;
import capitulo08Build.clases.Concesionario;
import capitulo08Build.clases.Fabricante;
import capitulo08Build.clases.Venta;
import capitulo08Build.controladores.ControladorCliente;
import capitulo08Build.controladores.ControladorCoche;
import capitulo08Build.controladores.ControladorConcesionario;
import capitulo08Build.controladores.ControladorFabricante;
import capitulo08Build.controladores.ControladorVenta;

import javax.swing.JComboBox;


public class PanelVenta extends JPanel {

	
	Venta actual = new Venta();

	
	
	private JTextField jtfId;
	private JTextField jtfFecha;
	private JTextField jtfPrecioVenta;
	private JComboBox<Coche> jcbIdCoche;
	private JComboBox<Concesionario> jcbIdCocesionario;
	private JComboBox<Cliente> jcbIdCliente;
	
	private SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");



	/**
	 * Create the application.
	 */
	public PanelVenta() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 10, 12, 110, 0};
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
		
		JLabel jlbIdCliente = new JLabel("Cliente");
		GridBagConstraints gbc_jlbIdCliente = new GridBagConstraints();
		gbc_jlbIdCliente.anchor = GridBagConstraints.EAST;
		gbc_jlbIdCliente.insets = new Insets(0, 0, 5, 5);
		gbc_jlbIdCliente.gridx = 0;
		gbc_jlbIdCliente.gridy = 1;
		add(jlbIdCliente, gbc_jlbIdCliente);
		
		jcbIdCliente = new JComboBox();
		GridBagConstraints gbc_jcbIdCliente = new GridBagConstraints();
		gbc_jcbIdCliente.insets = new Insets(0, 0, 5, 0);
		gbc_jcbIdCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbIdCliente.gridx = 1;
		gbc_jcbIdCliente.gridy = 1;
		add(jcbIdCliente, gbc_jcbIdCliente);
		
		JLabel jlbIdConcesionario = new JLabel("Concesionario");
		GridBagConstraints gbc_jlbIdConcesionario = new GridBagConstraints();
		gbc_jlbIdConcesionario.anchor = GridBagConstraints.EAST;
		gbc_jlbIdConcesionario.insets = new Insets(0, 0, 5, 5);
		gbc_jlbIdConcesionario.gridx = 0;
		gbc_jlbIdConcesionario.gridy = 2;
		add(jlbIdConcesionario, gbc_jlbIdConcesionario);
		
		jcbIdCocesionario = new JComboBox();
		GridBagConstraints gbc_jcbIdCocesionario = new GridBagConstraints();
		gbc_jcbIdCocesionario.insets = new Insets(0, 0, 5, 0);
		gbc_jcbIdCocesionario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbIdCocesionario.gridx = 1;
		gbc_jcbIdCocesionario.gridy = 2;
		add(jcbIdCocesionario, gbc_jcbIdCocesionario);
		
		JLabel jlbIdCoche = new JLabel("Coche");
		GridBagConstraints gbc_jlbIdCoche = new GridBagConstraints();
		gbc_jlbIdCoche.insets = new Insets(0, 0, 5, 5);
		gbc_jlbIdCoche.anchor = GridBagConstraints.EAST;
		gbc_jlbIdCoche.gridx = 0;
		gbc_jlbIdCoche.gridy = 3;
		add(jlbIdCoche, gbc_jlbIdCoche);
		
		jcbIdCoche = new JComboBox();
		GridBagConstraints gbc_jcbIdCoche = new GridBagConstraints();
		gbc_jcbIdCoche.insets = new Insets(0, 0, 5, 0);
		gbc_jcbIdCoche.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbIdCoche.gridx = 1;
		gbc_jcbIdCoche.gridy = 3;
		add(jcbIdCoche, gbc_jcbIdCoche);
		
		JLabel jlbFecha = new JLabel("Fecha_nac: ");
		GridBagConstraints gbc_jlbFecha = new GridBagConstraints();
		gbc_jlbFecha.anchor = GridBagConstraints.EAST;
		gbc_jlbFecha.insets = new Insets(0, 0, 5, 5);
		gbc_jlbFecha.gridx = 0;
		gbc_jlbFecha.gridy = 4;
		add(jlbFecha, gbc_jlbFecha);
		
		jtfFecha = new JTextField();
		GridBagConstraints gbc_jtfFecha = new GridBagConstraints();
		gbc_jtfFecha.insets = new Insets(0, 0, 5, 0);
		gbc_jtfFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFecha.gridx = 1;
		gbc_jtfFecha.gridy = 4;
		add(jtfFecha, gbc_jtfFecha);
		jtfFecha.setColumns(10);
		
		JLabel jlbPrecioVenta = new JLabel("Precio Venta:");
		GridBagConstraints gbc_jlbPrecioVenta = new GridBagConstraints();
		gbc_jlbPrecioVenta.anchor = GridBagConstraints.EAST;
		gbc_jlbPrecioVenta.insets = new Insets(0, 0, 5, 5);
		gbc_jlbPrecioVenta.gridx = 0;
		gbc_jlbPrecioVenta.gridy = 5;
		add(jlbPrecioVenta, gbc_jlbPrecioVenta);
		
		jtfPrecioVenta = new JTextField();
		GridBagConstraints gbc_jtfPrecioVenta = new GridBagConstraints();
		gbc_jtfPrecioVenta.insets = new Insets(0, 0, 5, 0);
		gbc_jtfPrecioVenta.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfPrecioVenta.gridx = 1;
		gbc_jtfPrecioVenta.gridy = 5;
		add(jtfPrecioVenta, gbc_jtfPrecioVenta);
		jtfPrecioVenta.setColumns(10);
		
				
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridwidth = 3;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 6;
		add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnPrimero = new JButton("<<");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorVenta.getInstance().findPrimero();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnPrimero);
		
		JButton btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorVenta.getInstance().findAnterior(actual.getId());
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
				actual = ControladorVenta.getInstance().findSiguiente(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnSiguiente);
		
		JButton btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorVenta.getInstance().findUltimo();
				cargarActualEnPantalla();
			}
		});
		
		
		panel.add(btnUltimo);
		
		
		cargarDatosCliente();
		cargarDatosCoches();
		cargarDatosConcesionario();
		
		this.actual = ControladorVenta.getInstance().findPrimero();
		
		cargarActualEnPantalla();
	}

	
	/**
	 * 
	 */
	private void cargarDatosCliente() {
		List<Cliente> cliente = ControladorCliente.getInstance().findAll();
		
		for(Cliente c : cliente) {
			this.jcbIdCliente.addItem(c);
		}
		
	}
	
	/**
	 * 
	 */
	private void cargarDatosConcesionario() {
		List<Concesionario> concesionario = ControladorConcesionario.getInstance().findAll();
		
		for(Concesionario c : concesionario) {
			this.jcbIdCocesionario.addItem(c);
		}
		
	}
	
	/**
	 * 
	 */
	private void cargarDatosCoches() {
		List<Coche> coche = ControladorCoche.getInstance().findAll();
		
		for(Coche c : coche) {
			this.jcbIdCoche.addItem(c);
		}
		
	}
	
	/**
	 * 
	 */
	private void cargarActualEnPantalla() {
		if (this.actual != null) {
			this.jtfId.setText("" + this.actual.getId());
			this.jtfFecha.setText(this.formatoFecha.format(this.actual.getFecha()));
			this.jtfPrecioVenta.setText("" + this.actual.getPrecioVenta());
			
			for (int i = 0; i < this.jcbIdCliente.getItemCount(); i++) {
				if (this.actual.getIdCliente() == this.jcbIdCliente.getItemAt(i).getId()) {
					this.jcbIdCliente.setSelectedIndex(i);
				}
			}
			
			for (int i = 0; i < this.jcbIdCocesionario.getItemCount(); i++) {
				if (this.actual.getIdConcesionario() == this.jcbIdCocesionario.getItemAt(i).getId()) {
					this.jcbIdCocesionario.setSelectedIndex(i);
				}
			}
			
			for (int i = 0; i < this.jcbIdCoche.getItemCount(); i++) {
				if (this.actual.getIdCoche() == this.jcbIdCoche.getItemAt(i).getId()) {
					this.jcbIdCoche.setSelectedIndex(i);
				}
			}

			
		}
	}
	

	/**
	 * 
	 */
	private void cargarActualDesdePantalla() {
		this.actual.setId(Integer.parseInt(jtfId.getText()));
		this.actual.setIdCliente(jcbIdCliente.getSelectedIndex());
		this.actual.setIdCoche(jcbIdCoche.getSelectedIndex());
		this.actual.setIdConcesionario(jcbIdCocesionario.getSelectedIndex());
		
		try {
			this.actual.setFecha(this.formatoFecha.parse(this.jtfFecha.getText()));
		} catch (Exception e) {
			e.printStackTrace();
		}		
		this.actual.setPrecioVenta(Double.parseDouble(jtfPrecioVenta.getText()));
	}
	
	
	/**
	 * 
	 */
	private void guardar() {
		cargarActualDesdePantalla();
		
		if (this.actual.getId() != 0) { // Modificacion
			int regsAfectados = ControladorVenta.getInstance().modificar(this.actual);
			if (regsAfectados > 0) {
				JOptionPane.showMessageDialog(this, "Registro modificado correctamente");
			}
		} else { // Nuevo alta
			int idNuevoReg = ControladorVenta.getInstance().nuevo(this.actual);
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
		this.jcbIdCliente.setSelectedIndex(0);
		this.jcbIdCocesionario.setSelectedIndex(0);
		this.jcbIdCoche.setSelectedIndex(0);
		this.jtfFecha.setText("");
		this.jtfPrecioVenta.setText("");
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
			int regsAfectados = ControladorVenta.getInstance().eliminar(this.actual.getId());
			if (regsAfectados > 0) {
				vaciarCampos();
				JOptionPane.showMessageDialog(this, "Eliminado correctamente");
			}
		}
	}
	

}
