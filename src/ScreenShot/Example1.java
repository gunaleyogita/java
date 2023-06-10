package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example1 {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		
				WebElement AB = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
				AB.click();
				
				int TCID=101;
            
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			File xy=new File("C:\\ScreenShot\\TastCaseId"+TCID+".JPG");
			
			FileHandler.copy(src, xy);
				
	
	}
}



