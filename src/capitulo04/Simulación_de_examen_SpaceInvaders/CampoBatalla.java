package capitulo04.Simulación_de_examen_SpaceInvaders;

import java.util.Arrays;

import org.omg.CORBA.PUBLIC_MEMBER;

import capitulo04.simulación_de_examen_Opcional.Carta;
import metodos.Utiles;

public class CampoBatalla {
	private String nombre;
	private Malvado marcianos[] = new Malvado[20];
	private Humano ejercito[] = new Humano[20];
	
	
	public CampoBatalla() {
		
		for (int i = 0; i < marcianos.length; i++) {
			Malvado malvado = new Malvado("malvado" + i);
			
			marcianos[i] = malvado;
			
		}
		
		marcianos[marcianos.length-1].setPuntosVida(marcianos[marcianos.length-1].getPuntosVida() * 2); 
		
		for (int i = 0; i < ejercito.length; i++) {
			Humano humano = new Humano("humano" + i);
			
			ejercito[i] = humano;
		
		}
		
		ejercito[ejercito.length-1].setPuntosVida(ejercito[ejercito.length-1].getPuntosVida() * 2);
	
	}
	
	
	public void mezclar() {
		for (int i = 0; i < 100; i++) {
			int indice1 = Utiles.obtenerNumeroAzarEntreLimites(0, marcianos.length - 1);
			int indice2 = Utiles.obtenerNumeroAzarEntreLimites(0, marcianos.length - 1);
			Malvado aux = marcianos[indice1];
			marcianos[indice1] = marcianos[indice2];
			marcianos[indice2] = aux;
			
			int indice3 = Utiles.obtenerNumeroAzarEntreLimites(0, marcianos.length - 1);
			int indice4 = Utiles.obtenerNumeroAzarEntreLimites(0, marcianos.length - 1);
			Humano aux1 = ejercito[indice3];
			ejercito[indice3] = ejercito[indice4];
			ejercito[indice4] = aux1;
		}
		
		
		
	}
	
	
	public void disparar(CampoBatalla arena) {
		int cdM = 0;
		int cdH = 0;
		System.out.println("\nEmpieza la batalla\n");
		do {
			System.out.println("\nLa lucha continua\n");
			Humano humano = primerHumanoVivo();
			Malvado malvado = primerMalvadoVivo();
			
			malvado.setPuntosVida(malvado.getPuntosVida() - Utiles.obtenerNumeroAzarEntreLimites(5, 25));
			cdH++;
			if (malvado.getPuntosVida() <= 0) {
				malvado.setVivo(false);
				malvado.setCdH(cdH);
				cdH = 0;
			}
			
			humano.setPuntosVida(humano.getPuntosVida() - Utiles.obtenerNumeroAzarEntreLimites(5, 25));
			cdM++;
			if (humano.getPuntosVida() <= 0) {
				humano.setVivo(false);
				humano.setCdM(cdM);
				cdM = 0;
			}
			
			System.out.println(arena.toString());
			
		}while(quedanHumanos() && quedanMalvados());
		
		if (quedanHumanos()) {
			System.out.println("\nLos ganadores son los humanos");
		}
		if (quedanMalvados()) {
			System.out.println("\nLos ganadores son los malvados");
		}
		
	}
	
