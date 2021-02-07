package hashMap.ejercicio01;

import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;


public class Aplicacion {
	
	static HashMap<String, Articulo> hm = new HashMap<String, Articulo>();

	public static void main(String[] args) {
		
		int op = menu();
		
		do {
			switch (op) {
			case 1://añadir articulos
				añadirArticulo();
				break;
			case 2://borrar articulos
				borrarArticulo();
				break;
			case 3://actualizar estante
				actualizarEstante();
				break;
			case 4://mostrar articulos
				mostrarArticulo();
				break;
		
			default:
				System.out.println("Opción incorrecta, intentelo de nuevo.");
				break;
			}
			op = menu();
			System.out.println("");
		}while(op != 0);
	}
	
	
	
	/**
	 * metodo para añadir un articulo
	 * 
	 */
	public static void añadirArticulo() {
		String codigoBarras = JOptionPane.showInputDialog("Introduzca el código de barra");
		
		if (!hm.isEmpty()) {
			
			Iterator<Articulo> aplicacion = hm.values().iterator();
			while (aplicacion.hasNext()) {
				
				if (!codigoBarras.equals(aplicacion.next().codigoBarras)) {
					
					int numeroEstante = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de estante"));
					
					hm.put(codigoBarras, new Articulo(codigoBarras, numeroEstante));
					
					break;
					
				}else {
					añadirArticulo();
				}
			}
		}else {
			
			int numeroEstante = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de estante"));
			
			hm.put(codigoBarras, new Articulo(codigoBarras, numeroEstante));
		}
	
				
	}
	
	
	
	/**
	 * metodo para borrar un articulo
	 * 
	 */
	public static void borrarArticulo() {
		
		if (!hm.isEmpty()) {
			
			String codigoBarras = JOptionPane.showInputDialog("Introduzca el código de barra del articulo que desea eliminar");
			
			hm.remove(codigoBarras);
			
		}else {
			System.out.println("No hay ningun articulo");
		}

	}

	
	
	
	public static void actualizarEstante() {
		
		if (!hm.isEmpty()) {
			
			int numeroEstante = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de estante"));
			
			String codigoBarras = JOptionPane.showInputDialog("Introduzca el código de barra del articulo que desea modificar");
			
			Iterator<Articulo> aplicacion = hm.values().iterator();
			while (aplicacion.hasNext()) {
				
				if (codigoBarras.equals(aplicacion.next().codigoBarras)) {
					
					hm.replace(codigoBarras, new Articulo(codigoBarras, numeroEstante));
					
					break;
					
				}
			}
						
		}else {
			System.out.println("No hay ningun articulo");
		}

	}

	
	
	/**
	 * metodo que muestra el HasMap
	 */
	public static void mostrarArticulo() {
		System.out.println("\nRecorrido de los objetos del HashMap:");
		Iterator<Articulo> aplicacion = hm.values().iterator();
		while (aplicacion.hasNext()) {
			System.out.println("Objeto obtenido: "  + aplicacion.next());
		}
	}


	
	
	
	/**
	 * metodo que muestra el menu
	 * 
	 * @return
	 */
	public static int menu() {
		System.out.println("");
		System.out.println("ALMACÉN");
		System.out.println("--------");
		System.out.println("");
		System.out.println("0.-Salir del programa.");
		System.out.println("1.-Añadir articulos.");
		System.out.println("2.-Borrar articulos.");
		System.out.println("3.-Actualizar estante.");
		System.out.println("4.-Mostrar articulos.");
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija una opción"));
		return opcion;
	}



	public static HashMap<String, Articulo> getHm() {
		return hm;
	}



	public static void setHm(HashMap<String, Articulo> hm) {
		Aplicacion.hm = hm;
	}
	
	
	
	

}
