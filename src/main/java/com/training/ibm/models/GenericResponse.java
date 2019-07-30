/**
 * 
 */
package com.training.ibm.models;

import java.io.Serializable;

/**
 * @author JonathanMadrid
 *
 */
public class GenericResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 287311992828739600L;
	
	/**
	 * Status OK ERROR
	 */
	private String status;
	
	/**
	 * Mensaje si hay error
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
