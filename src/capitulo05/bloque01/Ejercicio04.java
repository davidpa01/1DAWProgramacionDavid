package capitulo05.bloque01;

import metodos.Utiles;

public class Ejercicio04 {

	public static void main(String[] args) {
		int array[] = new int [150];
		int sumapar = 0, sumaimpar = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = Utiles.obtenerNumeroAzar();
			
			if (array[i] % 2 == 0) {
				sumapar += array[i];
			}else {
				sumaimpar += array[i];
			}
		}
		System.out.println("Suma par = " + sumapar + "\nSuma impar = " + sumaimpar);
	}

}
