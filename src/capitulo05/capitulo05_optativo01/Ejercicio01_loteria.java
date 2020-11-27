package capitulo05.capitulo05_optativo01;

import metodos.Utiles;

public class Ejercicio01_loteria {

	public static void main(String[] args) {
		int array[] = new int [7];
		array[0] = Utiles.obtenerNumeroAzarEntreLimites(1, 49);
		for (int i = 1; i < array.length; i++) {
			do {
				array[i] = Utiles.obtenerNumeroAzarEntreLimites(1, 49);		
			}while(array[i] == array[i-1]);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
}
	