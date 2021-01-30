package capitulo06_Recursos.Math.ejercicio04;

/**
 * 4º.- Dado un triángulo rectángulo cuyos catetos miden 4 cm y 5 cm respectivamente, hallar cuanto mide la hipotenusa.
 * @author david
 *
 */
public class Ejercicio04 {

	public static void main(String[] args) {
		 int b = 4, c = 5;
		 
		 float pitagoras = (float) Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));

		 System.out.println("La hipotenusa de catetos " + b + " y " + c + " es: " + pitagoras);
	}

}
