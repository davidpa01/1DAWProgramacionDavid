package capitulo06_Recursos.Math.ejercicio02;
/**
 * 2º.- Averiguar, con una precisión inferior a 0.001, en qué punto (x, y) se cortan las gráficas de las siguientes funciones:
         y = sqrt(x)
         y = - ln(x)
 * @author david
 *
 */

public class Ejercicio02 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double y1;
		double y2;
		double x = 0.001;
		
		do {
			y1 =  Math.sqrt(x);
			y2 = - Math.log(x);
			x += 0.001;
		}while(Math.abs(y1 - y2) > 0.001);
		
		System.out.println(x + " " + y1);
	}
}
