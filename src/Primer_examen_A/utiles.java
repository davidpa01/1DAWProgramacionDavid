package Primer_examen_A;

public class utiles {
	public static int obtenerNumeroAzar () {
		 return (int) Math.round(Math.random() * 1000);
	}
	public static int obtenerNumeroAzar100 () {
		 return (int) Math.round(Math.random() * 100);
	}
	public static int obtenerNumeroAzarEntreLimites (int minimo, int maximo) {
		 return (int) Math.round(Math.random() * (maximo - minimo) + minimo);
	}
	public static int obtenerNumeroAzarEntreLimites_c () {
		 return (int) Math.round(Math.random() * (100 - 25) + 25);
	}
}
