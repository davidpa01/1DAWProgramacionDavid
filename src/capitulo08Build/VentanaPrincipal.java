package capitulo08Build;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import capitulo08Build.paneles.PanelClientes;
import capitulo08Build.paneles.PanelCoches;
import capitulo08Build.paneles.PanelConcesionario;
import capitulo08Build.paneles.PanelFabricantes;
import capitulo08Build.paneles.PanelVenta;

public class VentanaPrincipal extends JFrame {
	
	private JTabbedPane jTabbedPane = null;
	
	private static VentanaPrincipal instance = null;
	
	
	public static VentanaPrincipal getInstance() {
		
		if (instance == null) {
			instance = new VentanaPrincipal();
		}
		
		return instance;
	}
	
	/**
	 * 
	 */
	public VentanaPrincipal() {
		super("Gestion de venta de coches");
		this.setBounds(0,0,600,400);
		this.add(getPanelPrincipal(),BorderLayout.CENTER);
		
		this.setJMenuBar(new MenuBar());
		
	}

	
	/**
	 * 
	 * @return
	 */
	private JTabbedPane getPanelPrincipal () {
		
		 jTabbedPane = new JTabbedPane();
		
		jTabbedPane.add("Fabricantes", new PanelFabricantes());
		jTabbedPane.add("Coches", new PanelCoches());
		jTabbedPane.add("Concesionario", new PanelConcesionario());
		jTabbedPane.add("Cliente", new PanelClientes());
		jTabbedPane.add("Ventas", new PanelVenta());


		return jTabbedPane;
	}
	
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		VentanaPrincipal.getInstance().setVisible(true);
	}

	
	
	
	
	
	

	/**
	 * @return the jTabbedPane
	 */
	public JTabbedPane getjTabbedPane() {
		return jTabbedPane;
	}


	/**
	 * @param jTabbedPane the jTabbedPane to set
	 */
	public void setjTabbedPane(JTabbedPane jTabbedPane) {
		this.jTabbedPane = jTabbedPane;
	}

	
	
	
}
