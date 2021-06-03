package examen;

public class Cliente {

	private int id;
	private String nombre;
	private String apellidos;
	private String localidad;
	private String dniNie;
	private String email;
	
	
	
	
	/**
	 * 
	 */
	public Cliente() {
		super();
	}



	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param localidad
	 * @param dniNie
	 * @param email
	 */
	public Cliente(int id, String nombre, String apellidos, String localidad, String dniNie, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.localidad = localidad;
		this.dniNie = dniNie;
		this.email = email;
	}



	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", localidad=" + localidad
				+ ", dniNie=" + dniNie + ", email=" + email + "]";
	}


	//getters y setters
	
	
	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}


	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
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
	public String getApellidos() {
		return apellidos;
	}


	/**
	 * 
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	/**
	 * 
	 * @return
	 */
	public String getLocalidad() {
		return localidad;
	}


	/**
	 * 
	 * @param localidad
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	/**
	 * 
	 * @return
	 */
	public String getDniNie() {
		return dniNie;
	}


	/**
	 * 
	 * @param dniNie
	 */
	public void setDniNie(String dniNie) {
		this.dniNie = dniNie;
	}


	/**
	 * 
	 * @return
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	


}
