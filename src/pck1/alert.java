package pck1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\SELENIUM DRIVERS\\chromedriver-win32\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
      
		String url = "https://demoqa.com/alerts";
		driver.get(url); 
		driver.manage().window().maximize();
		Thread.sleep(2000); 
		 //AlertBox 
		WebElement clickme1 = driver.findElement(By.xpath("//*[@id=\"alertButton\"]"));
		clickme1 .click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		// Confirm Pop-up 
		WebElement clickme3 = driver.findElement(By.id("confirmButton"));
		clickme3.click(); 
		Thread.sleep(2000);
	driver.switchTo().alert().dismiss();
	Thread.sleep(2000);
		
		// Prompt Box
		WebElement clickme4 = driver.findElement(By.xpath("//*[@id=\"promtButton\"]"));
		clickme4  .click();
		driver.switchTo().alert().sendKeys("mariyath");
		driver.switchTo().alert().accept();
		//Alert promptobj = driver.switchTo().alert();
		Thread.sleep(2000); 
		//promptobj.sendKeys("MARIYATH"); 
		Thread.sleep(2000);
		//promptobj.accept();
	}
}
