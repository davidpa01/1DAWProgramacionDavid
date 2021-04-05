package capitulo08Build.clases;

public class Coche {

	private int id;
	private int idFabricante;
	private String bastidor;
	private String modelo;
	private String color;
	
	
	/**
	 * 
	 */
	public Coche() {

	}



	/**
	 * 
	 * @param id
	 * @param idFabricante
	 * @param bastidor
	 * @param modelo
	 * @param color
	 */
	public Coche(int id, int idFabricante, String bastidor, String modelo, String color) {
		super();
		this.id = id;
		this.idFabricante = idFabricante;
		this.bastidor = bastidor;
		this.modelo = modelo;
		this.color = color;
	}



	@Override
	public String toString() {
		return "" + this.id;
	}


	
	//Getters y Setters

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
	 * @return the idFabricante
	 */
	public int getIdFabricante() {
		return idFabricante;
	}



	/**
	 * @param idFabricante the idFabricante to set
	 */
	public void setIdFabricante(int idFabricante) {
		this.idFabricante = idFabricante;
	}



	/**
	 * @return the bastidor
	 */
	public String getBastidor() {
		return bastidor;
	}



	/**
	 * @param bastidor the bastidor to set
	 */
	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}



	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}



	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}



	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	

}
