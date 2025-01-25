package pck1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class drgdrop2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\SELENIUM DRIVERS\\chromedriver-win32\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
	Actions act=new Actions(driver);
		
        driver.get("https://jqueryui.com/droppable/");
     driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement src=driver.findElement(By.id("draggable"));
        WebElement des=driver.findElement(By.id("droppable"));
        act.dragAndDrop(src,des).build().perform();
}
}