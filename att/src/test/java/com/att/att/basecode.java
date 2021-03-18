package com.att.att;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class basecode {

	public WebDriver driver;
 	
 	//static String dir = System.getProperty("user.dir");
 	
 	@Parameters({"browser","site"})
	 	@BeforeClass
		 	public void beforeClass() {
	 		
	 		String browser= "Chrome";
	 		 String url = "https://www.att.com/";
	 
		 	 if(browser.equalsIgnoreCase("chrome") ) {
		  
		 		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 		driver= new ChromeDriver();
		 		driver.get(url);
		 		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 		driver.manage().window().maximize();
		 		driver.manage().deleteAllCookies();
			
		 	 } else if (browser.equalsIgnoreCase("Firefox")){
		 		
		 		 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver=new FirefoxDriver();
				 driver.get(url);
				 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				 driver.manage().window().maximize();
				 driver.manage().deleteAllCookies();
			 }
	  }
	
			
		/*@AfterClass
		public void teardown() {
			driver.quit();
		}*/
	
		}
	

