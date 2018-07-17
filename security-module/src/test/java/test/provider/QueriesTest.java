package test.provider;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import etech.security.core.Provider;
import etech.security.services.ProviderService;

public class QueriesTest {

	@Test
	public void getAthoritiesByActivityStatusTest() {
		
		boolean isActive = true;
		
		List<Provider> providers = providerService.getProvidersByActivityStatus(isActive);
		
		providers.stream().forEach(authority -> assertTrue(authority.isProviderActivityStatus()==isActive) );
	
	}
	
	@Test
	public void getProviderByProviderIDTest(){
		
		Provider provider = providerService.getProviderByProviderID(InsertionTest.providers.get(InsertionTest.providers.size()-1).getProviderID());
		
		assertNotNull(provider);
		
	}

	@Test
	public void getAllAuthoritiesTest() {
		
		List<Provider> providers = providerService.getAllProviders();
		
		assertNotNull(providers);
		
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
