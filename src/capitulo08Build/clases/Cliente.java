package capitulo08Build.clases;

import java.sql.Date;

public class Cliente {

	private int id;
	private String nombre;
	private String apellido;
	private String localidad;
	private String dniNIe;
	private java.util.Date fecha;
	private boolean activo;
	
	
	/**
	 * 
	 */
	public Cliente() {

	}


	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param localidad
	 * @param dniNIe
	 * @param fecha
	 * @param activo
	 */
	public Cliente(int id, String nombre, String apellido, String localidad, String dniNIe, java.util.Date fecha,
			boolean activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.localidad = localidad;
		this.dniNIe = dniNIe;
		this.fecha = fecha;
		this.activo = activo;
	}


	@Override
	public String toString() {
		return this.apellido + ", " + this.nombre + ", " + this.dniNIe;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}


	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}


	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	/**
	 * @return the dniNIe
	 */
	public String getDniNIe() {
		return dniNIe;
	}


	/**
	 * @param dniNIe the dniNIe to set
	 */
	public void setDniNIe(String dniNIe) {
		this.dniNIe = dniNIe;
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
	 * @return the activo
	 */
	public boolean isActivo() {
		return activo;
	}


	/**
	 * @param activo the activo to set
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}



	
	
	

}
