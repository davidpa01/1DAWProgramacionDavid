package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		int suma = 0;
		int num;
		double conteo = 0;
		double media;
		do {//Se realiza lo que esta dentro y luego se mira la condicion del bucle
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número (0 para terminar)"));//se pide un numero
			if(num != 0) {//si el numero es distinto de 0 suma 1 a conteo
				conteo ++;
			}
			suma = suma + num;//se suma el numero
			media = suma / conteo;//se realiza la media
		} while(num != 0);//se repite el bucle infinito mientra que num se a distinto de cero
		System.out.println("La suma de los números es: " + media);//se muestra la media
	}

}
