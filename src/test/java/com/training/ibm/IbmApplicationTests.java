package com.training.ibm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.training.ibm.models.RequestConsult;
import com.training.ibm.models.UserResponse;
import com.training.ibm.services.ConsultService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class IbmApplicationTests {

	@Test
	public void validateUserNoExistTest() throws Exception {
		try {
			RequestConsult user = new RequestConsult();
			user.setUserid("73783783");
			ConsultService response = new ConsultService();
			UserResponse consultresponse = response.validateUser(user);
			assertEquals(consultresponse.getStatus(),"ERROR");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	
	@Test
	public void validateUserExistTest() throws Exception {
		RequestConsult user = new RequestConsult();
		user.setUserid("1111");
		ConsultService response = new ConsultService();
		UserResponse consultresponse = response.validateUser(user);
		assertEquals(consultresponse.getStatus(),"OK");
	}

}
