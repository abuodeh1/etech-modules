package test.provider;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import etech.security.core.Provider;
import etech.security.core.Specification;
import etech.security.services.ProviderService;

public class InsertionTest {

	public static ArrayList<Provider> providers = new ArrayList<>();
	
	@Test
	public void insertTest() {

		Provider provider = null;
		
		for (int i = 1; i < 3; i++) {
			
			provider = new Provider();
			
			provider.setProviderNameAr("Provider " + String.valueOf((int) (Math.random() * 100)));
			provider.setProviderNameEn("Provider " + String.valueOf((int) (Math.random() * 100)));
			
			Specification specification = new Specification();
			specification.setSpecificsCredential("welcome1");
			specification.setSpecificsHost("etech-systems.com");
			specification.setSpecificsPort(5555);
			specification.setSpecificsPrincipal("admin");
			specification.setSpecificsURI("ldap://etech-systems.com/sds");

			provider.setSpecification(specification);
			providerService.save(provider);
			
			assertNotNull(provider.getProviderID());
			
			providers.add(provider);

		}

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
