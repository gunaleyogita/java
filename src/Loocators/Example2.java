package Loocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {
	
	public static void main(String[] args) throws InterruptedException {
		
	
WebDriver driver=new ChromeDriver();
driver.get("https://www.instagram.com/accounts/emailsignup/");

Thread.sleep(3000);

driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']")).sendKeys("pranjal");

driver.findElement(By.xpath("//input[@aria-label='Full Name']")).sendKeys("yogita gunale");

driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("yogita");

driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("123456");

driver.findElement(By.xpath("//button[text()='Sign up']")).click();

}
}







