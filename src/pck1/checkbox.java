package pck1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM DRIVERS\\chromedriver-win32\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		WebElement bluechkbox=driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[3]"));
		
		bluechkbox.click();
		System.out.println(bluechkbox.isSelected());
		
		List<WebElement>chkList=driver.findElements(By.xpath("//input[@name='color']"));
	      for(int i=0;i<chkList.size();i++)
		{  
			chkList.get(i).click();
			System.out.println(chkList.get(i).getAttribute("value"));
		
		}}}

		
	


