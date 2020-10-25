package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {
		int menor = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (0 para terminar): "));//se pide un numero
		int mayor = menor;
		int num = menor;
		while (num != 0) {//mientras que el numero sea distinto de 0
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (0 para terminar)"));//se pide un numero
			if (num < menor && num != 0) {// si el numero es menor que el menor y es distinto de cero guarda el numero en el menor
				menor = num;
			}
			if (num > mayor && num != 0) {// si el numero es mayor que el mayor y es distinto de cero guarda el numero en el mayor
				mayor = num;
			}
			
		} 
		System.out.println("El número más pequeño introducido es: " + menor);//se muestra el menor
		System.out.println("El número más grande introducido es: " + mayor);//se muestra el mayor
	}

}
