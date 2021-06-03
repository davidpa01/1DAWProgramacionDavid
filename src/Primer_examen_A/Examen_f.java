package Primer_examen_A;

public class Examen_f {

	public static void main(String[] args) {
		int array[] = new int [5];//se declara un array de 5 elemtos
		int array2[] = new int [5];//se declara un array de 5 elemtos
		for (int i = 0; i < array.length; i++) {//se crea un bucle en el que i es 0 y se repite mientras i sea menor que la longitud del array
			array[i] = utiles.obtenerNumeroAzarEntreLimites_c();//se le da valores aleatorios entre 0 y 100
		}
		for (int i = 0; i < array.length; i++) {//se crea un bucle en el que i es 0 y se repite mientras i sea menor que la longitud del array
			System.out.print(array[i] + " ");//se muestra el array
		}
		System.out.println(" ");
		for (int i = 0;  i < array2.length; i++) {//se crea un bucle en el que i es 0 y se repite mientras i sea menor que la longitud del array
			
		}
	}
}
