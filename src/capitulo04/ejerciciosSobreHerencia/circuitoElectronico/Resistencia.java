package capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class Resistencia extends Componente {

	protected int ohmios;

	
	
	public Resistencia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Resistencia(String nombre, int ohmios) {
		this.nombre = nombre;
		this.ohmios = ohmios;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Resistencia [ohmios=" + ohmios + ", nombre=" + nombre + ", componenteAnt=" + componenteAnt.getNombre()
				+ ", componentePost=" + componentePost.getNombre() + "]";
	}

	public int getOhmios() {
		return ohmios;
	}

	public void setOhmios(int ohmios) {
		this.ohmios = ohmios;
	}
	
	
	
	
}
