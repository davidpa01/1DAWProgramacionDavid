package capitulo05.bloque07_Listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import metodos.Utiles;

/*
 * 2.- Realiza un programa que trabaje con una Lista de elementos Integer. Debes mostrar un menú en pantalla y ofrecer al usuario las siguientes opciones a 
 * realizar sobre la lista:
 *   a) "Abandonar el programa".
 *   b) "Crear aleatoriamente la lista de valores". Pedirás al usuario los siguientes datos: longitud de la lista, valor mínimo y valor máximo. 
 *   A continuación limpiarás la lista (por si contenía valores), y agregarás tantos elementos enteros como se haya indicado, con valores que deben oscilar 
 *   entre el mínimo y el máximo señalado.
 *   c) "Calcular suma, media, mayor y menor". Mostrarás en pantalla esos cuatro valores.
 *   d) "Agregar una cantidad de nuevos valores". Pedirás al usuario los siguientes datos: cuántos datos nuevos quiere agregar, posición a 
 *   partir de la que se deben introducir, valor mínimo y valor máximo. Incluirás tantos valores como indique el usuario, en la posición indicada, 
 *   con valores entre mínimo y máximo.
 *   e) "Eliminar elementos cuyo valor esté en un intervalo". Pedirás dos valores al usuario (mínimo y máximo), que conforman un intervalo. Eliminarás 
 *   los valores de la lista de elementos que se encuentren dentro de ese intervalo (incluyendo los límites) e informarás de cuantos elementos has eliminado 
 *   de la lista.
 *   f) "Imprimir la lista". Mostrarás la lista en pantalla.
 */
public class Ejercicio02_lista_interger {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int opcion;
		List<Integer> lista = new ArrayList<Integer>();
		System.out.println("");
		do {
			opcion = menu();
			switch (opcion) {
			case 0:
				System.out.println("El programa a finalizado");
				break;
			case 1:
				valoresAleatorios(lista);
				break;
			case 2:
				System.out.println("");
				sumaMediaMayorMenor(lista);
				System.out.println("");
				break;
			case 3:
				agregar(lista);
				break;
			case 4:
				eliminar(lista);
				break;
			case 5:
				System.out.println("");
				imprimirLista(lista);
				System.out.println("");
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
		System.out.println("LISTA DE ENTEROS");
		System.out.println("----------------");
		System.out.println("");
		System.out.println("0.-Salir del programa.");
		System.out.println("1.-Crear lista de valores aleatoria.");
		System.out.println("2.-Calcular suma, media, mayor y menor.");
		System.out.println("3.-Agregar una cantidad de valores.");
		System.out.println("4.-Eliminar elementos en un intervalo.");
		System.out.println("5.-Imprimir lista.");
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija una opción"));
		return opcion;
	}
	
	
	/**
	 * 
	 * @param lista
	 */
	public static void valoresAleatorios(List<Integer> lista) {
		lista.removeAll(lista);
		int lon = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de elementos que desea meter: "));
		int min = Integer.parseInt(JOptionPane.showInputDialog("Limite minimo aleatorio: "));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Limite maximo aleatorio: "));
		for (int i = 0; i < lon; i++) {
			lista.add(Utiles.obtenerNumeroAzarEntreLimites(min, max));
		}
		
	}
	
	
	/**
	 * 
	 * @param lista
	 */
	public static void sumaMediaMayorMenor(List<Integer> lista) {
		int suma = 0;
		int mayor, menor;
		menor = menor(lista);
		mayor = mayor(lista);
		for (int i = 0; i < lista.size(); i++) {
			suma += lista.get(i);
		}
		float media = suma / (float) lista.size();
		System.out.println("La suma es: " + suma + "\nLa media es: " + media + "\nEl menor es: " + menor + "\nEl mayor es: " + mayor);
	}
	
	
	/**
	 * 
	 * @param lista
	 */
	public static void agregar(List<Integer> lista) {
		int lon = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de elementos que desea meter: "));
		int indice = Integer.parseInt(JOptionPane.showInputDialog("Indice a partir de la que se desea introducir: "));
		int min = Integer.parseInt(JOptionPane.showInputDialog("Limite minimo aleatorio: "));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Limite maximo aleatorio: "));
		for (int i = 0; i < lon; i++) {
			lista.add(indice, Utiles.obtenerNumeroAzarEntreLimites(min, max));
		}
	}
	
	
	
	/**
	 * 
	 * @param lista
	 */
	public static void eliminar(List<Integer> lista) {
		int i = 0;
		int min = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el indice minimo para cortar"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el indice maximo para cortar"));
		for (i = min; i <= max; i++) {
			lista.remove(min);
		}
		System.out.println("Se han eliminado " + i + " elementos de la lista");
	}
	
	
	/**
	 * 
	 * @param lista
	 */
	public static void imprimirLista(List<Integer> lista) {
		System.out.println("\n\nContenido de la lista");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}
	}
	
	
	
	/**
	 * 
	 * @param lista
	 * @return
	 */
	public static int menor(List<Integer> lista) {
		int menor = lista.get(0);
		for (int i = 1; i < lista.size(); i++) {
			
			if (lista.get(i) < menor) {
				
				menor = lista.get(i);
				
			}
			
		}
		return menor;
	}
	
	
	/**
	 * 
	 * @param lista
	 * @return
	 */
	public static int mayor(List<Integer> lista) {
		int mayor = lista.get(0);
		for (int i = 1; i < lista.size(); i++) {
				
			if (lista.get(i) > mayor) {
				
				mayor = lista.get(i);
				
			}
		
		}
		return mayor;
	}

}
