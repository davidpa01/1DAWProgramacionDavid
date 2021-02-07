package hashMap.ejercicio02;

public class Articulo {
	
	protected String codigoBarras;
	protected int numeroEstante;
	protected String nombre;
	protected int numeroStock;
	
	
	
	
	public Articulo() {
		super();
	}




	public Articulo(String codigoBarras, int numeroEstante, String nombre, int numeroStock) {
		super();
		this.codigoBarras = codigoBarras;
		this.numeroEstante = numeroEstante;
		this.nombre = nombre;
		this.numeroStock = numeroStock;
	}




	public Articulo(String codigoBarras, int numeroEstante) {
		super();
		this.codigoBarras = codigoBarras;
		this.numeroEstante = numeroEstante;
	}




	@Override
	public String toString() {
		return "Articulo [codigoBarras=" + codigoBarras + ", numeroEstante=" + numeroEstante + ", nombre=" + nombre
				+ ", numeroStock=" + numeroStock + "]";
	}


	//getters y setters

	public String getCodigoBarras() {
		return codigoBarras;
	}




	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}




	public int getNumeroEstante() {
		return numeroEstante;
	}




	public void setNumeroEstante(int numeroEstante) {
		this.numeroEstante = numeroEstante;
	}
	
	
	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getNumeroStock() {
		return numeroStock;
	}




	public void setNumeroStock(int numeroStock) {
		this.numeroStock = numeroStock;
	}
	
	
	
	

}
