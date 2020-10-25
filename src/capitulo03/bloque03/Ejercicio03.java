package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		int num;
		int mayor = 0;
		do {//Se realiza lo que esta dentro y luego se mira la condicion del bucle
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (0 para terminar)"));
			if (num > mayor && num != 0) {// si el numero es mayor que el mayor y es distinto de cero guarda el numero en el mayor
				mayor = num;
			}
			
		} while (num != 0);//se repite el bucle infinito mientra que num se a distinto de cero
		System.out.println("El número más grande introducido es: " + mayor);//muestra el mayor
	}

}
