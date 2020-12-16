package capitulo04.Simulación_de_examen_SpaceInvaders;

public class Principal {

	public static void main(String[] args) {
		CampoBatalla arena = new CampoBatalla();
		arena.setNombre("arena1");
		arena.mezclar();
		arena.disparar(arena);
		arena.disparosREcividos();
		arena.mayorMenor(arena);

		
	}

}
