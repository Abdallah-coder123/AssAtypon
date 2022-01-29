package com.atypon.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class BasicAuthPage extends TestBase {
	public BasicAuthPage()
	{
		PageFactory.initElements(driver, this);
	}
	 @FindBy(linkText="Basic Auth")
	    WebElement BasicAuth;
	 @FindBy(xpath="//p[contains(text(),'Congratulations! You must have the proper credenti')]")
	 WebElement Text;
	 public String BasicAuth()
	 {
		 BasicAuth.click();	 
		 //i am pass the username and password during Url
	 driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	 return Text.getText();
	 }	 

}
