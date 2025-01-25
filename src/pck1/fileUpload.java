package pck1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import prjct1.InterruptedException;


public class fileUpload {
	public static void main(String[] args) throws InterruptedException {
		//cntrl+shift+o===import
		
String location="C:\\Users\\Admin\\Desktop\\SELENIUM DRIVERS\\chromedriver-win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", location);
		
			WebDriver driver=new ChromeDriver();
			driver.get("http://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement choose=driver.findElement(By.id("file-upload"));
		choose.sendKeys("C:\\image\\pic1.jpeg");
		Thread.sleep(3000);
		WebElement upload=driver.findElement(By.id("file-submit"));
		upload.click();
	}

}
