package SeleniumPractice1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RunAnotations {

	@BeforeClass
	public void setUp() {
		System.out.println("Launching Browser and open Application URL");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Closing the Browser");
	}

	//		@BeforeMethod
	//		public void setUp() {
	//			System.out.println("Launching Browser and open Application URL");
	//		}
	//
	//		@AfterMethod
	//		public void tearDown() {
	//			System.out.println("Closing the Browser");
	//		}

	@Test
	public void loginTest() {
		System.out.println("Executing Login Test");
	}

	@Test
	public void RegisterPageTest() {
		System.out.println("Executing Register page Test");
	}

	@Test
	public void SearchPageTest() {
		System.out.println("Executing Search page Test");
	}
}


