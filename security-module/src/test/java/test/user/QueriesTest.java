package test.user;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import etech.security.core.Authority;
import etech.security.core.User;
import etech.security.services.UserService;

public class QueriesTest {

	@Test
	public void getUsersByActivityStatusTest() {
		
		boolean isActive = true;
		
		List<User> users = userService.getUsersByActivityStatus(isActive);
		
		users.stream().forEach(user -> assertTrue(user.isUserActivityStatus()==isActive) );
	
	}
	
	@Test
	public void getUserByUserIDTest(){
		
		User user = userService.getUserByUserID(InsertionTest.users.get(InsertionTest.users.size()-1).getUserID());
		
		assertNotNull(user);
		
	}

	@Test
	public void getAllUsersTest() {
		
		List<User> users = userService.getAllUsers();
		
		assertNotNull(users);
		
	}
	
	@Test
	public void getUserAuthorities(){
		
		int userID = InsertionTest.users.get(0).getUserID();
		
		List<Authority> userAuthoruities = userService.getUserAuthorities(userID);
		
		assertNotNull(userAuthoruities);
		
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
