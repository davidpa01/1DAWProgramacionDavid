package capitulo06_Recursos.Math.ejercicio01;

import metodos.Utiles;

/**
 * 1º.- Crear un programa que resuelva ecuaciones de segundo grado con una incógnita. El programa debe pedir los parámetros 
 * a, b y c de la ecuación, e imprimir, en caso de que las haya, la solución o soluciones de la ecuación.
 * 
 * @author david
 *
 */

public class Ecuaciones_segunfo_grado {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int a = Utiles.obtenerNum();
		int b = Utiles.obtenerNum();
		int c = Utiles.obtenerNum();
		
		float xpositiva = 0;
		float xnegativa = 0;
		
		float raiz = (float) (Math.pow(b, 2)) - (4 * c * a);
		
		xpositiva = (float) (-b + Math.sqrt(raiz)) / (2 * a);
		xnegativa = (float) (-b - Math.sqrt(raiz)) / (2 * a);
		
		System.out.println("Las soluciones son: " + xpositiva + " y " + xnegativa);
		
		
	}

}
