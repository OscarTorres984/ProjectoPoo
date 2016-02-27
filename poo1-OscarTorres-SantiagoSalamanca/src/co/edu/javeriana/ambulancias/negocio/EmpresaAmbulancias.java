/**
 * 
 */
package co.edu.javeriana.ambulancias.negocio;

import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author ACER
 *
 */
public class EmpresaAmbulancias {
private String nombre;

/**
 * @param nombre
 */
public EmpresaAmbulancias(String nombre) {
	super();
	this.nombre = nombre;
}

/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}

/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "EmpresaAmbulancias [nombre=" + nombre + "]";
}
public void agregarIPS(String nombre,String tipoAtencion, String tipoDireccion,int calle,int carrera,int numero){
	//IPS nuevaIPS=new IPS ();
}
public void agregarAmbulancia (int codigo, String placa, String tipoDotacion){
	
}
public boolean registrarPosicionAmbulancia (int codigo, GregorianCalendar horaActual, int carrera, int calle){
	
}
public int registrarServicio (String paciente, String tipoServicio, String telefono, String tipoDireccion ,int calle,int carrera,int numero){
	
}
public String asignarServicio(int numero){
	
}
public bool finalizarServicio(int codigo){
	
}
private Ambulancia buscarAmbulancia(int codigo){
	
}
private Servicio buscarServicio(int codigo){
	
}
private List<Ambulancia> construirAmbulanciasDisponiblesServicio(Servicio servicio){
	
}
/*
private Ambulancia calcularAmbulanciaMasCercana(List<Ambulancia> ,int carrera, int calle ){
	
}
*/
private IPS calcularIPSmasCercano(int carrera,int calle ){
	
}
private long calcularDistancia(int posicionCalle, int posicionCarrera,int calle,int carrera){
	
}
}

