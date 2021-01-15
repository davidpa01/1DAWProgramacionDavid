package capitulo04.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Libro extends Antiguedad {

	protected String autor;
	protected String titulo;
	
	
	
	
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Libro(int fechaCreacion, String origen, float precio, String autor, String titulo) {
		super(fechaCreacion, origen, precio);
		this.autor = autor;
		this.titulo = titulo;
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", fechaCreacion=" + fechaCreacion + ", origen="
				+ origen + ", precio=" + precio + "]";
	}




	public String getAutor() {
		return autor;
	}




	public void setAutor(String autor) {
		this.autor = autor;
	}




	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	
	
	
	
}
