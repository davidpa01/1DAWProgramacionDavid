package capitulo05.bloque05_metodos_y_arrays;
/*
 * 2.- Un método llamado "findAndReplace", que reciba: 
 *	   - Un array de números enteros.
 *	   - Un valor entero que debe buscarse en el array.
 *	   - Un valor entero que debe servir para reemplazar.
 *	El método buscará todas las ocasiones en las que el segundo parámetro aparezca dentro del array y reemplazará ese valor con el valor del tercer parámetro.
 *	El método main debe crear un array, imprimirlo en consola, llamar al método "findAndReplace" y volver a imprimir el array en consola.
 */
public class Ejercicio02_findAndReplace_array_int_buscar_int_cambiar_int {
	
	public static void main(String[] args) {
		int array[] = new int [] {1,2,2,3,4,5,2,6};
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
		findAndReplace(array, 2, 0);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	/**
	 * 
	 * @param array
	 * @param buscar
	 * @param cambio
	 */
	public static void findAndReplace (int array[], int buscar, int cambio) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == buscar) {
				array[i] = cambio;
			}
		}
	}
	

}
