package test.user;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import etech.security.core.Authority;
import etech.security.core.User;
import etech.security.services.UserService;

public class InsertionTest {

	public static ArrayList<User> users = new ArrayList<>();

	@Test
	public void insertTest() {

		User user = null;

		for (int i = 1; i < 3; i++) {

			user = new User();

			user.setUserNameAr("User " + String.valueOf((int) (Math.random() * 1000)));
			user.setUserNameEn("User " + String.valueOf((int) (Math.random() * 1000)));

			Calendar current = Calendar.getInstance();
			current.add(Calendar.YEAR, 5);

			user.setUserExpiryDate(current.getTime());
			user.setUserPasswordExpiryDate(current.getTime());

			user.setUserNickname("User" + String.valueOf((int) (Math.random() * 100)));
			user.setUserPassword("123");

//			List<Authority> authorities = new ArrayList<>();
//			authorities
//					.add(test.authority.InsertionTest.authorities.get(test.authority.InsertionTest.authorities.size()));
//
//			assertNotNull(authorities);
//
//			user.setAuthorities(authorities);

			userService.save(user);

			assertNotNull(user.getUserID());

			users.add(user);

		}

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
