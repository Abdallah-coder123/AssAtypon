package com.atypon.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class FormAuthenticationPage extends TestBase {

	public FormAuthenticationPage() {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(linkText="Form Authentication")
	WebElement FormAuthentication;
	
	@FindBy(id="username")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(css=".radius")
	WebElement buttonLogin;
	
	//flash error
	@FindBy(css=".flash.error")
	WebElement Alert	;
	
	
	public String Login()
	{
	
		this.FormAuthentication.click();
		this.UserName.sendKeys("tomsmith ");
		this.password.sendKeys("SuperSecretPassword!");
		this.buttonLogin.click();
		String alertText=this.Alert.getText();
		return alertText;
		
		
	}
	
	
	

}
