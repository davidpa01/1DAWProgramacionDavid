package capitulo06_Recursos.dateYCalendar;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.JOptionPane;

public class String_a_Date {

	public static void main(String[] args) {

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
		
		
		
		
		
		Calendar fechaCalendar = Calendar.getInstance();
		Date fechaAPartirDeCalendar = new Date(fechaCalendar.getTimeInMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH);
		try {
			fechaCalendar.setTime(sdf.parse(str));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Fecha a partir de Calendar: " + 
		new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss").format(fechaCalendar.getTimeInMillis()));
	
		
		fechaCalendar.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println("Más tres dias : " + fechaCalendar.getTime());

		fechaCalendar.add(Calendar.DAY_OF_MONTH, -14);
		System.out.println("Menos dos semanas : " + fechaCalendar.getTime());
		
		fechaCalendar.add(Calendar.DAY_OF_MONTH, 300);
		System.out.println("Más trescientos dias : " + fechaCalendar.getTime());

		fechaCalendar.add(Calendar.DAY_OF_MONTH, 1460);
		System.out.println("Más cuatro años : " + fechaCalendar.getTime());
		
	}


}
