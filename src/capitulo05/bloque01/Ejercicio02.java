package capitulo05.bloque01;

import metodos.Utiles;

public class Ejercicio02 {

	public static void main(String[] args) { 
		int array[] = new int [150];//se declara el array
		
		for (int i = 0; i < array.length; i++) {//se crea un bucle que se repite mientras la i sea menor que la longitud del array
			array[i] = Utiles.obtenerNumeroAzar();//se le da valores aleatorios
		}

		for (int i = array.length - 1; i >= 0; i--) {//se crea un bucle que se repite mientras que la longitud del array sea mayor o igual a cero
			System.out.println(array[i]);
		}
	}

}
