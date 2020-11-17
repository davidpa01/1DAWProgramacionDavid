package capitulo05.bloque05_metodos_y_arrays;
/*
 * 5.- Realiza un método llamado "removeInteger", que reciba:
   - Un array de números enteros.
   - Un valor entero.
   Si el valor entero recibido como segundo parámetro existe dentro del array recibido como primer parámetro, debes conseguir 
   que ese valor desaparezca del array. Puedes seguir la siguiente guía:
   - Utiliza el método del ejercicio 4 para saber cuántas veces aparece el valor entero (segundo parámetro) dentro del array 
   (primer parámetro).
   - Crea un nuevo array, que tenga la dimensión del array recibido como primer parámetro menos la cantidad de veces que el 
   valor entero del segundo parámetro aparezca en dicho array.
   - Copia todos los elementos del array recibido como primer parámetro, dentro del nuevo array creado por ti en el método. 
   Lógicamente no debes copiar en el array los valores del primer array que coincidan con el valor introducido como segundo parámetro.
   - Devuelve el nuevo array.
   El método debe devolver "int[]". El método main debe recoger el nuevo array creado e imprimir en consola.
 */
public class Ejercicio05_removeInteger_array_int_valor_int_return_int {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = new int [] {1,1,2,3,4,1,2,3,4,1};
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		array = removeInteger(array, 1);
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
	public static int[] removeInteger (int array[], int valor) {
		int veces = 0, j = 0;
		boolean esta;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == valor) {
				veces++;
			}
		}
		int array2[] = new int [array.length - veces];
		for (int i = 0; i < array2.length; i++) {
			do {
				esta = false;
				if (array[j] != valor) {
					array2[i] = array[j];
					esta = true;
				}
				j++;				
			}while(esta == false);
		}
		return array2;
	}
	
	

}
