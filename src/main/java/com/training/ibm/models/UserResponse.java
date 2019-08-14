/**
 * 
 */
package com.training.ibm.models;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

/**
 * Genera el modelo de datos de la respuesta que recibe el usuario
 * 
 * @author JonathanMadrid
 * @since 31/07/2019
 * @category com.training.ibm.models
 */
public class UserResponse extends GenericResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6118939095692392957L;

	private String email;
	
	private String password;
	private String name;
	private boolean find;
	/**
	 * status posibles
	 * 
	 */
	@ApiModelProperty(value = "OK = el usario se loguea bien, ERROR = hubo un error interno", required = true, dataType = "String", example = "Jonathan")
	private String statusUser;





	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFind() {
		return find;
	}

	public void setFind(boolean find) {
		this.find = find;
	}

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

}
