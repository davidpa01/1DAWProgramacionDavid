package capitulo04.ejerciciosSobreHerencia.cuestionarioAbstracto;

public class PreguntaOpU extends Pregunta {
	
	private String a = "";
	private String b = "";
	private String c = "";
	private String d = "";

	public PreguntaOpU() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PreguntaOpU(String enuciado, String respuesta, String a, String b, String c, String d) {
		super(enuciado, respuesta);
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	@Override
	public void mostrar() {
		System.out.println("Pregunta de opción unica.");
		System.out.println(enuciado + "\n\tA) " + a + "\n\tB) " + b + "\n\tC) " + c + "\n\tD) " + d);
		
	}

	@Override
	public boolean esCorrecta(String respuestaEsperada) {
		if (respuestaEsperada.equals(respuesta)) {
			return true;
		}
		return false;
	}

	
	
	

}
