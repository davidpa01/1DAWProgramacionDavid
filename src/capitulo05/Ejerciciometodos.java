package capitulo05;

import javax.swing.JOptionPane;

public class Ejerciciometodos {

	public static void main(String[] args) {
		
//		primer
		
//		System.out.println(media(7, 6, 10, 3.95f));
		
//		segundo
		
		System.out.println("El maximo es 50 el minimo es 1 y tu numero es " + obtenerNumeroDeUsuarioEntreMinimoYMaxim(1, 50));
		
//		tercero
		
//		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
//		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
//		System.out.println("El maximo es " + maximo(n1, n2));
		
//		cuarto
		
//		System.out.println(numeroImparEntreLimites(10, 50));
		
//		quinto
		
//		getStringFromEntero((int) Math.round(Math.random()* 10));
		
//		sexto
		
//		imprimeMinimoAMaximo(3, 2, 34);
		
//		septimo
		
//		int[] array =  fibonacci(15);
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
		
//		octavo
		
//		int array[] = new int [10];
//		imprimeArray(array);
		
//		noveno
		
//		int array[] = new int [10];
//		for (int i = 0; i < array.length; i++) {
//			array[i] = i;
//		}
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
//		System.out.println("");
//		array = recorte(array, 2, 6);
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
		
//		decimo
		
//		números_1_100(0);						
		
		
		
	}
	/**
	 * 1º.- Método que reciba como parámetros de entrada tres valores enteros y uno flotante.
	 * El método se llamará "media" y debe devolver la media aritmética de los cuatro valores. 
	 * El valor devuelto debe ser flotante. El método "main" debe llamar a este otro método, 
	 * con valores inventados por ti, e imprimir el valor de la media en la consola de salida.
	 */
	
	public static float media (int n1, int n2, int n3, float n4) {
		return (n1 + n2 + n3 + n4) / 4;
	}
	
	/**
	 * 2º.- Método llamado "obtenerNumeroDeUsuarioEntreMinimoYMaximo" que reciba dos valores enteros: un valor mínimo y un valor máximo. 
	 * El método debe pedir un numero al usuario. El método examinará el número introducido por el usuario y, si dicho número no está 
	 * entre el valor mínimo y el máximo que se ha indicado, seguirá pidiendo números al usuario hasta que se obtenga uno válido. 
	 * Finalmente se debe devolver dicho valor del usuario al método main, que lo imprimirá en la consola.
	 */
	
	public static int obtenerNumeroDeUsuarioEntreMinimoYMaxim(int minimo, int maximo) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
		if (num > minimo && num < maximo) {
			return num;
		}else {
			return obtenerNumeroDeUsuarioEntreMinimoYMaxim(minimo, maximo);
		}
	}
	
	/**
	 * 3º.- Método llamado "maximo" que devuelva el valor máximo de dos números enteros recibidos como argumentos de entrada. 
	 * El método main pedirá dos números al usuario y los enviará a este nuevo método. Finalmente imprimirá en consola el valor
	 * devuelto por el método.
	 */
	
	public static int maximo (int n1, int n2) {
		if (n1 > n2) {
			return n1;
		}
		else {
			return n2;
		}
	}
	
	/**
	 * 4º.- Método llamado "numeroImparEntreLimites" que devuelva un número entero aleatorio, impar y comprendido entre dos límites recibidos
	 *  como parámetros de entrada. "main" debe llamar a este método e imprimir el valor devuelto.
	 */
	
	public static int numeroImparEntreLimites(int minimo, int maximo) {
		int num = (int) Math.round(Math.random()* (maximo - minimo) + minimo);
		if (num % 2 != 0) {
			return num;
		}else {
			return numeroImparEntreLimites(minimo, maximo);
		}
		
	}
	
	/**
	 * 5º.- Realiza un método que reciba un valor entero, del 1 al 10, como argumento de entrada y devuelva un String, 
	 * con  dicho número escrito en palabras. Llama a este método "getStringFromEntero".
	 */
	
	public static void getStringFromEntero(int num) {
		switch (num) {
		case 0:
			System.out.println("cero");
			break;
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("dos");
			break;
		case 3:
			System.out.println("tres");
			break;
		case 4:
			System.out.println("cuatro");
			break;
		case 5:
			System.out.println("cinco");
			break;
		case 6:
			System.out.println("seis");
			break;
		case 7:
			System.out.println("siete");
			break;
		case 8:
			System.out.println("ocho");
			break;
		case 9:
			System.out.println("nueve");
			break;
		case 10:
			System.out.println("diez");
			break;
		}
	}
	
	/**
	 *6º.- Método, llamado "imprimeMinimoAMaximo", que reciba tres valores enteros como argumentos de entrada. 
	 *Debe imprimir dichos valores en orden de menor a mayor.
	 */
	
	public static void imprimeMinimoAMaximo(int num1, int num2, int num3) {
		if (num1 < num2 && num1 <num3) {
			System.out.print(num1 + ", ");
			if (num2 < num3) {
				System.out.print(num2 + ", " + num3);
			}else {
				System.out.print(num3 + ", " + num2);
			}
		}
		if (num2 < num1 && num2 <num3) {
			System.out.print(num2 + ", ");
			if (num1 < num3) {
				System.out.print(num1 + ", " + num3);
			}else {
				System.out.print(num3 + ", " + num1);
			}
		}
		if (num3 < num2 && num1 > num3) {
			System.out.print(num3 + ", ");
			if (num2 < num1) {
				System.out.print(num2 + ", " + num1);
			}else {
				System.out.print(num1 + ", " + num2);
			}
		}
	}
	
	/**
	 * 7º.- La serie de Fibonacci es una serie numérica que comienza en los números 1, 1 y continua de forma infinita, 
	 * calculando cada mienbro de la serie como la suma de los dos anteriores. De esta manera, la serie de Fibonacci 
	 * comienza 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.......... Debes realizar un método llamado "fibonacci". Recibirá un argumento 
	 * de entrada, de tipo entero. El método debe devolver un array con la serie de Fibonacci. El parámetro de entrada del método 
	 * determinará la longitud del array a devolver. El método main recibirá el array y lo imprimirá en la consola
	 */
	
	public static int[] fibonacci(int longitud) {
		int array[] = new int [longitud];
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i <array.length; i ++) {
			array[i] = array[i - 2] + array[i - 1];
		}
		return array;
	}
	
	/**
	 * 8º.- Método que imprima en pantalla un array, recibirá un array como parámetro de entrada y lo mostrará en consola. 
	 * Main debe enviar el array al método, llamado "imprimeArray".
	 */
	public static void imprimeArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()* 100);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	
	/**
	 * 9º.- Método que "recorte" un array. El método recibirá un array, un "primerIndice" y un "ultimoIndice" y debe devolver un
	 * array, formado con los elementos del array recibido, cuyos índices estén dentro del intervalo cerrado formado por los dos
	 * índices recibidos
	 */
	
	public static int[] recorte(int[] array, int indiceIn, int indiceFin) {
		int array1[] = new int [(indiceFin - indiceIn) +1];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = array[i + indiceIn];
		}
		return array1;
	}
	
	/**
	 * 10º.- Método que muestre en pantalla los números del 1 al 100. 
	 * El único requisito para esto es que debe hacerse utilizando la recursividad.
	 */
	
	public static void números_1_100(int numero) {
		if (numero <= 100) {
			System.out.print(numero + " ");
			números_1_100(numero + 1);			
		}
		
	}
}
