package pck1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehoverAmazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM DRIVERS\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	WebElement fresh=driver.findElement(By.xpath("//*[@id=\"nav-link-groceries\"]/span[1]"));
	
	act.moveToElement(fresh).build().perform();
	Thread.sleep(1000);
	//driver.close();

	}

}
