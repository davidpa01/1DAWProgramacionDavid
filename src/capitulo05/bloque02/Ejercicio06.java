package capitulo05.bloque02;

import javax.swing.JOptionPane;

import metodos.Utiles;

public class Ejercicio06 {

	public static void main(String[] args) {  
		int array[] = new int [5];//se declara un array
		int aux;
		System.out.println("1- Mover array a la izquerda");
		System.out.println("2- Mover array a la derecha");
		System.out.println(" ");
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija una opción"));//se elige una opcion
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));//se pide un numero
		switch(opcion) {
		case 1://si la opcion es 1 mueve las posiciones del array tantos lugares como el numero que se introducio hacia la izquierda
			for (int i = 0; i < array.length; i++) {
				array[i] = Utiles.obtenerNumeroAzar();
				System.out.print(array[i] + ", ");
			}
			System.out.println(" ");
			for (int j = 0; j<num; j++) {
				aux = array[0];
				for (int i = 0; i < array.length - 1; i++) {
					array [i] = array [i + 1];										
					
				}
				array[4] = aux;
			}
			for(int i = 0; i < array.length; i++) {
				System.out.print(array[i] + ", ");
			}
			break;
		case 2://si la opcion es 2 mueve las posiciones del array tantos lugares como el numero que se introducio hacia la derecha
			for (int i = 0; i < array.length; i++) {
				array[i] = Utiles.obtenerNumeroAzar();
				System.out.print(array[i] + ", ");
			}
			System.out.println(" ");
			for (int j = 0; j<num; j++) {
				aux = array[4];
				for (int i = array.length - 1; i > 0 ; i--) {
					array [i] = array [i - 1];										
					
				}
				array[0] = aux;
			}
			for(int i = 0; i < array.length; i++) {
				System.out.print(array[i] + ", ");
			}
			break;
		default:
			System.out.println("Opción no validad");
		}
	}

}
