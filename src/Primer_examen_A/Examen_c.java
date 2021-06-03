package Primer_examen_A;

public class Examen_c {

	public static void main(String[] args) {
		int array[] = new int [20];//se declara un array de 20 elemtos
		int num;
		for (int i = 0; i < array.length; i++) {//se crea un bucle en el que i es 0 y se repite mientras i sea menor que la longitud del array
			do {//se crea un bucle do while que se repite mientras el resto de num y 2 sea distinto
				 num = utiles.obtenerNumeroAzarEntreLimites_c();//se le da valores aleatorios
				if(num % 2 == 0) {//si el valor es par guarda el numero en el array
					array[i] = num;
				}
			} while (num % 2 != 0);
		}
		for (int i = 0; i < array.length; i++) {//se crea un bucle en el que i es 0 y se repite mientras i sea menor que la longitud del array
			System.out.print(array[i] + " ");
		}
	}
}
