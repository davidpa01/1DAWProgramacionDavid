package capitulo05.bloque05_metodos_y_arrays;
/*
 * 4.- Realiza un método llamado "countOccurrences", que reciba:
 * - Un array de números enteros.
 * - Un valor entero.
 * El método debe devolver un valor entero, que corresponda con el número de veces que el valor entero recibido como segundo parámetro 
 * exista dentro del array recibido como primer parámetro.
 */
public class Ejercicio04_countOccurrences_array_int_valor_int_return_int_array {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = new int [] {0,1,2,2,2,2,3,4,5,6,7};
		int conteo = countOccurrences(array, 2);
		System.out.println("El numero 2 se repite " + conteo + " veces.");
	}
	
	
	public static int countOccurrences (int array[], int valor) {
		int conteo = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == valor) {
				conteo++;
			}
		}
		return conteo;
	
	}
	
	

}
