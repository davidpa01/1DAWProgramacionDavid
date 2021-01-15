package capitulo04.ejerciciosSobreHerencia.articulosComestibles;

public class Tienda {

	public static void main(String[] args) {
		Perecedero art1 = new Perecedero("a12d", "uvas", (float) 3.5, "10/11/21");
		Perecedero art2 = new Perecedero("a13d", "manzanas", (float) 2.5, "10/01/21");
		No_perecedero art3 = new No_perecedero("a14d", "vino", (float) 43.5);
		No_perecedero art4 = new No_perecedero("a15d", "queso", (float) 33.5);
		System.out.println(art1 + "\n" + art3 + "\n" + art2 + "\n" + art4);
	}

}
