package com.training.ibm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.training.ibm.models.RequestLogin;
import com.training.ibm.models.UserResponse;
import com.training.ibm.services.LoginRepository;
import com.training.ibm.services.LoginService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IbmApplicationTests {

	@Test
	public void validateUserNoExistTest() throws Exception {
		try {
			new LoginRepository().loadUsers();
			RequestLogin user = new RequestLogin();
			user.setEmail("pepe@gmail.com");
			user.setPassword("123");
			LoginService response = new LoginService();
			UserResponse loginresponse = response.validateUser(user);
			assertEquals(loginresponse.isFind(),false);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	


	@Test
	public void validateUserExistTest() throws Exception {
		try {
			new LoginRepository().loadUsers();
			RequestLogin user = new RequestLogin();
			user.setEmail("jonathan@gmail.com");
			user.setPassword("123456");
			LoginService response = new LoginService();
			UserResponse loginresponse = response.validateUser(user);
			assertEquals(loginresponse.isFind(),true);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	/**
	 * @Test public void validateUserTest() throws Exception { RequestLogin user =
	 *       new RequestLogin(); user.setUser("juan0618"); user.setPassword("123");
	 *       LoginService lo = new LoginService(); UserResponse loginresponse =
	 *       lo.validateUser(user); //new LoginController();
	 *       System.out.println("Primer Escenario de Prueba");
	 *       System.out.println(loginresponse.getLastAccess());
	 *       System.out.println(loginresponse.getName());
	 *       assertEquals("19/07/2019",loginresponse.getLastAccess()); }
	 * 
	 * @Test public void validateUserTestWrong() throws Exception {
	 * 
	 *       RequestLogin user = new RequestLogin();
	 * 
	 *       user.setUser("dsfgsdg32"); user.setPassword("fg3235");
	 * 
	 *       LoginService lo = new LoginService();
	 * 
	 *       UserResponse loginresponse = lo.validateUser(user); //new
	 *       LoginController(); System.out.println("Segundo Escenario de Prueba");
	 *       System.out.println(loginresponse.getStatus()); assertEquals("Invalid
	 *       User",loginresponse.getStatus());
	 * 
	 *       }
	 **/

}
