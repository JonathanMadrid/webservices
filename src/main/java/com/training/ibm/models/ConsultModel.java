/**
 * 
 */
package com.training.ibm.models;

import java.io.Serializable;

/**
 * 
 * @author JonathanMadrid
 * @since 31/07/2019
 * @category com.training.ibm.models
 */
public class ConsultModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3736511553876995976L;
	private String userid;
	private String id;
	private String ip;
	private String nombre;
	private String campagna;
	private String fecha;
	private String mensaje;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCampagna() {
		return campagna;
	}
	public void setCampagna(String campagna) {
		this.campagna = campagna;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
