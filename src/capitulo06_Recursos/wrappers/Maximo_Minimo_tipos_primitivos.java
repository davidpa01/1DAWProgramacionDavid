package capitulo06_Recursos.wrappers;
/**
 * 1º.- Realizar un programa que imprima una tabla con los límites máximo y mínimo representables para los diferentes tipos primitivos en Java 
 * (byte, int, short, long, float, double). En la tabla también deberá aparecer el número de bytes que cada tipo usa para su representación.
 * @author david
 *
 */
public class Maximo_Minimo_tipos_primitivos {

	public static void main(String[] args) {
		System.out.println("Tipos primitivos.");
		System.out.println("-----------------");
		System.out.println("\nBYTE:\n\t-Limite maximo: " + Byte.MAX_VALUE + "\n\t-Limite minimo: " + Byte.MIN_VALUE + "\n\t-Representación: " + Byte.SIZE);
		System.out.println("\nINT:\n\t-Limite maximo: " + Integer.MAX_VALUE + "\n\t-Limite minimo: " + Integer.MIN_VALUE + "\n\t-Representación: " + Integer.SIZE);
		System.out.println("\nSHORT:\n\t-Limite maximo: " + Short.MAX_VALUE + "\n\t-Limite minimo: " + Short.MIN_VALUE + "\\n\\t-Representación: " + Short.SIZE);
		System.out.println("\nLONG:\n\t-Limite maximo: " + Long.MAX_VALUE + "\n\t-Limite minimo: " + Long.MIN_VALUE + "\\n\\t-Representación: " + Long.SIZE);
		System.out.println("\nFLOAT:\n\t-Limite maximo: " + Float.MAX_VALUE + "\n\t-Limite minimo: " + Float.MIN_VALUE + "\\n\\t-Representación: " + Float.SIZE);
		System.out.println("\nDOUBLE:\n\t-Limite maximo: " + Double.MAX_VALUE + "\n\t-Limite minimo: " + Double.MIN_VALUE + "\\n\\t-Representación: " + Double.SIZE);
	}

}
