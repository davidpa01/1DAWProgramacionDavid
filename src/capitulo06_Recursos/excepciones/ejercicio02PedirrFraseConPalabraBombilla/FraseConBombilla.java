package capitulo06_Recursos.excepciones.ejercicio02PedirrFraseConPalabraBombilla;

import javax.swing.JOptionPane;


/**
 * 2º.- Realiza un programa Java parecido al anterior en el que pidas al usuario una frase que contenga la palabra "bombilla". 
 * Las excepciones, creadas por ti, deben realizarse en los siguientes casos:
 *    - La frase introducida no tiene caracteres distintos al espacio en blanco.
 *    - La cantidad de palabras de la frase introducida es inferior a 3.
 *    - En la frase no aparece la palabra "bombilla".
 *    - En la frase aparece una palabra ofensiva de la siguiente relación: "tonto", "tonta", "idiota".
 *	Cada uno de los supuestos anteriores provocará un tipo diferente de excepción. Tú debes controlar todos los tipos y responder al usuario con un mensaje adecuado.
 * @author david
 *
 */

public class FraseConBombilla {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {

			String str = JOptionPane.showInputDialog("Introduce una frase que contenga la palabra 'Bombilla': ");
			
			System.out.println(comprobarFrase(str));
			
		} catch (FraseVaciaException | FraseMenorDe3Exception | FraseSinBombillaException | FraseOfensivaException e) {
			System.out.println(e.getMessage());
		}
	}

	
	/**
	 * 
	 * @param str
	 * @return
	 * @throws FraseVaciaException
	 * @throws FraseMenorDe3Exception
	 * @throws FraseSinBombillaException
	 * @throws FraseOfensivaException
	 */
	private static String comprobarFrase(String str) throws FraseVaciaException, FraseMenorDe3Exception, FraseSinBombillaException, FraseOfensivaException{
		
		StringBuffer sb = new StringBuffer();
		
		
		
		String cadena[] = str.split(" ");
		
		
		int i;
		boolean palabras = false;
		boolean bombilla = false;
		boolean ofensivo = false;
		
		for (i = 0; i < cadena.length; i++) {
			
			if (cadena[i].equalsIgnoreCase("bombilla")) {
				bombilla = true;
			}
			if (cadena[i].equalsIgnoreCase("tonto") | cadena[i].equalsIgnoreCase("tonta") | cadena[i].equalsIgnoreCase("idiota")) {
				ofensivo = true;
			}
			
			cadena[i].toCharArray();
			
			for (int j = 0; j < str.length(); j++) {
				
				if (Character.isLetter(cadena[i].charAt(i))) {
					
					palabras = true;
				
				}
				
			}
			
		}
		
		if (!palabras) {
			
			throw new FraseVaciaException("La frase no tiene ninguna palabra");
		
		}else {
			
			sb.append("La frase si contiene palabras ");
			
			if (i < 3) {
				
				throw new FraseMenorDe3Exception("La frase no llega al minimo de longitud 3");
				
			} else {
				
				sb.append("La frase llega a la longitud minima ");
				
				if (!bombilla) {
					
					throw new FraseSinBombillaException("La frase no contiene la palabra bombilla");
					
				}else {
					
					sb.append("La frase si contiene la palabra bombilla ");
					
					if (ofensivo) {
						
						throw new FraseOfensivaException("La frase contiene palabras ofensivas");
						
					}else {
						
						sb.append("La frase no contiene palabras ofensivas");
					}
					
				}
			}
		}
		
		
		
		
		
		return sb.toString();
		
	}
}
