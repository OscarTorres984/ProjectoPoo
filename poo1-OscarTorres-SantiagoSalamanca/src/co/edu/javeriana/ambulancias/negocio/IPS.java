/**
 * 
 */
package co.edu.javeriana.ambulancias.negocio;

/**
 * @author ACER
 *
 */
public class IPS {
private String nombre;
private String tipoAtencion;
/**
 * @param nombre
 * @param tipoAtencion
 */
public IPS(String nombre, String tipoAtencion) {
	super();
	this.nombre = nombre;
	this.tipoAtencion = tipoAtencion;
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
/**
 * @return the tipoAtencion
 */
public String getTipoAtencion() {
	return tipoAtencion;
}
/**
 * @param tipoAtencion the tipoAtencion to set
 */
public void setTipoAtencion(String tipoAtencion) {
	this.tipoAtencion = tipoAtencion;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "IPS [nombre=" + nombre + ", tipoAtencion=" + tipoAtencion + "]";
}

}
