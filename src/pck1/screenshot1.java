package pck1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class screenshot1 {
	 public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM DRIVERS\\chromedriver-win32\\chromedriver.exe");
		
				WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file1,new File("C:\\image\\scrnsht.png"));
			System.out.println("screenshot saved successfully");
	
}
}