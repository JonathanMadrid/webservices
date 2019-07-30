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

import com.google.gson.Gson;
import com.training.ibm.models.UserResponse;
import com.training.ibm.singleton.ConsultSingleton;


/**
 * @author JonathanMadrid
 *
 */
public class ConsultRepository implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -707420287581113139L;
	
	public void loadUsers() {
		JSONParser parser = new JSONParser();			
		Object obj;
		try {
			obj = parser.parse(new FileReader("C:\\ibm\\IBM\\src\\main\\resources\\clients.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray listUsers =  (JSONArray) jsonObject.get("clients");

			for (int i = 0; i < listUsers.size(); i++) {	
				UserResponse userid = new Gson().fromJson(listUsers.get(i).toString(), UserResponse.class);   
				ConsultSingleton.getInstance().getUserMap().put(userid.getUserid(), userid);  		
			}

		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}

}
