package etech.logging.security;

import org.springframework.stereotype.Component;

@Component
public class ComponentTest {
	public String save(String a) {

		System.out.println("Hello Mohammad......");
		return a;
	}

	
	public void testParam(int price, int multiply) {
		System.out.println("The price is : " + price + "\t Multiply: " + multiply );
	}
	
	public String testParam() {
		return "welcome one";
	}
	
	public void testParamYaHello() {
		System.out.println("Ya Anna");
	}
}
