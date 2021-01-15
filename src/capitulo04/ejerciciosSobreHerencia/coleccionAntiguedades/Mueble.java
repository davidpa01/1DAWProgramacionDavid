package capitulo04.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Mueble extends Antiguedad {

	protected String madera;

	
	
	
	public Mueble() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Mueble(int fechaCreacion, String origen, float precio, String madera) {
		super(fechaCreacion, origen, precio);
		this.madera = madera;
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Mueble [madera=" + madera + ", fechaCreacion=" + fechaCreacion + ", origen=" + origen + ", precio="
				+ precio + "]";
	}



	public String getMadera() {
		return madera;
	}



	public void setMadera(String madera) {
		this.madera = madera;
	}
	
	
	
	
	
}
