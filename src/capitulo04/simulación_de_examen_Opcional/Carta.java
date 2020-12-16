package capitulo04.simulación_de_examen_Opcional;

public class Carta {
	private int valor;
	private String palo;
	private int id;
	
	
	/**
	 * 
	 */
	public Carta() {
	}
	
	
	/**
	 * 
	 * @param valorCarta
	 * @param palo
	 * @param id
	 */
	public Carta(int valor, String palo, int id) {
		this.valor = valor;
		this.palo = palo;
		this.id = id;
	}


	/**
	 * 
	 */
	public String toString() {
		return "Carta [valorCarta= " + valor + ", palo= " + palo + ", id= " + id + "]";
	}

//	getters y setters
	public int getValor() {
		return valor;
	}

	/**
	 * 
	 * @param valorCarta
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * 
	 * @return
	 */
	public String getPalo() {
		return palo;
	}

	/**
	 * 
	 * @param palo
	 */
	public void setPalo(String palo) {
		this.palo = palo;
	}

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
	
	
	
	
	
	
	
	
	
	
}
