package capitulo07AccesoDatos.jpa;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import capitulo07AccesoDatos.jpa.paneles.PanelClientes;
import capitulo07AccesoDatos.jpa.paneles.PanelCoches;
import capitulo07AccesoDatos.jpa.paneles.PanelConcesionario;
import capitulo07AccesoDatos.jpa.paneles.PanelFabricantes;
import capitulo07AccesoDatos.jpa.paneles.PanelVenta;

public class VentanaPrincipal extends JFrame {
	
private JTabbedPane jTabbedPane = null;
	
	private static VentanaPrincipal instance = null;
	
	/**
	 * 
	 * @return
	 */
	public static VentanaPrincipal getInstance () {
		if (instance == null) {
			instance = new VentanaPrincipal();
		}
		return instance;
	}
	
	/**
	 * 
	 */
	public VentanaPrincipal() {
		super("Gestión de venta de coches");
		this.setBounds(0, 0, 600, 400);
		
		this.setJMenuBar(new MenuBar());
		
		this.setLayout(new BorderLayout());
		this.add(getPanelPrincipal(), BorderLayout.CENTER);
	}

	/**
	 * 
	 * @return
	 */
	private JTabbedPane getPanelPrincipal() {
		jTabbedPane = new JTabbedPane();
		
		jTabbedPane.add("Fabricantes", new PanelFabricantes());
		jTabbedPane.add("Coches", new PanelCoches());
		jTabbedPane.add("Clientes", new PanelClientes());
		jTabbedPane.add("Concesionario", new PanelConcesionario());
		jTabbedPane.add("Venta", new PanelVenta());
		
		return jTabbedPane;
	}
	
	
	
	
	
	/**
	 * @return the jTabbedPane
	 */
	public JTabbedPane getjTabbedPane() {
		return jTabbedPane;
	}


	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		VentanaPrincipal.getInstance().setVisible(true);
	}

}
