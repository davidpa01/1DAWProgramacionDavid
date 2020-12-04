package examen_practica;

import javax.swing.JOptionPane;

import metodos.Utiles;

public class Examen_A_bolos {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int tirada = 0;
		//int k = 0;
		int opcion;
		int puntos = 0;
		int puntos2 = 0;
		int bolos[] = new int [10];
		int bolos2[] = new int [10];
		rellenarArray(bolos);
		System.out.println("Bolos J1");
		mostrarBolos(bolos);
		rellenarArray(bolos2);
		System.out.println("Bolos J2");
		mostrarBolos(bolos2);
		do {
			opcion = menu();
			switch (opcion) {
			case 0:
				System.out.println("El programa a finalizado");
				break;
			case 1:
				tirada++;
				int bolosTirados = tirarBolos(bolos, tirada);
				int bolosTirados2 = tirarBolos(bolos2 , tirada);
				puntos += puntos(tirada, bolosTirados);
				puntos2 += puntos(tirada, bolosTirados2);
				System.out.println("Los puntos del jugador 1 son: " + puntos);
				System.out.println("Los puntos del jugador 2 son: " + puntos2);

				break;
			default:
				System.out.println("Opción incorrecta, por favor vuelva a repitir");
				break;
			}
			
			System.out.println("");
			System.out.println("Bolos J1");
			mostrarBolos(bolos);
			System.out.println("Bolos J2");
			mostrarBolos(bolos2);
		}while(opcion != 0 && quedanBolos(bolos) && quedanBolos(bolos2));
		if (puntos > puntos2) {
			System.out.println("El jugador 1 ha ganado");
		}
		else if (puntos == puntos2) {
			System.out.println("Han quedado empate");
		}else {
			System.out.println("El jugador 2 ha ganado");
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public static int menu() {
		System.out.println("JUEGO DE LOS BOLOS");
		System.out.println("------------------");
		System.out.println("0.-Salir del programa");
		System.out.println("1.-Tirar");
		int op = Integer.parseInt(JOptionPane.showInputDialog("Elija una opción: "));
		System.out.println("");
		return op;
	}
	
	
	/**
	 * 
	 * @param array
	 */
	public static void rellenarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {		
			array[i] = 1;
		}
		
	}
	
	
	/**
	 * 
	 * @param array
	 */
	public static void mostrarBolos(int array[]) {
		for (int i = 0; i < 4; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		for (int i = 4; i < 7; i++) {
			System.out.print(" " + array[i]);
		}
		System.out.println("");
		System.out.print(" ");
		for (int i = 7; i < 9; i++) {
			System.out.print(" " + array[i]);
		}
		System.out.println("");
		for (int i = 9; i < array.length; i++) {
			System.out.print("   " + array[i]);
		}
		System.out.println("");
		
		
		
	}
	
	
	/**
	 * 
	 * @param array
	 */
	public static int tirarBolos(int array[],int tirada) {
		int k = 0;
		//int probabilidad = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				int azar = Utiles.obtenerNumeroAzar();
				if (azar > menorPorcentaje(tirada)) {
					array[i] = 0;
					k++;
				}				
			}
		}
		return k;
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	public static int probabilidad() {
		int probabilidad = Utiles.obtenerNumeroAzarEntreLimites(30, 70);
		return probabilidad;
	}
	
	
	
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static boolean quedanBolos(int array[]) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				  return true;
			}			
		}		
		return false;
		
	}
	
	
	
	
	
	/**
	 * 
	 * @param array
	 * @param tirada
	 * @return
	 */
	public static int puntos(int tirada,int k) {
		int puntos = 0;
			if (tirada == 1) {
				puntos = puntos + 10 * k;
			}
			if (tirada == 2) {
				puntos = puntos + 5 * k;
			}
			if (tirada == 3) {
				puntos = puntos + 2 * k;
			}
			if (tirada == 4) {
				puntos = puntos + 1 * k;
			}				
		return puntos;
	}
	
	
	
	
	
	
	public static int menorPorcentaje(int tirada) {
		int probJu = (tirada -1) * 10;
		if (probJu > 20) {
			probJu = 20;
		}
		int probCa = Utiles.obtenerNumeroAzarEntreLimites(50, 70);
		probCa -= probJu;
		
		return probCa;
	}
	
	
	
	
	
	
	
	
	
	
	
}
