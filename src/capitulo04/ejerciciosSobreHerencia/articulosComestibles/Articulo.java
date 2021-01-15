package capitulo04.ejerciciosSobreHerencia.articulosComestibles;
/**
 * 
 * @author david
 *
 */
public class Articulo {
	protected String codigo;
	protected String nombre;
	protected float precio;
	
	
	
	
	/**
	 * 
	 */
	public Articulo() {
		super();
	}


	/**
	 * 
	 * @param codigo
	 * @param nombre
	 * @param precio
	 */
	public Articulo(String codigo, String nombre, float precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "Articulos [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}



	//getters y setters
	
	/**
	 * 
	 * @return
	 */
	public String getCodigo() {
		return codigo;
	}


	/**
	 * 
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * 
	 * @return
	 */
	public float getPrecio() {
		return precio;
	}


	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
	
}
