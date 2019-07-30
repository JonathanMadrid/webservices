/**
 * 
 */
package com.training.ibm.singleton;

import java.util.HashMap;

import com.training.ibm.models.UserResponse;



/**
 * @author JonathanMadrid
 *
 */
public class ConsultSingleton {
	
	private ConsultSingleton() {
		userMap = new HashMap<String, UserResponse>();
	}

	private static ConsultSingleton instance = null;

	/**
	 * Mapa para almacenar la lista de usuarios del sistema en cache key = user = value {@link UserResponse}
	 */
	private HashMap<String, UserResponse> userMap = null;
	
	
	
	public static ConsultSingleton getInstance() {
		if(instance == null) {
			instance = new ConsultSingleton();
		}
		return instance;
	}



	/**
	 * @return the userMap
	 */
	public HashMap<String, UserResponse> getUserMap() {
		return userMap;
	}



	/**
	 * @param userMap the userMap to set
	 */
	public void setUserMap(HashMap<String, UserResponse> userMap) {
		this.userMap = userMap;
	}

}
