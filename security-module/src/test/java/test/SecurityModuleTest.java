package test;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import etech.security.core.Authority;
import etech.security.core.User;
import etech.security.services.AuthorityService;
import etech.security.services.UserService;

public class SecurityModuleTest {

	@SuppressWarnings("resource")
	public static void main(String... args) {

		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("classpath:/security-module-config.xml");
		/*
		 * Result authorityResult = JUnitCore.runClasses(AuthoritySuite.class);
		 * 
		 * for (Failure failure : authorityResult.getFailures()) {
		 * System.out.println(failure.toString()); }
		 * 
		 * if(authorityResult.wasSuccessful())
		 * System.out.println("Authority Service Test Completed Successfully...");
		 * 
		 * 
		 * 
		 * Result providerResult = JUnitCore.runClasses(AuthoritySuite.class);
		 * 
		 * for (Failure failure : providerResult.getFailures()) {
		 * System.out.println(failure.toString()); }
		 * 
		 * if(providerResult.wasSuccessful())
		 * System.out.println("Provider Service Test Completed Successfully...");
		 */
		
		UserService userService = cxt.getBean(UserService.class);
		AuthorityService authorityService = cxt.getBean(AuthorityService.class);
		
		User user = null;
		
		for (int i = 1; i < 3; i++) {
			
			user = new User();
			
			user.setUserNameAr("User " + String.valueOf((int) (Math.random() * 100)));
			user.setUserNameEn("User " + String.valueOf((int) (Math.random() * 100)));
			
			Calendar current = Calendar.getInstance();
			current.add(Calendar.YEAR, 5);
			
			user.setUserExpiryDate(current.getTime());
			user.setUserPasswordExpiryDate(current.getTime());
			
			user.setUserNickname("User" + String.valueOf((int) (Math.random() * 100)));
			user.setUserPassword("123");
			
			List<Authority> authorities = new ArrayList<>();
			authorities.add(authorityService.getAuthorityByAuthorityID(87));
			
			assertNotNull(authorities);
			
			user.setAuthorities(authorities);
						
			userService.save(user);
			
			assertNotNull(user.getUserID());


		}
	}

}