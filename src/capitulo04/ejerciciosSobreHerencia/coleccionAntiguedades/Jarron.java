package capitulo04.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Jarron extends Antiguedad {

	protected String dibujo;

	
	
	public Jarron() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Jarron(int fechaCreacion, String origen, float precio, String dibujo) {
		super(fechaCreacion, origen, precio);
		this.dibujo = dibujo;
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Jarron [dibujo=" + dibujo + ", fechaCreacion=" + fechaCreacion + ", origen=" + origen + ", precio="
				+ precio + "]";
	}




	public String getDibujo() {
		return dibujo;
	}




	public void setDibujo(String dibujo) {
		this.dibujo = dibujo;
	}
	
	
	
	
	
}