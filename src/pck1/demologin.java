package pck1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demologin {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\SELENIUM DRIVERS\\chromedriver-win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/");
driver.manage().window().maximize();
	}

}
