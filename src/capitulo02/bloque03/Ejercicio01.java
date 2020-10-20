package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		String var1 = JOptionPane.showInputDialog("Introduce tu nota: ");// Se crea una variable en la que se guarda un dato
		int nota = Integer.parseInt(var1);// El dato se transforma en numero entero
		switch (nota) { //se comprueba la nota
		case 0:
		case 1:
		case 2:
			System.out.println("La nota que ha introducido es un Muy deficiente");//Si la nota es 0, 1 o 2 muestra esta lineas
			break;// Se sale
		case 3:
		case 4:
			System.out.println("La nota que ha introducido es un Deficiente");//Si la nota es 3 o 4 muestra esta lineas
			break;
		case 5:
			System.out.println("La nota que ha introducido es un Suficiente");//Si la nota es 5 muestra esta lineas
			break;
		case 6:
			System.out.println("La nota que ha introducido es un Bien");//Si la nota es 6 muestra esta lineas
			break;
		case 7:
		case 8:
			System.out.println("La nota que ha introducido es un Notable");//Si la nota es 7 o 8 muestra esta lineas
			break;
		case 9:
		case 10:
			System.out.println("La nota que ha introducido es un Sobresaliente");//Si la nota es 9 o 10 muestra esta lineas
			break;
		default:
			System.out.println("La nota introducida no es valida");//Si la nota no esta comprndida entre 0 y 10 muestra esta lineas
		}

	}

}
