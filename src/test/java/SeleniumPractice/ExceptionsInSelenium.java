package SeleniumPractice;

public class ExceptionsInSelenium {
//
//	@Test
//  public void testTheException(){
//        // Setup ChromeDriver using WebDriverManager
//        WebDriverManager.edgedriver().setup();

        // Initialize WebDriver
//        WebDriver driver = new EdgeDriver();

        // Maximize browser window
//        driver.manage().window().maximize();

        // Navigate to the login page
//        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        
//        driver.get("https://omayo.blogspot.com/");

        // Uncomment the lines below to handle different exceptions

//         No Such Element Exception
//         driver.findElement(By.linkText("Logind")).click();

//        // No Such Window Exception
//         driver.switchTo().window("abcd");

//        // No Such Frame Exception
//         driver.switchTo().frame("abcd");

//        // No Alert Present Exception
//         driver.switchTo().alert();
        
//        Invalid Selector Exception
//        driver.findElement(By.xpath("///input[@value='Login']")).click();
        
//        Element Not Interactable Exception
//        driver.findElement(By.xpath("//h2[text()='Hidden Button']")).click();

        // Close the browser
//        driver.quit();
        
//        NoSuchSessionException;
//        driver.findElement(By.xpath("///input[@value='Login']")).click();
        
        
//       Array Index Out of Bounds Exception(This exception occures if size of array is 4 then we 
//        fetch the data from array more that size then system shows the exception Array Index Outs Bounds exception
        public static void main(String[] args) {

    		int a[]= {5,6,8,9,3};
    		
    		int sum=0;
    		
    		for(int i=0;i<=a.length;i++) {
    			sum=sum+a[i];
    		}
    		
    		System.out.println("The Sum off array is:"+sum);
    	}
    }

