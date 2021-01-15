package capitulo04.ejerciciosSobreHerencia.coleccionAntiguedades;

public class ColeccionAntiguedades {

	public static void main(String[] args) {
		Joya diamante = new Joya(1495, "Córdoba", (float) 10234.4, "carbón");
		Mueble armario = new Mueble(1543, "Sevilla", (float) 1034.4, "roble");
		Libro libro = new Libro(1295, "Málaga", (float) 35.4, "Antonio", "Federico el lobo");
		Jarron jarron = new Jarron(1995, "EEUU", (float) 1234.4,"flores");
		System.out.println(diamante + "\n" + armario + "\n" + libro + "\n" + jarron);
	}

}
