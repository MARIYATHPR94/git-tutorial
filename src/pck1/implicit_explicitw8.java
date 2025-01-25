package pck1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class implicit_explicitw8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
				ChromeOptions chromeOptions = new ChromeOptions();
				 chromeOptions.addArguments("--remote-allow-origins=*");
					WebDriver driver=new ChromeDriver(chromeOptions);
				//WebDriverWait wt=new WebDriverWait(driver,25);
				
				driver.get("https://www.magneticautomation.in/2020/05/implicit-explicit-wait-example.html");
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(5));
				driver.findElement(By.xpath("//*[@id=\"post-body-6247563354204017858\"]/button")).click();
		       // WebElement E=driver.findElement(By.xpath("//*[@id=\"demo\"]"));
				WebElement E=w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=QTP")));
		        System.out.println(E.isDisplayed());
			}

		}
	}

}
