package capitulo05.bloque07_Listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/*
 * 1.- Escribe un programa editor de textos. Debes utilizar la consola de Java. El objetivo es que se pueda editar el contenido de un archivo ficticio. 
 * Para hacer esto utilizarás una lista de elementos de tipo String. Cada línea del texto será representada como un String. Debes mostrar un menú en pantalla, 
 * que contenga todas las opciones siguientes, y que funcionen adecuadamente:
      a) "Abandonar el programa". 
      b) "Agregar una línea al texto". Pediras al usuario un String y lo agregarás al final de la lista que representa tu fichero ficticio.
      b) "Insertar una línea en cualquier posición del texto". Pedirás al usuario un String y un número. Insertarás el String en la línea pedida.
      c) "Editar una línea (reescribir su contenido)". Pedirás al usuario un número de línea para sobrescribir, mostrarás al usuario la línea actual 
      	que desea sobrescribir. Pedirás un nuevo String. Eliminarás el String actual y cambiarás con el nuevo
      d) "Borrar una línea". Pedirás un número de línea y la eliminarás de la lista.
      e) "Cortar un conjunto de líneas", (marcadas por su posición inicial y final). Pedirás un número de línea inicial y uno final. "Transportarás todas 
      	las líneas del intervalo a una nueva lista y las borrarás de la lista original.
      f) "Pegar un conjunto de líneas cortadas en una determinada posición". Pedirás un número de línea en la que insertar lo que tienes cortado con 
      	la opción anterior.
      g) "Imprimir el fichero". Mostrarás cada línea del fichero ficticio, aparecerá numerada en la consola.
 */
public class Ejercicio01_editor_de_textos {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int opcion;
		List<String> fichero = new ArrayList<String>();
		fichero.add("Primera línea"); fichero.add("Segunda línea"); fichero.add("Tercera línea");
		List<String> portaPapeles = new ArrayList<String>();
		do {
			opcion = menu();
			switch (opcion) {
			case 0:
				System.out.println("El programa a finalizado");
				break;
			case 1:
				añadir(fichero);
				break;
			case 2:
				int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el indice donde quieres introducir el mensaje: "));
				insertar(fichero, num);
				break;
			case 3:
				editar(fichero);
				break;
			case 4:
				int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el indice donde quieres introducir el mensaje: "));
				borrar(fichero, num1);
				break;
			case 5:
				cortar(fichero, portaPapeles);
				break;
			case 6:
				pegar(fichero, portaPapeles);
				break;
			case 7:
				imprimirFichero(fichero);
				break;
			default:
				System.out.println("Opción incorrecta, vuelva a intentarlo.");
				break;
			}
			System.out.println("");
		} while(opcion != 0);

	}
	
	/**
	 * 
	 * @return
	 */
	public static int menu() {
		System.out.println("EDITOR DE TEXTOS");
		System.out.println("----------------");
		System.out.println("");
		System.out.println("0.-Salir del programa.");
		System.out.println("1.-Agregar linea.");
		System.out.println("2.-Insertar linea.");
		System.out.println("3.-Editar una linea.");
		System.out.println("4.-Borrar una linea.");
		System.out.println("5.-Cortar una linea o conjunto de lineas.");
		System.out.println("6.-Pegar una linea o conjunto de lineas.");
		System.out.println("7.-Imprimir fichero.");
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija una opción"));
		return opcion;
	}
	
	/**
	 * 
	 * @param lista
	 */
	public static void añadir(List<String> lista) {
		String str = JOptionPane.showInputDialog("Introduzca un mensaje");
		lista.add(str);
	}
	
	/**
	 * 
	 * @param lista
	 * @param num
	 */
	public static void insertar(List<String> lista, int num) {
		String str = JOptionPane.showInputDialog("Introduzca un mensaje");
		lista.add(num, str);
	}
	
	
	
	/**
	 * 
	 * @param lista
	 */
	public static void editar(List<String> lista) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el indice donde quieres introducir el mensaje"));
		borrar(lista, num);
		insertar(lista, num);
	}
	
	
	
	/**
	 * 
	 * @param lista
	 * @param num
	 */
	public static void borrar(List<String> lista, int num) {
		lista.remove(num); 
	}
	
	/**
	 * 
	 * @param lista
	 * @param portaPapeles
	 */
	public static void cortar(List<String> lista, List<String> portaPapeles) {
		if (!portaPapeles.isEmpty()) {
			portaPapeles.removeAll(portaPapeles);
			imprimirFichero(portaPapeles);
		}
		int min = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el indice minimo para cortar"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el indice maximo para cortar"));
		for (int i = min; i <= max; i++) {
			portaPapeles.add(lista.remove(min));			
		}
	}
	
	/**
	 *  
	 * @param lista
	 * @param portaPapeles
	 */
	public static void pegar(List<String> lista, List<String> portaPapeles) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el indice donde quieres copiar"));
		lista.addAll(num, portaPapeles);
	}
	
	/**
	 * 
	 * @param lista
	 */
	public static void imprimirFichero(List<String> lista) {
		System.out.println("\n\nContenido del fichero");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}
	}

}
