package com.atypon.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class RedirectLinkPage extends TestBase{

	public RedirectLinkPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Redirect Link")
	WebElement RedirectLink;
	
	@FindBy(linkText="here")
	WebElement hereBase;
	
	
	@FindBy(linkText="200")
	WebElement status200;
	
	@FindBy(linkText="here")
	WebElement here200;
	
	@FindBy(linkText="301")
	WebElement status301;
	
	@FindBy(linkText="here")
	WebElement here301;
	
	@FindBy(linkText="404")
	WebElement status404;
	
	@FindBy(linkText="here")
	WebElement here404;
	
	public void ClickInRedirect()
	{
		RedirectLink.click();
		hereBase.click();
		
	
		status200.click();
		here200.click();
		
		status301.click();
		here301.click();
		
		status404.click();
		here404.click();
		
		
	}
	
	

}
