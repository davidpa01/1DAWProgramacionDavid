package capitulo04.ejerciciosSobreHerencia.cuestionarioAbstracto;


public class PreguntaOpU extends Pregunta {
	
	private int solucion;
	
	
	String respuestas[] = new String[5];

	public PreguntaOpU() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PreguntaOpU(String enuciado,int numero, int solucion, String[] respuestas) {
		super(enuciado, numero);
		this.solucion = solucion;
		this.respuestas= respuestas;
	}
	
	@Override
	public void mostrar() {
		System.out.println("Pregunta de opción unica.");
		System.out.println(numero + " " + enuciado);
		for (int i = 0; i < respuestas.length; i++) {
			System.out.print("\n" + i + " " + respuestas[i]);
		}
		
		
	}

	@Override
	public boolean esCorrecta(String respuestaEsperada) {
		if (solucion == Integer.parseInt(respuestaEsperada)) {
			return true;
		}
		return false;
	}
}
