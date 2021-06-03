package Primer_examen_A;

public class Examen_a {

	public static void main(String[] args) {
		int array[] = new int [100];//se declara un array de 100 elemtos
		int suma = 0, mayor, menor;//se declara diferentes variables
		for (int i = 0; i < array.length; i++) {//se crea un bucle en el que i es 0 y se repite mientras i sea menor que la longitud del array
			array[i] = utiles.obtenerNumeroAzar();//se le da valores aleatorios al array
		}
		mayor = array[0];//el mayor es igual al array en la posicion 0
		menor = array[0];//el mayor es igual al array en la posicion 0
		for (int i = 0; i < array.length; i++) {//se crea un bucle en el que i es 0 y se repite mientras i sea menor que la longitud del array
			System.out.print(array[i] + " ");//se imprime el array
			suma += array[i];//se realiza la suma
			if (array[i] < menor) {//si el numero del array es menor que el menor guarda el numero en el menor
				menor = array[i];
			}
			if (array[i] > mayor) {//si el numero del array es mayor que el mayor guarda el numero en el mayor
				mayor = array[i];
			}
		}
		//emprime la suma, media, menor y mayor
		System.out.println("\nLa suma es: " + suma + "\nLa media es: " + suma/ (float) array.length + "\nEl menor es: " + menor + "\nEl mayor es: " + mayor);
	}

}
