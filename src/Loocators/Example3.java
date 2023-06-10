package Loocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example3 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");

driver.findElement(By.xpath("//a[text()='Create new account']")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("yogita");

Thread.sleep(2000);

driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("nalabale");

Thread.sleep(2000);

driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("yogita@gmail.com");

Thread.sleep(2000);

driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("1234");

Thread.sleep(2000);

WebElement AB = driver.findElement(By.xpath("//select[@name='birthday_day']"));
Select birth=new Select(AB);
birth.selectByIndex(4);


	}

}
