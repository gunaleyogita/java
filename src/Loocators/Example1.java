package Loocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.instagram.com/");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("yogita");
	
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("1234");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}
}
