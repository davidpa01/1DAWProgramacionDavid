package capitulo05.bloque05_metodos_y_arrays;
/*
 * 3.- Realiza un método llamado "addInteger", que reciba:
 * - Un array de números enteros.
 * - Un valor entero.
 *	Dentro del método debes:
 * - Crear un nuevo array, cuya longitud sea la del array recibido como primer parámetro + 1.
 * - Copiar el array del primer parámetro en el array creado dentro del método, elemento tras elemento.
 * - Agregar el nuevo elemento al final del nuevo array.
 * - Asignar, al array recibido mediante el primer parámetro, el puntero al nuevo array creado en el interior del método.
 * - El método debe devolver un array de tipo entero. Main debe recoger el array devuelto e imprimirlo en consola.
 */
public class Ejercicio03_addInteger_array_int_valor_int_return_int {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = new int [] {0,1,2,3,4,5,6,7,8,9,};
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		array=addInteger(array, 10);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	
	/**
	 * 
	 * @param array
	 * @param valor
	 * @return
	 */
	public static int[] addInteger (int array[], int valor) {
		int array2[] = new int [array.length + 1];
		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}
		array2[array2.length - 1] = valor;
		
		return array2;
	}
	
	

}
