/**
 * 
 */
package co.edu.javeriana.ambulancias.presentacion;

/**
 * @author ACER
 *
 */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

/**
 * @author sala_c
 *
 */
public class Utils {
	
	public static GregorianCalendar convertirStringFecha (String fecha){
		StringTokenizer laFecha = new StringTokenizer( fecha, "-"); 
		String anio = laFecha.nextToken();
		String mes = laFecha.nextToken();
		String dia = laFecha.nextToken();
		int anioInt = Integer.parseInt (anio);
		int mesInt = Integer.parseInt (mes);
		int diaInt = Integer.parseInt (dia);
		GregorianCalendar fechaHoy = new GregorianCalendar(anioInt, mesInt-1, diaInt);
		return fechaHoy;
	}
	
		public static String convertirFechaString (GregorianCalendar fecha){
			int anio = fecha.get(Calendar.YEAR);
			int mes = fecha.get(Calendar.MONTH);
			int dia = fecha.get(Calendar.DATE);
			String fechastr= anio+"-"+mes+"-"+dia ;
			return fechastr ;
			
		}
		public static GregorianCalendar convertirStringHoraToFecha(String fecha){
			StringTokenizer laHora = new StringTokenizer( fecha, ":"); 
			String copiahora= laHora.nextToken();
			String copiaminuto= laHora.nextToken();
			int horaInt= Integer.parseInt(copiahora);
			int minutoInt= Integer.parseInt(copiaminuto);
			GregorianCalendar fechaHoy= new GregorianCalendar();
			int anio = fechaHoy.get(Calendar.YEAR);
			int mes = fechaHoy.get(Calendar.MONTH);
			int dia = fechaHoy.get(Calendar.DATE);
			GregorianCalendar fechaHora = new GregorianCalendar(anio, mes-1, dia,horaInt,minutoInt);
			return fechaHora;
			
		}
		
		public static long obtenerEdad(GregorianCalendar fechaNacimiento){
			GregorianCalendar fechaHoy = new GregorianCalendar();
			long resta = fechaHoy.getTimeInMillis() - fechaNacimiento.getTimeInMillis() ;
			resta=resta/((long) 1000*60*60*24*365) ;
			return resta ;
		}
		public static long diferenciaFechasMinutos(GregorianCalendar fecha1, GregorianCalendar fecha2){
			GregorianCalendar fechaHoy = new GregorianCalendar();
			long resta= fecha1.getTimeInMillis() - fecha2.getTimeInMillis() ;
			resta=resta/((long) 1000*60*60) ;
			return resta ;
		}



}
