package pck1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM DRIVERS\\chromedriver-win32\\chromedriver.exe");
	
			WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		WebElement compLink=driver.findElement(By.linkText("Computers"));
		//WebElement compLink=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
		act.moveToElement(compLink).build().perform();
		Thread.sleep(1000);
		driver.close();
	}

}
