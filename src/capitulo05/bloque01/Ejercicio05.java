package capitulo05.bloque01;

import metodos.Utiles;

public class Ejercicio05 {

	public static void main(String[] args) {
		int array[] = new int [150];//se declara el array
		int suma = 0;
		for (int i = 0; i < array.length; i++) {//se crea un bucle que se repite mientras la i sea menor que la longitud del array
			array[i] = Utiles.obtenerNumeroAzar();
			if (i % 2 == 0) {//si el indice es par suma los numeros del array en la posicion i
				suma =suma + array[i];
			}
		}
		System.out.println("La suma de los indices pares es: " + suma);
	}

}
