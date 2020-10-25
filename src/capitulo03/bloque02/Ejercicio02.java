package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de núemros que quieres porner: "));//se pide un numero
		int mayor = 0, menor = 0;
		for (int i = 0; i < num; i++) {// se crea un bucle de i = 0 que se repite mientra que i sea menor que el numero
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: "));//se pide un numero
			if (i == 0) {//si i es 0 menor y mayor se igualan al numer
				menor = num2;
				mayor = num2;
			}
			else {
				if (num2 > mayor) {//si num2 es mayor que mayor se guarda el num2 en el mayor
					mayor = num2;
				}
				if (num2 < menor) {//si num2 es menor que menor se guarda el num2 en el menor
					menor = num2;
				}
			}
		}
		System.out.println("El número mayor es: " + mayor + ", el número menor es: " + menor);//se muestra el mayor y el menor
	}

}
