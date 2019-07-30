/**
 * 
 */
package com.training.ibm.services;

import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.training.ibm.models.UserResponse;
import com.training.ibm.singleton.LoginSingleton;


/**
 * @author JonathanMadrid
 *
 */
@Service
public class LoginRepository implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3360460963424626309L;
	
	public void loadUsers() {
		JSONParser parser = new JSONParser();			
		Object obj;
		try {
			obj = parser.parse(new FileReader("C:\\ibm\\IBM\\src\\main\\resources\\info.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray listUsers =  (JSONArray) jsonObject.get("users");

			for (int i = 0; i < listUsers.size(); i++) {	
				UserResponse user = new Gson().fromJson(listUsers.get(i).toString(), UserResponse.class);   
				LoginSingleton.getInstance().getUserMap().put(user.getUser(), user);  		
			}

		} catch (IOException | ParseException e) {
			
			e.printStackTrace();
		}				
	}

}
