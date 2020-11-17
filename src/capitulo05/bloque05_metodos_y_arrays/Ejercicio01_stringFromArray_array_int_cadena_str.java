package capitulo05.bloque05_metodos_y_arrays;
/*
 * 1.- Un método llamado "stringFromArray", que reciba un array de números enteros y devuelva una cadena de caracteres. 
 * El método debe recorrer el array, de la misma forma en la que harías para mostrarlo en consola, pero en lugar de imprimir
 * en consola debes construir un objeto String. Finalmente debes devolver el String e imprimirlo en el método "main"
 */
public class Ejercicio01_stringFromArray_array_int_cadena_str {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = new int [] {1, 2, 3, 4, 5};
		System.out.println(stringFromArray(array));
	}
	
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static String stringFromArray(int array[]) {
		String str = " ";
		for (int i = 0; i < array.length; i++) {
			str += array[i] + " ";
		}
		return str;
	}

}
