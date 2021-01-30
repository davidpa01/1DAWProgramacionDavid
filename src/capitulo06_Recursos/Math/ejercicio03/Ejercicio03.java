package capitulo06_Recursos.Math.ejercicio03;
/**
 * 3º.- Aproximar, con una precisión de 0.00001 décimas, el número PI. Para esto debes utilizar el método 
 * "Calcular el valor de PI utilizando series infinitas" 
 * 
 * @author david
 *
 */
public class Ejercicio03 {

	public static void main(String[] args) {
		float x = 3;
        float numPi = 4;
        int signo = -1;
        do {
            numPi += signo * 4.0 / x;
            signo *= -1;
            x += 2;

        } while (Math.abs(Math.PI - numPi) >= 0.00001);

        System.out.println(numPi);
	}

}
