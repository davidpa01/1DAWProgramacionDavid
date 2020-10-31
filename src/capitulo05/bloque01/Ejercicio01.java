package capitulo05.bloque01;

import javax.swing.JOptionPane;

import metodos.Utiles;

public class Ejercicio01 {

	public static void main(String[] args) {
		int array[] = new int [150];//se declera el array
		//se pide un limite superior y uno inferior
		int liminf = Integer.parseInt(JOptionPane.showInputDialog("Introduce un limite inferior"));
		int limsup = Integer.parseInt(JOptionPane.showInputDialog("Introduce un limite superior"));
		
		for (int i = 0; i < array.length; i++) {//se crea un bucle que serepite mientra la i sea menor que la longitud del array
			array[i] = Utiles.obtenerNumeroAzarEntreLimites(liminf, limsup);//se le da valores aleatorios entre limites
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");//se imrime el array
		}
		
	}

}
