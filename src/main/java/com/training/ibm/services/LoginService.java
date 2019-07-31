
package com.training.ibm.services;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import com.training.ibm.exceptions.LoginException;
import com.training.ibm.models.RequestLogin;
import com.training.ibm.models.StatusUser;
import com.training.ibm.models.UserResponse;
import com.training.ibm.singleton.LoginSingleton;

/**
 * Valida el archivo plano y genera la respuesta que recibe el usuario
 * @author JonathanMadrid
 * @since 31/07/2019
 * @category com.training.ibm.services
 */
@Service
public class LoginService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6582571311656456727L;

	/**
	 * 
	 * @param user
	 * @return
	 * @throws LoginException
	 */
	public UserResponse validateUser(RequestLogin user) throws LoginException {
		UserResponse respuesta = new UserResponse();
		try {
			if (LoginSingleton.getInstance().getUserMap().containsKey(user.getUser())) {
				UserResponse userMap = LoginSingleton.getInstance().getUserMap().get(user.getUser());
				if (user.getPassword().equals(userMap.getPassword())) {
					respuesta = userMap; 
					respuesta.setStatusUser(StatusUser.ACTIVE.name());
					respuesta.setMessage("Usuario Encontrado");
					respuesta.setFind(true);
				} else {
					respuesta.setMessage("Usuario y/ password inválidos");
				}
			} else {
				respuesta.setMessage("Usuario y/ password inválidos");
			}
			System.out.println("User: " + user.getUser());
			System.out.println("Password: " + user.getPassword());
			return respuesta;
		} catch (Exception ex) {
			respuesta.setMessage(ex.getMessage());
			return respuesta;
		}

	}
}
