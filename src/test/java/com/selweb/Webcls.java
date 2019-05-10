package com.selweb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Webcls {
	Exceldatareader testdata= new Exceldatareader();
	//login Object
	@FindBy(id="txtUsername")WebElement Username;
	@FindBy(id="txtPassword")WebElement Password;
	@FindBy(name="Submit")WebElement loginbutton;
	
	//Apply Leave
	@FindBy(id="menu_leave_viewLeaveModule")WebElement leavetab;
	@FindBy(id="menu_leave_applyLeave")WebElement applytab;
	
public void login()	
{
		String username= testdata.getstringgetdata("Sheet1", 1, 1);
		String password= testdata.getstringgetdata("Sheet1", 1, 2);
		Username.sendKeys(username);
		Password.sendKeys(password);
		loginbutton.click();
}

public void applyleave()
{
	leavetab.click();
	applytab.click();
}
	
	

}
