package capitulo05.bloque01;

import metodos.Utiles;

public class Ejercicio04 {

	public static void main(String[] args) { 
		int array[] = new int [150];//se declara el array
		int sumapar = 0, sumaimpar = 0;
		for (int i = 0; i < array.length; i++) {//se crea un bucle que se repite mientras la i sea menor que la longitud del array
			array[i] = Utiles.obtenerNumeroAzar();
			
			if (array[i] % 2 == 0) { // si el resto del numero en la posicion i entre dos es igual a cero realiza la suma de pares 
				sumapar += array[i];
			}else {// si no la de impares
				sumaimpar += array[i];
			}
		}
		System.out.println("Suma par = " + sumapar + "\nSuma impar = " + sumaimpar);
	}

}