	public void ordenar() {
		boolean hayIntercambios;
		do {
			hayIntercambios = false;
			// Empieza el algoritmo
			for (int i = 0; i < marcianos.length - 1; i++) {
				if (marcianos[i+1].getCdH() < marcianos[i].getCdH()) {
					// Entonces hago un intercambio
					Malvado aux = marcianos[i+1];
					marcianos[i+1] = marcianos[i];
					marcianos[i] = aux;
					hayIntercambios = true;
				}
			}
		} while (hayIntercambios == true);
		
		
		
		do {
			hayIntercambios = false;
			// Empieza el algoritmo
			for (int i = 0; i < ejercito.length - 1; i++) {
				if (ejercito[i+1].getCdM() < ejercito[i].getCdM()) {
					// Entonces hago un intercambio
					Humano aux = ejercito[i+1];
					ejercito[i+1] = ejercito[i];
					ejercito[i] = aux;
					hayIntercambios = true;
				}
			}
		} while (hayIntercambios == true);
	}
	
	
	
	
	public void mayorMenor(CampoBatalla arena) {
		
		arena.ordenar();
		
		System.out.println("\nEl que mas y menos disparos han necesitado\n");
		
		if (ejercito[ejercito.length-1].getCdM() > marcianos[marcianos.length-1].getCdH()) {
			System.out.println(ejercito[ejercito.length-1] + " Es el que mas disparos ha necesitado disparos = " + ejercito[ejercito.length-1].getCdM());
		}else {
			if (ejercito[ejercito.length-1].getCdM() < marcianos[marcianos.length-1].getCdH()) {
				System.out.println(marcianos[marcianos.length-1] + " Es el que mas disparos ha necesitado disparos = " + marcianos[marcianos.length-1].getCdH());
			}else {
				System.out.println(marcianos[marcianos.length-1] + " y " + ejercito[ejercito.length-1] + " Son los que mas disparos ha necesitado disparos = "  
									+ marcianos[marcianos.length-1].getCdH());
			}
		}
		int contH = 0;
		int contM = 0;
		for (int i = 0; i < ejercito.length; i++) {
			if (ejercito[i].getCdM() == 0) {
				contH++;
			}else {
				break;
			}
		}
		for (int i = 0; i < marcianos.length; i++) {
			if (marcianos[i].getCdH() == 0) {
				contM++;
			}else {
				break;
			}
		}
		if (ejercito[contH].getCdM() < marcianos[contM].getCdH()) {
			System.out.println(ejercito[contH] + " Es el que menos disparos ha necesitado disparos = " + ejercito[contH].getCdM());
		}else {
			if (ejercito[contH].getCdM() > marcianos[contM].getCdH()) {
				System.out.println(marcianos[contM] + " Es el que menos disparos ha necesitado disparos = " + marcianos[contM].getCdH());
			}else {
				System.out.println(marcianos[contM] + " y " + ejercito[contH] + " Son los que menos disparos ha necesitado disparos = " + marcianos[contM].getCdH());
			}
		}
	}
	
	public void disparosREcividos() {
		
		System.out.println("\nEstadisticas\n");
		
		for (int i = 0; i < ejercito.length; i++) {
			System.out.println(ejercito[i] + " Disparos = " + ejercito[i].getCdM());
		}
		
		for (int i = 0; i < marcianos.length; i++) {
			System.out.println(marcianos[i] + " Disparos = " + marcianos[i].getCdH());
		}
	}
	
	
	
	
	public Humano primerHumanoVivo() {
		for (int i = 0; i < ejercito.length; i++) {
			if (ejercito[i].isVivo()) {
				return ejercito[i];
			}
		}
		return null;
	}
	
	
	
	public Malvado primerMalvadoVivo() {
		for (int i = 0; i < marcianos.length; i++) {
			if (marcianos[i].isVivo()) {
				return marcianos[i];
			}
		}
		return null;
	}
	
	
	public boolean quedanMalvados() {
		for (int i = 0; i < marcianos.length; i++) {
			if (marcianos[i].isVivo()) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean quedanHumanos() {
		for (int i = 0; i < ejercito.length; i++) {
			if (ejercito[i].isVivo()) {
				return true;
			}
		}
		return false;
	}
	

	public String toString() {
		return "CampoBatalla [nombre=" + nombre + ", \nmarcianos=" + Arrays.toString(marcianos) + ", \nejercito="
				+ Arrays.toString(ejercito) + "]";
	}


	
	//getters y setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Malvado[] getMarcianos() {
		return marcianos;
	}


	public void setMarcianos(Malvado[] marcianos) {
		this.marcianos = marcianos;
	}


	public Humano[] getEjercito() {
		return ejercito;
	}


	public void setEjercito(Humano[] ejercito) {
		this.ejercito = ejercito;
	}



	
	
	
	
	
	
}
