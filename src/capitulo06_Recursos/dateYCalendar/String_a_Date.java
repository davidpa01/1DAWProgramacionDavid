package capitulo06_Recursos.dateYCalendar;


/**
 * 1º.- Crea un programa en Java que pida al usuario la introducción de una fecha a través de JOptionPane. 
 * El usuario te especificará un dato de tipo String y tú debes convertirlo a un objeto de tipo java.util.Date utilizando SimpleDateFormat.
 *  A continuación realiza las siguientes acciones
      - Con el objeto java.util.Date, crea un objeto de tipo Calendar y que represente la misma fecha que ha introducido el usuario.
      - Obtén en pantalla los siguientes campos: año, mes, día, hora, minuto y segundo. Cada campo debe aparecer en una línea de la consola. 
      Debes obtener cada campo desde el objeto java.util.Date y desde el objeto Calendar. Es decir, cada campo debe ser obtenido dos veces en pantalla.
      - Utiliza el objeto de tipo Calendar para obtener nuevas fechas e imprimirlas en pantalla: suma 3 días, resta 2 semanas, suma 300 días, suma 4 años.
 */

import java.sql.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;



/**
 * 
 * @author david
 *
 */

public class String_a_Date {
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		strToDate();
		strToCalendar();
		sumaYresta();
		enLineaCalendar();
		enLineaDate();
		
	
		
		
	}
	
	
	
	
	
	
	public static void strToDate() {

		String str = JOptionPane.showInputDialog("Introduce una fecha (dd/MM/yyyy HH:mm:ss)");
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		java.util.Date fecha = null;
		
		try {
			fecha = formato.parse(str);
		} catch (ParseException e) {
			System.out.println ("Error en el parseo de la fecha");
			e.printStackTrace();
		}
		System.out.println("Fecha parseada: " + formato.format(fecha));
	}
	
	
	
	
	
	
	public static void strToCalendar() {

		String str = JOptionPane.showInputDialog("Introduce una fecha (dd/MM/yyyy HH:mm:ss)");

		Calendar fechaCalendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH);
		try {
			fechaCalendar.setTime(sdf.parse(str));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Fecha a partir de Calendar: " + 
		new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss").format(fechaCalendar.getTimeInMillis()));
	}
	
	
	public static void sumaYresta() {
		Calendar fechaCalendar = Calendar.getInstance();

		fechaCalendar.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println("Más tres dias : " + fechaCalendar.getTime());

		fechaCalendar.add(Calendar.DAY_OF_MONTH, -14);
		System.out.println("Menos dos semanas : " + fechaCalendar.getTime());
		
		fechaCalendar.add(Calendar.DAY_OF_MONTH, 300);
		System.out.println("Más trescientos dias : " + fechaCalendar.getTime());

		fechaCalendar.add(Calendar.DAY_OF_MONTH, 1460);
		System.out.println("Más cuatro años : " + fechaCalendar.getTime());
	}

	public static void enLineaDate() {

		java.util.Date fechaActual = new java.util.Date();
		
		System.out.println("Año " + new SimpleDateFormat("yyyy").format(fechaActual));
		System.out.println("Mes " + new SimpleDateFormat("MM").format(fechaActual));
		System.out.println("Día " + new SimpleDateFormat("dd").format(fechaActual));
		System.out.println("Hora " + new SimpleDateFormat("HH").format(fechaActual));
		System.out.println("Minuto" + new SimpleDateFormat("mm").format(fechaActual));
		System.out.println("Segundo" + new SimpleDateFormat("ss").format(fechaActual));
		
	}
	
	
	public static void enLineaCalendar() {
		Calendar fechaCalendar = Calendar.getInstance();

		System.out.println("Año: " + fechaCalendar.get(Calendar.YEAR));

		System.out.println("Mes: " + fechaCalendar.get(Calendar.MONTH));

		System.out.println("Día: " + fechaCalendar.get(Calendar.DAY_OF_MONTH));

		System.out.println("Hora: " + fechaCalendar.get(Calendar.HOUR));

		System.out.println("Minutos: " + fechaCalendar.get(Calendar.MINUTE));
		
		System.out.println("Segundos: " + fechaCalendar.get(Calendar.SECOND));
	}

}
