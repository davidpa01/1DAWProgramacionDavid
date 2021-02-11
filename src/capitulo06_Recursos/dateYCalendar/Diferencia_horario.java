package capitulo06_Recursos.dateYCalendar;

import java.util.Calendar;
import java.util.TimeZone;

public class Diferencia_horario {

	public static Calendar ahoraEnItalia = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
	public static Calendar ahoraEnAustralia = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));

	public static void main(String[] args) {
		
		System.out.println("Hora en Roma: " + ahoraEnItalia.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora en Sydney: " + ahoraEnAustralia.get(Calendar.HOUR_OF_DAY));
				
		System.out.println(ahoraEnItalia.get(Calendar.HOUR_OF_DAY) - ahoraEnAustralia.get(Calendar.HOUR_OF_DAY));
	}

}
