package method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("yogita");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("nalabale");
		
		driver.findElement(By.xpath("//input[@name='business_name']")).sendKeys("student");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("yogita@123");
		
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("6");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='demo']")).click();
		
	}

}
