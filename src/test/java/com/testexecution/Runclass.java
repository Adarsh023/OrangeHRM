package com.testexecution;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Generic.Web_Common_Methods;
import com.selweb.Webcls;


public class Runclass extends Web_Common_Methods {
	
	public static WebDriver driver;
	public static Webcls appcls;
	@Test(priority=0)
	public static void mainexecution() throws IOException
	{
		
		driver = Web_Common_Methods.getbrowser("Chrome");
		//Web_Common_Methods.closebrowser();
		appcls = PageFactory.initElements(driver, Webcls.class);
		appcls.login();
	}
	@Test(priority=1)
	public void leave()
	{
		appcls.applyleave();	
	}
	//Web_Common_Methods.getsscreenshot(driver);

}
