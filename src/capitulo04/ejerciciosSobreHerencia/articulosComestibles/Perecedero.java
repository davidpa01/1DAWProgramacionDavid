package capitulo04.ejerciciosSobreHerencia.articulosComestibles;

public class Perecedero extends Articulo {
	
	protected String fechaCaducidad;

	
	
	
	/**
	 * 
	 */
	public Perecedero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perecedero(String codigo, String nombre, float precio, String fechaCaducidad) {
		super(codigo, nombre, precio);
		this.fechaCaducidad = fechaCaducidad;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Articulo [fechaCaducidad=" + fechaCaducidad + ", codigo=" + codigo + ", nombre=" + nombre
				+ ", precio=" + precio + "]";
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}


	
	
	
	
	
	
}
