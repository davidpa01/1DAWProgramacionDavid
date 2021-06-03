package examen_tres_En_Raya;

import javax.swing.JOptionPane;

public class TresEnRayaConArrays {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		Declaro los array y le doy longitud 3
		int filaSup[] = new int [3];
		int filaMed[] = new int [3];
		int filaInf[] = new int [3];
//		declaro la variable op
		int op;
		valoresArray(filaSup, filaMed, filaInf);//Le doy valores los array
		mostrarTresenralla(filaSup, filaMed, filaInf);//muestro los tres array en pantalla
		do {
			
			System.out.println("");
			op = menu();//Le asigno un valor al menu
			switch (op) {
			case 0://si op es 0 se sale del programa
				System.out.println("Fin del programa.");
				break;
			case 1://si op es uno crea una jugada en la que da el valor 1
				jugada(filaSup, filaMed, filaInf, op);
				break;
			case 2://si op es dos crea una jugada en la que da el valor 2
				jugada(filaSup, filaMed, filaInf, op);
				break;
			default://si es distinto opcion incorrecta
				System.out.println("Opción incorrecta. Vuelva a intentarlo.");
				break;
			}
			mostrarTresenralla(filaSup, filaMed, filaInf);//muestro los tres array en pantalla
		} while (op != 0);//el bucle se ejecura minimo una vez y se repite mientras op sea distinto de cero
		
		
		
	}
	
	
	/**
	 * 
	 * @return
	 */
	public static int menu() {
		System.out.println("\nTRES EN RALLA");
		System.out.println("-------------");
		System.out.println("");
		System.out.println("0.- Abandonar el programa.");
		System.out.println("1.- Jugador 1 introduce su jugada.");
		System.out.println("2.- Jugador 2 introduce su jugada.");
		int op = Integer.parseInt(JOptionPane.showInputDialog("Introduzca una opción: "));
		return op;
	}
	
	
	
	
	/**
	 * 
	 * @param filaSup
	 * @param filaMed
	 * @param filaInf
	 * @param op
	 */
	public static void jugada(int filaSup[], int filaMed[], int filaInf[], int op) {
		int fila = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de la fila: "));
		int columna = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de la columna: "));
		
		if (op == 1) {//si la opcion es 1, es decir para el jugador uno
			
			if (fila == 0) {
				
				if (filaSup[columna] != 0) {//si el elemto en la posicion columna es distinto de cero es decir es 1 o 2 realiza una recursiva para volver a preguntar
					System.out.println("Vuelve a intentarlo");
					jugada(filaSup, filaMed, filaInf, op);
				}else {//si no es distinto introduce en esa posicion un uno
					filaSup[columna] = 1;					
				}
			}
			
			else if (fila == 1) {
				
				if (filaMed[columna] != 0) {//si el elemto en la posicion columna es distinto de cero es decir es 1 o 2 realiza una recursiva para volver a preguntar
					System.out.println("Vuelve a intentarlo");
					jugada(filaSup, filaMed, filaInf, op);
				}else {//si no es distinto introduce en esa posicion un uno
					filaMed[columna] = 1;					
				}
			}
			
			else if (fila == 2) {
				
				if (filaInf[columna] != 0) {//si el elemto en la posicion columna es distinto de cero es decir es 1 o 2 realiza una recursiva para volver a preguntar
					System.out.println("Vuelve a intentarlo");
					jugada(filaSup, filaMed, filaInf, op);
				}else {//si no es distinto introduce en esa posicion un uno
					filaInf[columna] = 1;					
				}
			}else {
				System.out.println("Opcion no valida");
				jugada(filaSup, filaMed, filaInf, op);
			}
		}
		
		if (op == 2) {//si la opcion es igual a dos, es decir para el jugador dos
			
			if (fila == 0) {
				
				if (filaSup[columna] != 0) {//si el elemto en la posicion columna es distinto de cero es decir es 1 o 2 realiza una recursiva para volver a preguntar
					System.out.println("Vuelve a intentarlo");
					jugada(filaSup, filaMed, filaInf, op);
				}else {//si no es distinto introduce en esa posicion un dos
					filaSup[columna] = 2;					
				}
			}
			
			else if (fila == 1) {
				System.out.println("Vuelve a intentarlo");
				
				if (filaMed[columna] != 0) {//si el elemto en la posicion columna es distinto de cero es decir es 1 o 2 realiza una recursiva para volver a preguntar
					jugada(filaSup, filaMed, filaInf, op);
				}else {//si no es distinto introduce en esa posicion un dos
					filaMed[columna] = 2;					
				}
			}
			
			else if (fila == 2) {
				
				if (filaInf[columna] != 0) {//si el elemto en la posicion columna es distinto de cero es decir es 1 o 2 realiza una recursiva para volver a preguntar
					System.out.println("Vuelve a intentarlo");
					jugada(filaSup, filaMed, filaInf, op);
				}else {//si no es distinto introduce en esa posicion un dos
					filaInf[columna] = 2;					
				}
			}else {
				System.out.println("Opcion no valida");
				jugada(filaSup, filaMed, filaInf, op);
			}
		}
	}
	
	/**
	 * 
	 * @param filaSup
	 * @param filaMed
	 * @param filaInf
	 */
	public static void valoresArray(int filaSup[], int filaMed[], int filaInf[]) {
		for (int i = 0; i < filaInf.length; i++) {
			filaSup[i] = 0;
			filaMed[i] = 0;
			filaInf[i] = 0;
		}
	}
	
	
	
	/**
	 * 
	 * @param filaSup
	 * @param filaMed
	 * @param filaInf
	 */
	public static void mostrarTresenralla(int filaSup[], int filaMed[], int filaInf[]) {
		for (int i = 0; i < filaSup.length; i++) {
			System.out.print(filaSup[i] + "\t");
		}
		System.out.println("");
		for (int i = 0; i < filaMed.length; i++) {
			System.out.print(filaMed[i] + "\t");
		}
		System.out.println("");
		for (int i = 0; i < filaInf.length; i++) {
			System.out.print(filaInf[i] + "\t");
		}
	}
	
	
	
	
	
	
	
	
	

}
