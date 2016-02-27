/**
 * 
 */
package co.edu.javeriana.ambulancias.negocio;

import java.util.GregorianCalendar;

/**
 * @author ACER
 *
 */
public class Ambulancia {
private int codigo;
private String placa;
private String tipoDotacion;
private GregorianCalendar horaPosicion;
private int posicionCalle;
private int posicionCarrera;


/**
 * @param codigo
 * @param placa
 * @param tipoDotacion
 * @param horaPosicion
 * @param posicionCalle
 * @param posicionCarrera
 */
public Ambulancia(int codigo, String placa, String tipoDotacion,
		GregorianCalendar horaPosicion, int posicionCalle, int posicionCarrera) {
	super();
	this.codigo = codigo;
	this.placa = placa;
	this.tipoDotacion = tipoDotacion;
	this.horaPosicion = horaPosicion;
	this.posicionCalle = posicionCalle;
	this.posicionCarrera = posicionCarrera;
}
/**
 * @return the codigo
 */
public int getCodigo() {
	return codigo;
}
/**
 * @param codigo the codigo to set
 */
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
/**
 * @return the placa
 */
public String getPlaca() {
	return placa;
}
/**
 * @param placa the placa to set
 */
public void setPlaca(String placa) {
	this.placa = placa;
}
/**
 * @return the tipoDotacion
 */
public String getTipoDotacion() {
	//Hola Santiago, Si ve esto?
	return tipoDotacion;
}
/**
 * @param tipoDotacion the tipoDotacion to set
 */
public void setTipoDotacion(String tipoDotacion) {
	this.tipoDotacion = tipoDotacion;
}
/**
 * @return the horaPosicion
 */
public GregorianCalendar getHoraPosicion() {
	return horaPosicion;
}
/**
 * @param horaPosicion the horaPosicion to set
 */
public void setHoraPosicion(GregorianCalendar horaPosicion) {
	this.horaPosicion = horaPosicion;
}
/**
 * @return the posicionCalle
 */
public int getPosicionCalle() {
	return posicionCalle;
}
/**
 * @param posicionCalle the posicionCalle to set
 */
public void setPosicionCalle(int posicionCalle) {
	this.posicionCalle = posicionCalle;
}
/**
 * @return the posicionCarrera
 */
public int getPosicionCarrera() {
	return posicionCarrera;
}
/**
 * @param posicionCarrera the posicionCarrera to set
 */
public void setPosicionCarrera(int posicionCarrera) {
	this.posicionCarrera = posicionCarrera;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Ambulancia [codigo=" + codigo + ", placa=" + placa
			+ ", tipoDotacion=" + tipoDotacion + ", horaPosicion="
			+ horaPosicion + ", posicionCalle=" + posicionCalle
			+ ", posicionCarrera=" + posicionCarrera + "]";
}

}
