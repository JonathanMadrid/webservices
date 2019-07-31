/**
 * 
 */
package com.training.ibm.models;

import java.io.Serializable;

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
	
	private String user ;
	private String password;
	private String name;
	private String date;
	private boolean find;
	
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isFind() {
		return find;
	}

	public void setFind(boolean find) {
		this.find = find;
	}

}
