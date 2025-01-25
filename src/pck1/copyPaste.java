package pck1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class copyPaste {
	public static void main(String[] args) throws InterruptedException {

   	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM DRIVERS\\chromedriver-win32\\chromedriver.exe");
	        
				WebDriver driver=new ChromeDriver();
				driver.get("https://demoqa.com/text-box");
				driver.manage().window().maximize();
				
				 // Enter the Full Name
				 WebElement fullName = driver.findElement(By.id("userName"));
				 fullName.sendKeys("Mariyath PR");
				
				 //Enter the Email
				 WebElement email=driver.findElement(By.id("userEmail"));
				 email.sendKeys("mariyathcamerinfolks@gmail.com");
				
				 // Enter the Current Address
				 WebElement currentAddress=driver.findElement(By.id("currentAddress"));
				 currentAddress.sendKeys("camerinfolks pvt ltd,kakkanad kochi");
				
				 currentAddress.sendKeys(Keys.CONTROL + "a");
				 Thread.sleep(2000);
				 currentAddress.sendKeys(Keys.CONTROL + "c");
				 Thread.sleep(2000);
				 WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));	
				 permanentAddress.sendKeys(Keys.CONTROL+"V");
				 Thread.sleep(2000);
				
}}
				







