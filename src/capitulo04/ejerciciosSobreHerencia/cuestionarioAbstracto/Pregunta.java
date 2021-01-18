package capitulo04.ejerciciosSobreHerencia.cuestionarioAbstracto;

public abstract class Pregunta {
	
	protected String enuciado = "";
	protected String respuesta = "";
	
	
	
	public Pregunta() {
		super();
	}


	public Pregunta(String enuciado, String respuesta) {
		super();
		this.enuciado = enuciado;
		this.respuesta = respuesta;
	}


//	@Override
//	public String toString() {
//		return "Pregunta [enuciado=" + enuciado + ", numero=" + respuesta + "]";
//	}


	public String getEnuciado() {
		return enuciado;
	}


	public void setEnuciado(String enuciado) {
		this.enuciado = enuciado;
	}


	public String getRespuesta() {
		return respuesta;
	}


	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	public abstract boolean esCorrecta(String respuestaEsperada);
	
	public abstract void mostrar();

	
}
