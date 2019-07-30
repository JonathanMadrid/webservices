/**
 * 
 */
package com.training.ibm.models;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author JonathanMadrid
 *
 */
public class UserResponse extends GenericResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6118939095692392957L;
	
	private String user;
	private String password;
	private String name;
	private boolean find;
	/**status posibles
	 * 
	 */
	@ApiModelProperty(value = "OK = el usario se loguea bien ERROR hub un error interno" , required = true, dataType = "String", example = "Jonathan")
	private String statusUser;

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
