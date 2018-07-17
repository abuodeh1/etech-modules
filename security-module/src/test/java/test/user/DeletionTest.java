package test.user;

import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import etech.security.services.UserService;

public class DeletionTest {

	@Test
	public void deleteTest() {
		
		int actualSize = InsertionTest.users.size();
		
		userService.delete(InsertionTest.users.get(0));
		
		assertFalse(actualSize > InsertionTest.users.size());
	}
	
	
	ClassPathXmlApplicationContext applicationContext;

	UserService userService;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:/security-module-config.xml");
		userService = applicationContext.getBean(UserService.class);
	}

	@After
	public void tearDown() throws Exception {
		applicationContext.close();
	}
}
