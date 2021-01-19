package capitulo04.ejerciciosSobreHerencia.cuestionarioAbstracto;

public class PreguntaVF extends Pregunta {
	
	private String respuesta = "";

	
	public PreguntaVF() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PreguntaVF(String enuciado, int numero, String respuesta) {
		super(enuciado, numero);
		this.respuesta = respuesta;
	}

	@Override
	public String toString() {
		return "PreguntaVF [enuciado=" + enuciado + ", respuesta=" + respuesta + "]";
	}

	

	@Override
	public void mostrar() {
		System.out.println("Pregunta de verdadero y falso.");
		System.out.println(numero + " " + enuciado + "\n\tV" + "\n\tF");
	}

	@Override
	public boolean esCorrecta(String respuestaEsperada) {
		if (respuestaEsperada.equals(respuesta)) {
			return true;
		}		
		return false;
	}

	

	
	
	

}
