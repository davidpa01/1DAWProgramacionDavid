package capitulo05.bloque02;

import javax.swing.JOptionPane;

import metodos.Utiles;

public class Ejercicio05 {

	public static void main(String[] args) { 
		int array[] = new int [5];//se declar un array
		int aux;
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));//se pide un numero
		for (int i = 0; i < array.length; i++) {//se crea un bucle que se repite mientras la i sea menor que la longitud del array
			array[i] = Utiles.obtenerNumeroAzar();
			System.out.print(array[i] + ", ");
		}
		System.out.println(" ");
		for (int j = 0; j < num; j++) {//se crea  un bucle que se repite mientra la j sea menor que el numero
			aux = array[4];//se guarda el el ultimo numero del array en una variable
			for (int i = array.length - 1; i > 0 ; i--) {//se crea un bucle que se repite mientra la longitud del array sea mayor que 0
				array [i] = array [i - 1];//se guarda en la posicion de i la posicion anterior										
				
			}
			array[0] = aux;//se guarda en la primera posicion la auxiliar
		}
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}			
		

	}

}
