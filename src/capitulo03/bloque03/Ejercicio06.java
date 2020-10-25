package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {
		int num;
		do {//Se realiza lo que esta dentro y luego se mira la condicion del bucle
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número (0 para terminar)"));//se pide un numero
			for (int i = 0; i < 11; i++) {//se crea un bucle que se repite 10 veces
				if (num != 0) {//si el numero es distinto de cero, calcula la tabla de multiplicar
					System.out.println(i + " x " + num + " = " + (i * num));
				}
			}
		} while (num != 0);//se repite el bucle infinito mientra que num se a distinto de cero
	}

}
