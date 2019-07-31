/**
 * 
 */
package com.training.ibm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.ibm.models.RequestConsult;
import com.training.ibm.models.UserResponse;
import com.training.ibm.services.ConsultService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author JonathanMadrid
 *
 */

@Api(tags = "Consult Info")
@RestController 
@RequestMapping(path = "/consultInfo")
public class ConsultController {
	
	@Autowired
	private ConsultService consultservice = null;
	
	@RequestMapping(
			
			method = RequestMethod.GET, 
			path = "/validateUser", 
			consumes = "application/json", 
			produces = "application/json") 
	@ApiOperation(value = "consult", notes = "Servicio general de consulta de informacion" , response = UserResponse.class)
	public UserResponse login(@ApiParam(value = "UserId" , required = true) @RequestBody RequestConsult userid){
		UserResponse response = new UserResponse();
		try {
			response = consultservice.validateUser(userid);
			return response;
		} catch (Exception e) {
			response.setMessage(e.getMessage());
			return response;
		}
		
	}

}
