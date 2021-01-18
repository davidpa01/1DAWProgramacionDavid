package capitulo04.ejerciciosSobreHerencia.cuestionarioAbstracto;

public class PreguntaVF extends Pregunta {
	
	

	
	public PreguntaVF() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PreguntaVF(String enuciado, String respuesta) {
		super(enuciado, respuesta);
	}

	@Override
	public String toString() {
		return "PreguntaVF [enuciado=" + enuciado + ", respuesta=" + respuesta + "]";
	}

	

	@Override
	public void mostrar() {
		System.out.println("Pregunta de verdadero y falso.");
		System.out.println(enuciado + "\n\tV" + "\n\tF");
	}

	@Override
	public boolean esCorrecta(String respuestaEsperada) {
		if (respuestaEsperada.equals(respuesta)) {
			return true;
		}		
		return false;
	}

	

	
	
	

}
