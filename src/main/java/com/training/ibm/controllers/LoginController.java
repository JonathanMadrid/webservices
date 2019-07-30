/**
 * 
 */
package com.training.ibm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.ibm.models.RequestLogin;
import com.training.ibm.models.UserResponse;
import com.training.ibm.services.LoginService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author JonathanMadrid
 *
 */
@Api(tags = "Login")
@RestController 
@RequestMapping (path = "/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService = null;
	
	@RequestMapping(
			method = RequestMethod.POST, 
			path = "/validateUser", 
			consumes = "application/json", 
			produces = "application/json") 
	@ApiOperation(value = "login", notes = "Servicio general de login." , response = UserResponse.class)
	public UserResponse login(@ApiParam(value = "oBJETO USER CON USER Y PSW" , required = true) @RequestBody RequestLogin user){
		UserResponse respuesta = new UserResponse();
		try {
			respuesta = loginService.validateUser(user);
			return respuesta;
		} catch (Exception e) {
			respuesta.setMessage(e.getMessage());
			return respuesta;
		}
		
	}

}
