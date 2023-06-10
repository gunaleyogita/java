package method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
	Thread.sleep(3000);
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.navigate().back();		
	}
}
