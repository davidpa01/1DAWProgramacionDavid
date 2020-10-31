package capitulo05.bloque01;

import metodos.Utiles;

public class Ejercicio00 {

	public static void main(String[] args) {
		int array[] = new int [150]; //se declara el array
		int suma = 0, mayor = 0, menor = 0; 
		float media = 0;
		
		for (int i = 0; i < array.length; i++) {//se crea un bucle que se repite mientras la i sea menor que la longitud del array
			array[i] = Utiles.obtenerNumeroAzar();//se le dan valores al 
			suma += array[i];
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");//se imprime el array
		}

		for (int i = 0; i < array.length; i++) {
			if(i == 0) {
				menor = array[i];//menor
				mayor = array[i];//mayor
			}else {
				
				if (array[i] > mayor) {
					mayor = array[i];
				}
				
				if (array[i] < menor) {
					menor = array[i];
				}				
			}
		}
		media = (float) (suma) / 150;
		System.out.println("La suma es: " + suma);
		System.out.println("La media es: " + media);
		System.out.println("El mayor es: " + mayor);
		System.out.println("El menor es: " + menor);
	}

}
