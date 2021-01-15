package capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class Circuito {

	public static void main(String[] args) {
		
		Bateria bateria = new Bateria("bateria", 25);
		Resistencia resistencia = new Resistencia("resistencia", 15);
		Interruptor interruptor = new Interruptor("interruptor", "encendido");
		Led led = new Led("led", "rojo");
		bateria.setComponenteAnt(interruptor);
		bateria.setComponentePost(resistencia);
		resistencia.setComponenteAnt(bateria);
		resistencia.setComponentePost(led);
		interruptor.setComponenteAnt(led);
		interruptor.setComponentePost(bateria);
		led.setComponenteAnt(resistencia);
		led.setComponentePost(interruptor);
		
		System.out.println(bateria + "\n" + resistencia + "\n" + interruptor + "\n" + led);

	}

}
