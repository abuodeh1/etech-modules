package test.provider;

import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import etech.security.services.ProviderService;

public class DeletionTest {

	@Test
	public void deleteTest() {
		
		int actualSize = InsertionTest.providers.size();
		
		providerService.delete(InsertionTest.providers.get(0));
		
		assertFalse(actualSize > InsertionTest.providers.size());
	}
	
	
	ClassPathXmlApplicationContext applicationContext;

	ProviderService providerService;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:/security-module-config.xml");
		providerService = applicationContext.getBean(ProviderService.class);
	}

	@After
	public void tearDown() throws Exception {
		applicationContext.close();
	}
}
