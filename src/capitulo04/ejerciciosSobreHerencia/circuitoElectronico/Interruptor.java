package capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class Interruptor extends Componente {

	protected String posicion;

	
	
	public Interruptor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Interruptor(String nombre, String posicion) {
		this.nombre = nombre;
		this.posicion = posicion;
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Interruptor [posicion=" + posicion + ", nombre=" + nombre + ", componenteAnt=" + componenteAnt.getNombre()
				+ ", componentePost=" + componentePost.getNombre() + "]";
	}



	public String getPosicion() {
		return posicion;
	}



	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
	
}
