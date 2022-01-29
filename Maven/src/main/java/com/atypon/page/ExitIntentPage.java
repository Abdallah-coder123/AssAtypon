package com.atypon.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class ExitIntentPage extends TestBase{

	public ExitIntentPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Exit Intent")
	WebElement ExitIntentLinks;
	@FindBy(xpath="//p[normalize-space()='Close']")
	WebElement PoupClose;
	public void MouseOutOfTheViewport() throws InterruptedException
	{
		ExitIntentLinks.click();
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.moveByOffset(600, -1).build().perform();
		PoupClose.click();
		
		

	}

}
