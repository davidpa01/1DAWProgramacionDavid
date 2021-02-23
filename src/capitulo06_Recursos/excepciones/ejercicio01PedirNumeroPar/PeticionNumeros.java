package capitulo06_Recursos.excepciones.ejercicio01PedirNumeroPar;

/**
 * 1º.- Implementa un programa que contenga una clase llamada "PeticionNumeros", con un método "pideNumeroPar()". 
 * Desde un método "main()" llama al método anterior. Dentro del método "pideNumeroPar()" debes crear todo lo necesario para disparar una 
 * Exception, creada por ti, cuando el número introducido no sea un número par.
 */
import javax.swing.JOptionPane;


public class PeticionNumeros {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número par: "));
			System.out.println(pideNumeroPar(num));
		
		} 
		
		catch (NumeroParException e) {
		
			System.out.println(e.getMessage());
			
		}
		
	}
	
	
	
	/**
	 * 
	 * @param num
	 * @return
	 * @throws NumeroParException
	 */
	private static String pideNumeroPar(int num) throws NumeroParException{
		
		StringBuffer sb = new StringBuffer();
		
		if (num % 2 != 0) {
			
			throw new NumeroParException("El número no es par");
			
		}else {
			
			sb.append("El número es par");
			
		}
		
		return sb.toString();	
		
	}

}
