package capitulo05.bloque01;

import metodos.Utiles;

public class ejercicio05 {

	public static void main(String[] args) {
		int array[] = new int [150];
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = Utiles.obtenerNumeroAzar();
			if (i % 2 == 0) {
				suma =suma + array[i];
			}
		}
		System.out.println("La suma de los indices pares es: " + suma);
	}

}
