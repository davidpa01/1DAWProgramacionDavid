package capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class Componente {
	
	protected String nombre;
	protected Componente componenteAnt;
	protected Componente componentePost;
	
	
	
	public Componente() {
		super();
	}



	public Componente(String nombre, Componente componenteAnt, Componente componentePost) {
		super();
		this.nombre = nombre;
		this.componenteAnt = componenteAnt;
		this.componentePost = componentePost;
	}



	@Override
	public String toString() {
		return "Componente [nombre=" + nombre + ", componenteAnt=" + componenteAnt.getNombre() + ", componentePost="
				+ componentePost.getNombre() + "]";
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Componente getComponenteAnt() {
		return componenteAnt;
	}



	public void setComponenteAnt(Componente componenteAnt) {
		this.componenteAnt = componenteAnt;
	}



	public Componente getComponentePost() {
		return componentePost;
	}



	public void setComponentePost(Componente componentePost) {
		this.componentePost = componentePost;
	}
	
	
	
	
}
