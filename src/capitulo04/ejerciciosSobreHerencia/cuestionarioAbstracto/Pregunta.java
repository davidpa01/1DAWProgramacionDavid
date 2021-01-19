package capitulo04.ejerciciosSobreHerencia.cuestionarioAbstracto;

public abstract class Pregunta {
	
	protected String enuciado = "";
	protected int numero;
	
	
	
	public Pregunta() {
		super();
	}


	public Pregunta(String enuciado, int numero) {
		super();
		this.enuciado = enuciado;
		this.numero = numero;
	}



	public String getEnuciado() {
		return enuciado;
	}


	public void setEnuciado(String enuciado) {
		this.enuciado = enuciado;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public abstract boolean esCorrecta(String respuestaEsperada);
	
	public abstract void mostrar();

	
}
