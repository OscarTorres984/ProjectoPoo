/**
 * 
 */
package co.edu.javeriana.ambulancias.negocio;

import java.util.GregorianCalendar;

/**
 * @author ACER
 *
 */
public class Servicio {
private long codigo ;
private GregorianCalendar horaSolicitud ;
private String paciente ;
private String tipoServicio ;
private String telefono ;
private String estado ;
private long CONSECUTIVO=0 ;
/**
 * @param codigo
 * @param horaSolicitud
 * @param paciente
 * @param tipoServicio
 * @param telefono
 * @param estado
 */
public Servicio(long codigo, GregorianCalendar horaSolicitud, String paciente,
		String tipoServicio, String telefono, String estado) {
	super();
	this.codigo = codigo;
	this.horaSolicitud = horaSolicitud;
	this.paciente = paciente;
	this.tipoServicio = tipoServicio;
	this.telefono = telefono;
	this.estado = estado;
}
/**
 * @return the codigo
 */
public long getCodigo() {
	return codigo;
}
/**
 * @param codigo the codigo to set
 */
public void setCodigo(long codigo) {
	this.codigo = codigo;
}
/**
 * @return the horaSolicitud
 */
public GregorianCalendar getHoraSolicitud() {
	return horaSolicitud;
}
/**
 * @param horaSolicitud the horaSolicitud to set
 */
public void setHoraSolicitud(GregorianCalendar horaSolicitud) {
	this.horaSolicitud = horaSolicitud;
}
/**
 * @return the paciente
 */
public String getPaciente() {
	return paciente;
}
/**
 * @param paciente the paciente to set
 */
public void setPaciente(String paciente) {
	this.paciente = paciente;
}
/**
 * @return the tipoServicio
 */
public String getTipoServicio() {
	return tipoServicio;
}
/**
 * @param tipoServicio the tipoServicio to set
 */
public void setTipoServicio(String tipoServicio) {
	this.tipoServicio = tipoServicio;
}
/**
 * @return the telefono
 */
public String getTelefono() {
	return telefono;
}
/**
 * @param telefono the telefono to set
 */
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
/**
 * @return the estado
 */
public String getEstado() {
	return estado;
}
/**
 * @param estado the estado to set
 */
public void setEstado(String estado) {
	this.estado = estado;
}
/**
 * @return the cONSECUTIVO
 */
public long getCONSECUTIVO() {
	return CONSECUTIVO;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Servicio [codigo=" + codigo + ", horaSolicitud=" + horaSolicitud
			+ ", paciente=" + paciente + ", tipoServicio=" + tipoServicio
			+ ", telefono=" + telefono + ", estado=" + estado + "]";
}

}
