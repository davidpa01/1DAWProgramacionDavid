package capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class Led extends Componente {

	protected String color;

	
	
	public Led() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Led(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Led [color=" + color + ", nombre=" + nombre + ", componenteAnt=" + componenteAnt + ", componentePost="
				+ componentePost + "]";
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
