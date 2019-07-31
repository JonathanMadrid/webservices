 /**
 * 
 */
package com.training.ibm.models;

import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author JonathanMadrid
 * @since 31/07/2019
 * @category com.training.ibm.models
 */
public class UserResponse extends GenericResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2572568598676965447L;
	
	private String userid;
	private String id;
	private String ip;
	private String nombre;
	private String campagna;
	
	@ApiModelProperty(value = "OK = el id es correcto ,ERROR = error interno" , required = true, dataType = "String", example = "12345")
	private String statusUser;
	
	
	/**
	 * @return the statusUser
	 */
	public String getStatusUser() {
		return statusUser;
	}
	/**
	 * @param statusUser the statusUser to set
	 */
	public void setStatusUser(String statusUser) {
		this.statusUser = statusUser;
	}
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

}
