package Loocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");

driver.findElement(By.xpath("//input[@name='email']")).sendKeys("yogitanalable@gmail.com");

driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("yogita");

driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();


	}
	

}
