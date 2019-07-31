/**
 * 
 */
package com.training.ibm.models;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author JonathanMadrid
 * @since 31/07/2019
 * @category com.training.ibm.models
 */
public class RequestConsult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2878718675263173269L;
	
	@ApiModelProperty(value = "UserId debe ser un valor numerico" , required = true,dataType = "String",example = "12345")
	private String userid;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}
