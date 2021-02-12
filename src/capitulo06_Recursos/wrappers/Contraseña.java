package capitulo06_Recursos.wrappers;
/**
 * 2º.- Crear un programa que pida al usuario una contraseña con los siguientes requisitos:
         - Al menos una mayúscula.
         - Al menos una minúscula.
         - Al menos un dígito
         - Al menos un carácter no alfanumérico.
       El programa no terminará hasta que el usuario no introduzca la contraseña con estos requisitos.
 */
import javax.swing.JOptionPane;

public class Contraseña {
	
	private static String contraseña = "";
	
	public static void main(String[] args) {
		do {
			contraseña = JOptionPane.showInputDialog("Introduzca una contraseña "
					+ "con al menos con: \n-Una mayúscula. \n-Una minúscula. \n-Un dígito. \n-Un carácter no alfanumérico:");
			contraseña.trim();			
		}while(!esValida());
		System.out.println("La contraseña se ha guardado");
	}
	
	public static Boolean esValida() {
		contraseña.toCharArray();
		boolean tieneMa = false, tieneMi = false, tieneDi = false, tieneAlNu = false, correcto = false;
		
		for (int i = 0; i < contraseña.length(); i++) {
			if (Character.isUpperCase(contraseña.charAt(i))) {
				tieneMa = true;
			}
			if (Character.isLowerCase(contraseña.charAt(i))) {
				tieneMi = true;
			}
			if (Character.isDigit(contraseña.charAt(i))) {
				tieneDi = true;
			}
			if (!Character.isLetterOrDigit(contraseña.charAt(i))) {
				tieneAlNu = true;
			}
		}
		
		if (tieneMa) {
			if (tieneMi) {
				if(tieneDi) {
					if(tieneAlNu) {
						correcto = true;
					}
				} 
			} 
		}
		return correcto; 
	}
}
