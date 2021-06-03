package examen_tres_En_Raya;

import javax.swing.JOptionPane;


public class TresEnRayaConMatrices {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		declaro la matriz
		int matriz[][] = new int [3][3];
//		declaro la opcion
		int op;
		valoresMatriz(matriz);//le doy valores a la matriz
		mostrarMatriz(matriz);//muestro la matriz
		System.out.println("");
		do {
			op = menu();
			switch (op) {
			case 0://si op es 0 se sale del programa
				System.out.println("Fin del programa.");
				break;
			case 1://si op es uno crea una jugada en la que da el valor 1
				jugada(matriz, op);
				break;
			case 2://si op es dos crea una jugada en la que da el valor 2
				jugada(matriz, op);
				break;
			default://si es distinto opcion incorrecta
				System.out.println("Opción incorrecta. Vuelva a intentarlo.");
				break;
			
			}
			System.out.println("");
			mostrarMatriz(matriz);//muestro la matriz
		} while (op != 0 && !ganador1(matriz) && !ganador2(matriz));//el bucle se ejecura minimo una vez y se repite mientras op sea distinto de cero y el ganador1 y 2 sea false
		
		if(ganador1(matriz)) {//si ganador1 es true gana el jugador uno
			System.out.println("El ganador es el jugador 1");
		}
		if (ganador2(matriz)) {//si ganador2 es true gana el jugador dos
			System.out.println("El ganador es el jugador 2");
		}

	}
	
	
	
	
	/**
	 * 
	 * @param matriz
	 */
	public static void valoresMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = 0;
			}
		}
	}
	
	
	
	/**
	 * 
	 * @param matriz
	 */
	public static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("");
		}
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
	 * @param matriz
	 * @param op
	 */
	public static void jugada(int[][] matriz, int op) {
		int fila = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de la fila: "));
		int columna = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de la columna: "));
		
		if (op == 1) {//si la opcion es igual a unno
			
			if (matriz[fila][columna] != 0) {//si la posicion esta ocupada se repite el proceso
				System.out.println("Vuelve a intentarlo");
				jugada(matriz, op);
			}else {//si no se añade un uno en la posicion espicificada
				matriz[fila][columna] = 1;
			}
		}
		
		if (op == 2) {//si la opcion es igual a dos
			
			if (matriz[fila][columna] != 0) {//si la posicion esta ocupada se repite el proceso
				System.out.println("Vuelve a intentarlo");
				jugada(matriz, op);
			}else {//si no se añade un dos en la posicion espicificada
				matriz[fila][columna] = 2;
			}
		}
	}
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean ganador1(int[][] matriz) {
//		compruebo si la 1ª fila es igual
		if (matriz[0][0] == 1) {
			if(matriz[0][1] == 1) {
				if (matriz[0][2] == 1) {
					return true;
				}
			}
		}
//		compruebo si la 2ª fila es igual
		else if (matriz[1][0] == 1) {
			if(matriz[1][1] == 1) {
				if (matriz[1][2] == 1) {
					return true;
				}
			}
		}
//		compruebo si la 3ª fila es igual
		else if (matriz[2][0] == 1) {
			if(matriz[2][1] == 1) {
				if (matriz[2][2] == 1) {
					return true;
				}
			}
		}
		
//		compruebo si la 1ª columna es igual
		if (matriz[0][0] == 1) {
			if(matriz[1][0] == 1) {
				if (matriz[2][0] == 1) {
					return true;
				}
			}
		}
//		compruebo si la 2ª columna es igual
		else if (matriz[0][1] == 1) {
			if(matriz[1][1] == 1) {
				if (matriz[2][1] == 1) {
					return true;
				}
			}
		}
//		compruebo si la 3ª columna es igual
		else if (matriz[0][2] == 1) {
			if(matriz[1][2] == 1) {
				if (matriz[2][2] == 1) {
					return true;
				}
			}
		}
		
//		compruevo que la diagonal principal es igual
		if (matriz[0][0] == 1) {
			if(matriz[1][1] == 1) {
				if (matriz[2][2] == 1) {
					return true;
				}
			}
		}
//		compruevo que la otra diagonal es igual
		if (matriz[0][2] == 1) {
			if(matriz[1][1] == 1) {
				if (matriz[2][0] == 1) {
					return true;
				}
			}
		}
		return false;
		
	}
	
	
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean ganador2(int[][] matriz) {
//		se realiza lo mismo pero para el jugador dos
		if (matriz[0][0] == 2) {
			if(matriz[0][1] == 2) {
				if (matriz[0][2] == 2) {
					return true;
				}
			}
		}else if (matriz[1][0] == 2) {
			if(matriz[1][1] == 2) {
				if (matriz[1][2] == 2) {
					return true;
				}
			}
		}else if (matriz[2][0] == 2) {
			if(matriz[2][1] == 2) {
				if (matriz[2][2] == 2) {
					return true;
				}
			}
		}
		
		
		if (matriz[0][0] == 2) {
			if(matriz[1][0] == 2) {
				if (matriz[2][0] == 2) {
					return true;
				}
			}
		}else if (matriz[0][1] == 2) {
			if(matriz[1][1] == 2) {
				if (matriz[2][1] == 2) {
					return true;
				}
			}
		}else if (matriz[0][2] == 2) {
			if(matriz[1][2] == 2) {
				if (matriz[2][2] == 2) {
					return true;
				}
			}
		}
		
		
		if (matriz[0][0] == 2) {
			if(matriz[1][1] == 2) {
				if (matriz[2][2] == 2) {
					return true;
				}
			}
		}
		
		if (matriz[0][2] == 2) {
			if(matriz[1][1] == 2) {
				if (matriz[2][0] == 2) {
					return true;
				}
			}
		}
		return false;
		
	}
	
	
	
	
	
	
	
	
	
	

}
