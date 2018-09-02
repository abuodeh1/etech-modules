package etech.logging.security;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect 
public class LogTest {

//	pointcut allGetters() :
//		call(public * save(*));
//
//	before() : allGetters(){
//		System.out.println("Adding a new user===============================================");
//	}

	@After("execution(* *.save(..))")
	public void logAddOperation() {

		System.out.println("Adding a new user");

	}
	
	@Pointcut("call(public void testParam(int, int)) && args(myPrice, mul)")
	public void paramTest(int myPrice, int mul) {}
	
/*	@Before("paramTest(myPrice, mul)")
	public void log(int myPrice, int mul) {
		System.out.println("The price parameter is : " + myPrice*mul);
	}
	
	@Afters("call(public void testParam(int, int)) && args(myPric1e, multi)")
	public void afterAssigningPrice(int myPric1e, int multi) {
		System.out.println("After assign the price: " + myPric1e + "\t" + multi);
	}*/
	
	@Pointcut("call(* test*(..)) || call(* testParam())")
	public void test2() {}
	
	@Before("test2()")
	public void before1() {
		System.out.println("Before 1....");
	}

}
