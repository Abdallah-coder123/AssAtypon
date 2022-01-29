package com.atypon.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class KeyPressPage extends TestBase{

	public KeyPressPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
}
	
	@FindBy(id="target")
	WebElement input;
	
	@FindBy(linkText="Key Presses")
	WebElement KeyPressesLink;
	
	
	public void TabPresses()
	{
		KeyPressesLink.click();
		input.sendKeys(Keys.TAB);
	}
	
	public void EnterPresses()
	{
	
		input.sendKeys(Keys.ENTER);
	}
	
	public void escapePresses()
	{
		
		input.sendKeys(Keys.ESCAPE);
	}

}
