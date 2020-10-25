package capitulo05.bloque02;

import metodos.Utiles;

public class Ejercicio02 {

	public static void main(String[] args) {
		int array0[] = new int [150];
		int array1[] = new int [150];
		int array2[] = new int [150];
		
		
		for (int i = 0; i < array2.length; i++) {
			array0[i] = Utiles.obtenerNumeroAzar();
			array1[i] = Utiles.obtenerNumeroAzar();
			if (i % 2 != 0) {
				array2[i] = array0[i];
			}
			if (i % 2 == 0) {
				array2[i] = array1[i];
			}
			System.out.println(array2[i]);	
		}
	}

}
