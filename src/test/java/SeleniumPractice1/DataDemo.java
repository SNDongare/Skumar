package SeleniumPractice1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		/*WebElement textbox=driver.findElement(By.id("twotabsearchtextbox"));
	    textbox.sendKeys("LapTop");
	    Thread.sleep(5000);
	    List<WebElement> search=driver.findElements(By.xpath("//div[@aria-label='laptop stand']"));
	  for(WebElement product:search) {
		  String product_name=product.getText();
		  if(product_name.equals("laptop stand")) {
			  product.click();
		  }
	  }
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	WebElement min_slid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='p_36/range-slider_slider-item_lower-bound-slider' and @class='s-range-input']")));
	System.out.println("Defoult location of slider"+min_slid.getLocation());
	  Actions act=new Actions(driver);
	  act.dragAndDropBy(min_slid,5,925);*/
		
		driver.findElement(By.id("nav-hamburger-menu")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='hmenu-item' and @data-menu-id='2']"))).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Free Streaming Music']")));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//span[text()='Listen now']")).click();
		Thread.sleep(5000);
		
		Set<String>windowid=driver.getWindowHandles();
		for(String handle:windowid) {
			 driver.switchTo().window(handle);
	         System.out.println("Current Window Title: " + driver.getTitle());

			 
			}
		
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
	    Thread.sleep(7000);
	    WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(13));
	    w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='content'])[1]")))).click();
//		driver.findElement(By.linkText("The Stories of Mahabharata")).click();

}
}
