package capitulo05.bloque02;

import metodos.Utiles;

public class Ejercicio01 {

	public static void main(String[] args) { 
		int array[] = new int [150];//se declara un array
		for (int i = 0; i < array.length; i++) {//se crea un bucle que se repite mientras la i sea menor que la longitud del array
			array[i] = Utiles.obtenerNumeroAzarEntreLimites(-100, 100);
			if (array[i] % 2 == 0) {//si el numero es par se cambia de signo
				array[i] = - array[i];
			}
			System.out.println(array[i]);
		}
	}
}
