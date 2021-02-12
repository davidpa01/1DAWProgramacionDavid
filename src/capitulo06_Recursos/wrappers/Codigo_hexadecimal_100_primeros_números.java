package capitulo06_Recursos.wrappers;
/**
 * 3º.- Realizar un programa que imprima los 100 primeros números enteros en código hexadecimal.
 * @author david
 *
 */

public class Codigo_hexadecimal_100_primeros_números {

	public static void main(String[] args) {		
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Integer.toHexString(i));
		}
	}

}
