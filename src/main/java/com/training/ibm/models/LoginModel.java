/**
 * 
 */
package com.training.ibm.models;

import java.io.Serializable;
import java.util.Date;

/**
 * Responsabilidad de la clase generar el modelo de datos con sus metodos set y get
 * @author JonathanMadrid
 * @since 31/07/2019
 * @category com.training.ibm.models
 */
public class LoginModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8771047315409356304L;
	
	private String email ;
	private String password;
	private String name;
	private Date date;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private boolean find;
	
	


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

}
