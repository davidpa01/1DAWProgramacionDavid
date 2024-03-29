package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		int opcion = -1;
		while(opcion != 0) {//Creo un menu con un while que se repite hasta que opcion = 0
			System.out.println("1. Cálculo de la hipotenusa de un triángulo.");
			System.out.println("2. Cálculo de la superficie de una circunferencia.");
			System.out.println("3. Cálculo del perímetro de una circunferencia.");
			System.out.println("4. Cálculo del área de un rectángulo.");
			System.out.println("5. Cálculo del área de un triángulo.");
			System.out.println("0. Salir de la aplicación.");
			System.out.println(" ");
			String str = JOptionPane.showInputDialog("Elija una opción: ");//Guardo datos en una variable
			opcion = Integer.parseInt(str);//Transformo los datos en numeros enteros
			switch (opcion) {//se comprueba la opción
			case 0://0 para salir
				break;
			case 1:// opcion = 1 calcula la hipotenusa 
				String str1 = JOptionPane.showInputDialog("Introduzca el cateto menor: ");
				int catmenor = Integer.parseInt(str1);
				String str2 = JOptionPane.showInputDialog("Introduzca el cateto mayor: ");
				int catmayor = Integer.parseInt(str2);
				float hipotenusa = (float) (Math.pow(catmenor, 2) + Math.pow(catmayor, 2));
				System.out.println("La hipotenusa vale " + hipotenusa);
				break;
			case 2:// opcion = 2 calcula el area de un circurferencia
				String str3 = JOptionPane.showInputDialog("Introduzca la longitud del radio de una circurferencia: ");
				int radio = Integer.parseInt(str3);
				float area = (float) (Math.PI * Math.pow(radio,2));
				System.out.println("El area de la circurferencia es " + area);
				break;
			case 3://opcion = 3 calcula perimetro de una circurferencia
				String str4 = JOptionPane.showInputDialog("Introduzca la longitud del radio de una circurferencia: ");
				int radio1 = Integer.parseInt(str4);
				float perimetro = (float) (2 * Math.PI * radio1);
				System.out.println("El perímetro de la circurferencia es " + perimetro);
				break;
			case 4: // opcion = 4 calcula area del rectangulo
				String str5 = JOptionPane.showInputDialog("Introduzca la longitud de la base del triangulo: ");
				int base = Integer.parseInt(str5);
				String str6 = JOptionPane.showInputDialog("Introduzca la longitud de la altura del triangulo: ");
				int altura = Integer.parseInt(str6);
				int arearectangulo = base * altura;
				System.out.println("El area de la circurferencia es " + arearectangulo);
				break;
			case 5:// opciion = 5 calcula area del triangulo
				String str7 = JOptionPane.showInputDialog("Introduzca la longitud de la base del rectángulo: ");
				int basetriangulo = Integer.parseInt(str7);
				String str8 = JOptionPane.showInputDialog("Introduzca la longitud de la altura del rectángulo: ");
				int alturatriangulo = Integer.parseInt(str8);
				float areatriangulo = (basetriangulo * alturatriangulo) / 2;
				System.out.println("El area de la circurferencia es " + areatriangulo);
				break;
			default:// si la opcion no es ni una de las anteriores muestra lo siguiente en pantalla
				System.out.println("Opcón no válida");
			}
			System.out.println(" ");
		}

	}

}
