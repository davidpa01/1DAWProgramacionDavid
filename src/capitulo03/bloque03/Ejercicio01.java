package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		int suma = 0;
		int num;
		do {//Se realiza lo que esta dentro y luego se mira la condicion del bucle
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número (0 para terminar)"));//se pide un numero
			suma = suma + num;//se realiza la suma
		} while(num != 0);//se repite el bucle infinito mientra que num se a distinto de cero
		System.out.println("La suma de los números es: " + suma);//se muestra la suma
	}

}
