package Primer_examen_A;

public class Examen_d {

	public static void main(String[] args) {
		int array[] = new int [20];//se declara un array de 20 elemtos
		for (int i = 0; i < array.length; i++) {//se crea un bucle en el que i es 0 y se repite mientras i sea menor que la longitud del array
			array[i] = utiles.obtenerNumeroAzar100();//se le da valores aleatorios entre 0 y 100
		}
		for (int i = 0; i < array.length; i++) {//se crea un bucle en el que i es 0 y se repite mientras i sea menor que la longitud del array
			System.out.print(array[i] + " ");
			for (int j = 2; j < array[i]; j++) {//se crea un bucle en el que j es 2 y se repite mientras j sea menor que array en la posicion de i
				if (array[i] % j == 0) {//si el numero del array al dividirlo entre j el resto es 0
					//te muestra los divisores del numero
					System.out.print("divisor " + j + " ");
				}
			}
			System.out.println("");
		}
	}

}
