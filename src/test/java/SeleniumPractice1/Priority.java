package SeleniumPractice1;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=2)
	public void login() {
		
		System.out.println("Executing the Login Test");
	}
	
	@Test(priority=1)
	public void registerTest() {
		
		System.out.println("Executing the Register Test");
	}
	
	@Test(priority=3)
	public void homePage() {
		
		System.out.println("Executing the HomePage Test");
	}
	
}
