package capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class Bateria extends Componente {
	
	protected int voltio;

	
	
	
	public Bateria() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Bateria(String nombre,int voltio) {
		this.nombre = nombre;
		this.voltio = voltio;
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Bateria [voltio=" + voltio + ", nombre=" + nombre + ", componenteAnt=" + componenteAnt
				+ ", componentePost=" + componentePost + "]";
	}



	public int getVoltio() {
		return voltio;
	}



	public void setVoltio(int voltio) {
		this.voltio = voltio;
	}
	
	
	
	
}
