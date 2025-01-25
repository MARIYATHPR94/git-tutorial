package pck1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaglab_Login {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\SELENIUM DRIVERS\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); 
	// Set the path of the geckodriver executable
    //System.setProperty("webdriver.gecko.driver", "path_to_geckodriver");

    // Create an instance of FirefoxDriver
   // WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000); 
	driver.findElement(By.id("user-name")).click();
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(2000); 
	//WebElement user=driver.findElement(By.id("user-name"));
	//user.click();
	//user.sendKeys("standard_user");
	
driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	Thread.sleep(2000); 
	//WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
	//pass.click();
	//pass.sendKeys("secret_sauce");
	driver.findElement(By.name("login-button")).click();
	
	}

}
