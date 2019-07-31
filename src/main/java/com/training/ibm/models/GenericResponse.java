/**
 * 
 */
package com.training.ibm.models;

import java.io.Serializable;

/**
 * Responsabilidad crea un respuesta generica en caso de errores
 * @author JonathanMadrid
 * @since 31/07/2019
 * @category com.training.ibm.models
 */
public class GenericResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8613110616999387380L;
	
	/**
	 * Status OK ERROR
	 */
	private String status;
	
	/**
	 * Mensaje si ocurre un error
	 */
	private String message;

	
	
	/**
	 * 
	 */
	public GenericResponse() {
		super();
		status = "ERROR";
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	

}
