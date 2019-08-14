/**
 * 
 */
package com.training.ibm.models;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**
 * Responsabilidad de la clase crear modelo de datos de la peticion con sus metodos
 * @author JonathanMadrid
 * @since 31/07/2019
 * @category com.training.ibm.models
 */
public class RequestLogin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6522517292164791021L;
	
	@ApiModelProperty(value = "Usuario" , required = true,dataType = "String",example = "Jonathan")
	private String email;
	
	@ApiModelProperty(value = "Password debe contener una mayuscula inicial y minimo 8 caracteres" , required = true,dataType = "String",example = "Jonathan2019*")
	private String password;




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


}
