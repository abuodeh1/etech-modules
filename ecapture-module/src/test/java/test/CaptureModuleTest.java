package test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etech.ecapture.services.GroupServiceImpl;
/**
 * Simple tester for Spring-Data-JPA.
 **/

public class CaptureModuleTest {
	
	ClassPathXmlApplicationContext ctx;
	
	GroupServiceImpl groupServiceImpl;
	
	@Test
	public void test() {
		groupServiceImpl.findByGroupNameIgnoreLcale("D%").stream().forEach((element) -> System.out.println(element.getGroupID() + "\t\t" + element.getGroupName() + "\t\t" + element.getGroupNameAr()) );
	}
	
	
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/ecapture-module-config.xml");

        GroupServiceImpl serviceFavtory = ctx.getBean(GroupServiceImpl.class);
        serviceFavtory.findByGroupNameIgnoreLcale("D%").stream().forEach((element) -> System.out.println(element.getGroupID() + "\t\t" + element.getGroupName() + "\t\t" + element.getGroupNameAr()) );

        ctx.close();
    }
    
    @Before
    public void setup() {
    	ctx = new ClassPathXmlApplicationContext("classpath:/ecapture-module-config.xml");

        groupServiceImpl = ctx.getBean(GroupServiceImpl.class);
	}
    
    @After
    public void finalize() {
    	ctx.close();
    }
}