package test.authority;

import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import etech.security.services.AuthorityService;

public class DeletionTest {

	@Test
	public void deleteTest() {
		
		int actualSize = InsertionTest.authorities.size();
		
		authorityService.delete(InsertionTest.authorities.get(0));
		
		assertFalse(actualSize > InsertionTest.authorities.size());
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
