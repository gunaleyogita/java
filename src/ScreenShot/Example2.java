
package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example2 {
	
	public static void main(String[] args) throws IOException {
		
		int TCID=102;
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		File ab = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\ScreenShot\\TestCaseId"+TCID+".JPG");
		
		FileHandler.copy(ab, dest);
		
		
		
		
	}

}
