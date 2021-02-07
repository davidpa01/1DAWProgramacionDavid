package hashMap.ejercicio01;

public class Articulo {
	
	protected String codigoBarras;
	protected int numeroEstante;
	
	
	
	
	public Articulo() {
		super();
	}




	public Articulo(String codigoBarras, int numeroEstante) {
		super();
		this.codigoBarras = codigoBarras;
		this.numeroEstante = numeroEstante;
	}




	@Override
	public String toString() {
		return "Articulo [codigoBarras=" + codigoBarras + ", numeroEstante=" + numeroEstante + "]";
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
	
	
	
	

}
