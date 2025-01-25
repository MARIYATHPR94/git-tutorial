package pck1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class getTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM DRIVERS\\chromedriver-win32\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
		driver.get("https://in.musafir.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	 String pageTitle=driver.getTitle();
	 System.out.println(pageTitle);
	int A= pageTitle.length();
	 System.out.println("length of the Title is:"+A);	
          String pageurl = driver.getCurrentUrl();
          System.out.println(pageurl);
          if(pageurl.equals("https://in.musafir.com/"))
          {
        	  System.out.println("actual url is same as expected url");
          }
          else
          {
        	  System.out.println("actual url is not same as expected url");
          }
          driver.close();
         
	}
}
