package capitulo04.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Antiguedad {
	protected int fechaCreacion;
	protected String origen;
	protected float precio;
	
	
	
	
	public Antiguedad() {
		super();
	}




	public Antiguedad(int fechaCreacion, String origen, float precio) {
		super();
		this.fechaCreacion = fechaCreacion;
		this.origen = origen;
		this.precio = precio;
	}




	@Override
	public String toString() {
		return "Antiguedad [fechaCreacion=" + fechaCreacion + ", origen=" + origen + ", precio=" + precio + "]";
	}




	public int getFechaCreacion() {
		return fechaCreacion;
	}




	public void setFechaCreacion(int fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}




	public String getOrigen() {
		return origen;
	}




	public void setOrigen(String origen) {
		this.origen = origen;
	}




	public float getPrecio() {
		return precio;
	}




	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
