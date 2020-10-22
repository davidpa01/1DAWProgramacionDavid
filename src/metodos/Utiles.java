package metodos;

public class Utiles {
	public static int obtenerNumeroAzar () {
		 return (int) Math.round(Math.random() * 100);
	}

	public static int obtenerNumeroAzarEntreLimites (int minimo, int maximo) {
		 return (int) Math.round(Math.random() * (maximo - minimo) + minimo);
	}
}