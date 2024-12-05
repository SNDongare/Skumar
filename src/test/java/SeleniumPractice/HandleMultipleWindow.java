package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		String defaultWindow = driver.getWindowHandle();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		Iterator<String> itr = allWindows.iterator();
		
		itr.next();//First window Handle
		
		String childWndow = itr.next();//Second Wndow handle
		
		driver.switchTo().window(childWndow);
		
		String childWndowTitle = driver.getTitle();
		System.out.println(childWndowTitle);
		driver.close();
		
		driver.switchTo().window(defaultWindow);
		String firstWndowTitle = driver.getTitle();
		System.out.println(firstWndowTitle);
		
		driver.close();
		
		
	}

}
