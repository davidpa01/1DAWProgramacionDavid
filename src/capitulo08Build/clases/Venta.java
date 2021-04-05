package capitulo08Build.clases;

import java.sql.Date;

public class Venta {

	private int id;
	private int idCliente;
	private int idConcesionario;
	private int idCoche;
	private java.util.Date fecha;
	private Double precioVenta;
	
	
	/**
	 * 
	 */
	public Venta() {

	}


	/**
	 * @param id
	 * @param idCliente
	 * @param idConcesionario
	 * @param idCoche
	 * @param fecha
	 * @param precioVenta
	 */
	public Venta(int id, int idCliente, int idConcesionario, int idCoche, java.util.Date fecha, Double precioVenta) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.idConcesionario = idConcesionario;
		this.idCoche = idCoche;
		this.fecha = fecha;
		this.precioVenta = precioVenta;
	}


	@Override
	public String toString() {
		return "Venta [id=" + id + ", idCliente=" + idCliente + ", idConcesionario=" + idConcesionario + ", idCoche="
				+ idCoche + ", fecha=" + fecha + ", precioVenta=" + precioVenta + "]";
	}


	
	
	
	//getters y setters
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the idCliente
	 */
	public int getIdCliente() {
		return idCliente;
	}


	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	/**
	 * @return the idConcesionario
	 */
	public int getIdConcesionario() {
		return idConcesionario;
	}


	/**
	 * @param idConcesionario the idConcesionario to set
	 */
	public void setIdConcesionario(int idConcesionario) {
		this.idConcesionario = idConcesionario;
	}


	/**
	 * @return the idCoche
	 */
	public int getIdCoche() {
		return idCoche;
	}


	/**
	 * @param idCoche the idCoche to set
	 */
	public void setIdCoche(int idCoche) {
		this.idCoche = idCoche;
	}


	/**
	 * @return the fecha
	 */
	public java.util.Date getFecha() {
		return fecha;
	}


	/**
	 * @param date the fecha to set
	 */
	public void setFecha(java.util.Date date) {
		this.fecha = date;
	}


	/**
	 * @return the precioVenta
	 */
	public Double getPrecioVenta() {
		return precioVenta;
	}


	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}


	



	
	
	

}
