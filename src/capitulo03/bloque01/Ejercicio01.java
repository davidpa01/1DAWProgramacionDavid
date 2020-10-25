package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		int num;
		int suma = 0;
		for (int i = 0; i < 4; i++) {// Se crea un bucle donde i = 0 y se repite mientras i sea menor que 4
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));// se pide un numero
			if (num > 10) {// Si el numero es mayor de 10 suma el numero pedido anterior
				suma = suma + num;
			}
		}
		System.out.println("La suma de números mayores de 10 es: " + suma);//Se muestra en pantalla la suma
	}

}
