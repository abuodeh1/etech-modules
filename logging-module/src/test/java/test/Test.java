package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import etech.logging.core.AuditTrail;
import etech.logging.security.ComponentTest;
import etech.logging.services.AuditTrailService;

public class Test {
	
	public static void main(String...args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/logging-module-config.xml");
		
		ComponentTest componentTest = context.getBean(ComponentTest.class);
		//componentTest.save("");
		componentTest.testParam(5, 10);
		System.out.println(componentTest.testParam());
		componentTest.testParamYaHello();
		
		AuditTrailService auditTrailService = context.getBean(AuditTrailService.class);
		
		AuditTrail auditTrail = new AuditTrail();
		auditTrail.setUserID(1);
		
		auditTrailService.save(auditTrail);
		
		auditTrail.setUserID(2);
		
		auditTrailService.save(auditTrail);
		
		
	}
	
}
