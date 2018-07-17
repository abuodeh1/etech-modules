package test.authority;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import etech.security.core.Authority;
import etech.security.services.AuthorityService;

public class InsertionTest {

	public static ArrayList<Authority> authorities = new ArrayList<>();
	
	@Test
	public void insertTest() {

		Authority authority = null;
		
		for (int i = 1; i < 3; i++) {
			
			authority = new Authority();
			
			authority.setAuthorityCode(String.valueOf((int) (Math.random() * 100)));
			authority.setAuthorityNameAr("Auth " + String.valueOf((int) (Math.random() * 100)));
			authority.setAuthorityNameEn("Auth " + String.valueOf((int) (Math.random() * 100)));

			authorityService.save(authority);
			
			assertNotNull(authority.getAuthorityID());
			
			authorities.add(authority);

		}

	}
	
	ClassPathXmlApplicationContext applicationContext;

	AuthorityService authorityService;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:/security-module-config.xml");
		authorityService = applicationContext.getBean(AuthorityService.class);
	}

	@After
	public void tearDown() throws Exception {
		applicationContext.close();
	}

}
