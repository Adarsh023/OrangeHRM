package com.Generic;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

public class Web_Common_Methods {
	
	static WebDriver driver;
	
	public static WebDriver getbrowser(String Browser)
	{
		if(Browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADARSH\\eclipse-workspace\\OrangeHRM\\Browser_Drivers\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("http://www.testingmasters.com/hrm/");
		   System.out.println("Chrome is launched");
		}  
		else if(Browser.equals("Firefox"))
	    {
			   System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADARSH\\eclipse-workspace\\OrangeHRM\\Browser_Drivers\\geckodriver.exe");
			   driver = new FirefoxDriver();
			   driver.get("http://www.testingmasters.com/hrm/");
			   System.out.println("Firefox is launched");
		}
		else if(Browser.equals("Internetexplorer"))
		{
			   System.setProperty("webdriver.ie.driver", "C:\\Users\\ADARSH\\eclipse-workspace\\OrangeHRM\\Browser_Drivers\\IEDriverServer.exe");
			   driver = new InternetExplorerDriver();
			   driver.get("http://www.testingmasters.com/hrm/");
			   System.out.println("InternetExplorer is launched");
		}
		else
		{
			System.out.println("Nothing is matched");
		}
		return driver;		
	}
//	public static void closebrowser()
//	{
//		driver.close();
//	}
	
	public static String gettimestgamp()
	{
		DateFormat datevalue = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentdateformat = new Date();
		return datevalue.format(currentdateformat);
	}
	public static void screenshot() {
		
	}
		public static WebDriver getsscreenshot(WebDriver driver) throws IOException  {
			
			
			TakesScreenshot ts = (TakesScreenshot)driver;
	        File screenshot = ts.getScreenshotAs(OutputType.FILE);
	        FileHandler.copy(screenshot,new File("C:\\Users\\ADARSH\\eclipse-workspace\\OrangeHRM\\Screeshot\\screenshot1.png"));
			return driver;

		}
	}


