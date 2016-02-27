package co.edu.javeriana.ambulancias.negocio;
/**
 * @author ACER
 *
 */
public class Direccion {
private String tipoDireccion;
private int calle;
private int carrera;
private int numero;
/**
 * @param tipoDireccion
 * @param calle
 * @param carrera
 * @param numero
 */
public Direccion(String tipoDireccion, int calle, int carrera, int numero) {
	super();
	this.tipoDireccion = tipoDireccion;
	this.calle = calle;
	this.carrera = carrera;
	this.numero = numero;
}
/**
 * @return the tipoDireccion
 */
public String getTipoDireccion() {
	return tipoDireccion;
}
/**
 * @param tipoDireccion the tipoDireccion to set
 */
public void setTipoDireccion(String tipoDireccion) {
	this.tipoDireccion = tipoDireccion;
}
/**
 * @return the calle
 */
public int getCalle() {
	return calle;
}
/**
 * @param calle the calle to set
 */
public void setCalle(int calle) {
	this.calle = calle;
}
/**
 * @return the carrera
 */
public int getCarrera() {
	return carrera;
}
/**
 * @param carrera the carrera to set
 */
public void setCarrera(int carrera) {
	this.carrera = carrera;
}
/**
 * @return the numero
 */
public int getNumero() {
	return numero;
}
/**
 * @param numero the numero to set
 */
public void setNumero(int numero) {
	this.numero = numero;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Direccion [tipoDireccion=" + tipoDireccion + ", calle=" + calle
			+ ", carrera=" + carrera + ", numero=" + numero + "]";
}

}
