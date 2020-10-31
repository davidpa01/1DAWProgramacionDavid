package metodos;

public class Utiles {
	
	public static int obtenerNumeroAzar () {
		 return (int) Math.round(Math.random() * 100);
	}

	public static int obtenerNumeroAzarEntreLimites (int minimo, int maximo) {
		 return (int) Math.round(Math.random() * (maximo - minimo) + minimo);
	}
	
	public static void imprimir_array_5 (int[] array) {
		int array1[] = new int [5];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = Utiles.obtenerNumeroAzar();
			System.out.print(array1[i] + " ");
		}
		
	}
	
	public static void imprimir_array_150 (int[] array) {
		int array1[] = new int [150];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = Utiles.obtenerNumeroAzar();
			System.out.print(array1[i] + " ");
		}
		
	}
}