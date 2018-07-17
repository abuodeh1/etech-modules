package test.authority;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import etech.security.core.Authority;
import etech.security.services.AuthorityService;

public class QueriesTest {

	@Test
	public void getAthoritiesByActivityStatusTest() {
		
		boolean isActive = true;
		
		List<Authority> authorities = authorityService.getAthoritiesByActivityStatus(isActive);
		
		authorities.stream().forEach(authority -> assertTrue(authority.isAuthorityActivityStatus()==isActive) );
	
	}
	
	@Test
	public void getAuthorityByNameTest() {
		
		String name = "Auth";
		
		List<Authority> authorities = authorityService.getAuthorityByName(name+"%");
		
		authorities.stream().forEach(authority -> assertTrue(authority.getAuthorityNameEn().contains(name)) );
	}
	
	@Test
	public void getAuthorityByAuthorityIDTest() {
		
		Authority authority = authorityService.getAuthorityByAuthorityID(InsertionTest.authorities.get(InsertionTest.authorities.size()-1).getAuthorityID());
		
		assertNotNull(authority);
		
	}
	
	@Test
	public void getAuthorityByAuthorityCodeTest() {
		
		Authority authority = authorityService.getAuthorityByAuthorityCode(InsertionTest.authorities.get(InsertionTest.authorities.size()-1).getAuthorityCode());
		
		assertNotNull(authority);
		
	}

	@Test
	public void getAllAuthoritiesTest() {
		
		List<Authority> authorities = authorityService.getAllAuthorities();
		
		assertNotNull(authorities);
		
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
