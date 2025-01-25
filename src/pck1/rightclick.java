package pck1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;



public class rightclick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM DRIVERS\\chromedriver-win32\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
	
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement electronics=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));
		act.contextClick(electronics).build().perform();
		
		WebElement searchBox=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		act.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("mobile").build().perform();

	

	}
}
