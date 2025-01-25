package pck1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class doubleclick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM DRIVERS\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement click=driver.findElement(By.xpath("//*[@id=\"double-click\"]/h2"));
		
		action.doubleClick(click).build().perform();
		


}}
