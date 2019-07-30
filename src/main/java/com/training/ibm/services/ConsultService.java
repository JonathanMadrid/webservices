/**
 * 
 */
package com.training.ibm.services;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import com.training.ibm.exceptions.ConsultException;
import com.training.ibm.models.RequestConsult;
import com.training.ibm.models.StatusUserId;
import com.training.ibm.models.UserResponse;
import com.training.ibm.singleton.ConsultSingleton;



/**
 * @author JonathanMadrid
 *
 */
@Service
public class ConsultService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2598748374363019995L;

	/**
	 * 
	 * @param userid
	 * @return
	 * @throws ConsultException
	 */
	public UserResponse validateUser(RequestConsult userid) throws ConsultException {
		UserResponse response = new UserResponse();
		try {
			if (ConsultSingleton.getInstance().getUserMap().containsKey(userid.getUserid())) {
				UserResponse userMap = ConsultSingleton.getInstance().getUserMap().get(userid.getUserid());{
					response = userMap;
					response.setStatusUser(StatusUserId.ACTIVE.name());
					response.setStatus("OK");
				} 
			}
				else {
					response.setMessage("UserId invalido");
				}
			
			System.out.println("UserId: " + userid.getUserid());
			
			return response;
		} catch (Exception ex) {
			response.setMessage(ex.getMessage());
			return response;
		}
	}

}
