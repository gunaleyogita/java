package Loocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//span[contains(text(),', sign in')]")).click();
		
		driver.findElement(By.xpath("//a[contains(@id,'createAccoun')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'ap_customer_')]")).sendKeys("yogita nalabale");
		
		
		
		
	}
}

	
