package capitulo04.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Joya extends Antiguedad {
	
	protected String material;

	
	
	
	public Joya() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Joya(int fechaCreacion, String origen, float precio, String material) {
		super(fechaCreacion, origen, precio);
		this.material = material;
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Joya [material=" + material + ", fechaCreacion=" + fechaCreacion + ", origen=" + origen + ", precio="
				+ precio + "]";
	}



	public String getMaterial() {
		return material;
	}



	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
	
	
}
